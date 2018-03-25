// A robot is located at the top-left corner of a m x n grid 
// (marked 'Start' in the diagram below).
// The robot can only move either down or right at any point in time. The robot is trying to reach the bottom-right corner of the grid (marked 'Finish' in the diagram below).
// How many possible unique paths are there?
    
    
    public int uniquePaths(int m, int n) {
        
        if(m == 0 || n == 0){
            return 1;
        }
        
        // This array can be used to mock current row
        int[] results = new int[n];
        
        for(int i = 0; i < n; i++){
            results[i] = 1;
        }
        
        for(int j = 1; j < m; j++){
            for(int i = 1; i < n; i++){
                results[i] = results[i] + results[i-1];
            }
             
        }
        
        return results[n-1];
    }
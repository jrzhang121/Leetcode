    public int minPathSum(int[][] grid) {
        if(grid == null || grid.length == 0 || grid[0].length == 0){
            return 0;
        }
        
        int row = grid.length;
        int col = grid[0].length;
        
        int[] results = new int[col];
        results[0] = grid[0][0];
        
        for(int i = 1; i < col; i++){
            results[i] = results[i-1] + grid[0][i]; 
        }
        
        for(int i = 1; i < row; i++){
            results[0] = results[0] + grid[i][0];
            for(int j = 1; j < col; j++){
                results[j] = Math.min(results[j-1]+grid[i][j], results[j]+grid[i][j]);
            }
        }
        
        return results[col-1];
    }
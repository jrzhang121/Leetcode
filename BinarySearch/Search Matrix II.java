// Write an efficient algorithm that searches for a value in an m x n matrix. 
// This matrix has the following properties:
// Integers in each row are sorted in ascending from left to right.
// Integers in each column are sorted in ascending from top to bottom.

    public boolean searchMatrix(int[][] matrix, int target) {
        if(matrix == null || matrix.length == 0 || matrix[0].length == 0 ){
            return false;
        }
        
        int row = matrix.length - 1;
        int column = matrix[0].length - 1;
        
        int i = row, j = 0;
        int cur;
        
        //从左下角开始走，走到右上角
        while(i >=0 && j <= column){
            cur = matrix[i][j];
            if(cur == target){
                return true;
            } else if(cur > target){
                i--;
            } else {
                j++;
            }
        }
        
        return false;
  
    }
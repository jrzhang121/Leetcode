// Write an efficient algorithm that searches for a value in an m x n matrix. 
// This matrix has the following properties:
// Integers in each row are sorted from left to right.
// The first integer of each row is greater than the last integer of the previous row.
// Determine whether the target number is in the matrix.

    public boolean searchMatrix(int[][] matrix, int target) {
        if(matrix == null || matrix.length == 0 || matrix[0].length == 0){
            return false;
        }
        
        int start = 0;
        int end = matrix.length * matrix[0].length - 1;
        
        while(start + 1 < end){
            int mid = start + (end - start) / 2;
            int rowIndex = mid / matrix[0].length;
            int columnIndex = mid % matrix[0].length;
            if(matrix[rowIndex][columnIndex] == target){
                return true;
            } else if(matrix[rowIndex][columnIndex] < target){
                start = mid;
            } else {
                end = mid;
            }
        }
        
        if(matrix[start / matrix[0].length][start % matrix[0].length] == target){
            return true;
        }
        if(matrix[end / matrix[0].length][end % matrix[0].length] == target){
            return true;
        }
        return false;
        
        
    }
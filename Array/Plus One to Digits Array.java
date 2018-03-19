    // Given a non-negative integer represented as a non-empty array of digits, plus one to the integer.
    // You may assume the integer do not contain any leading zero, except the number 0 itself.
    // The digits are stored such that the most significant digit is at the head of the list.
    
    
    
    public int[] plusOne(int[] digits) {
        if(digits == null || digits.length == 0){
            return digits;
        }
        
        int len = digits.length - 1;
        
        for(int i = len; i >= 0; i--){
            if(digits[i] != 9){
                digits[i] += 1;
                return digits;
            } else {
                digits[i] = 0;
            }
        }
        
        int[] newArray = new int[digits.length + 1];
        newArray[0] = 1;
        for(int i = 1; i < newArray.length; i++){
            newArray[i] = 0;
        }
        return newArray;
    }
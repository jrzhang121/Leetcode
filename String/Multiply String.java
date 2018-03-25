// Given two non-negative integers num1 and num2 represented as strings, return the product of num1 and num2.
// 
// Note:
// 
// The length of both num1 and num2 is < 110.
// Both num1 and num2 contains only digits 0-9.
// Both num1 and num2 does not contain any leading zero.
// You must not use any built-in BigInteger library or convert the inputs to integer directly.  
//     
    
    
    public String multiply(String num1, String num2) {
        if(num1 == null || num2 == null){
            return null;
        }
        
        int len1 = num1.length();
        int len2 = num2.length();
        
        // We need an array for result ,result needs this length
        int[] arr = new int[len1 + len2];
        
        for(int i = len1 - 1; i >= 0; i--){
            for(int j = len2 - 1; j >= 0; j--){
                int product = (num1.charAt(i) - '0') * (num2.charAt(j) - '0');
                
                int lowIndex = i + j + 1;
                int highIndex = i + j;
                
                // sum + the carry（进位）we get from last multiplication ，
                // 下一次运算，低位会有之前的进位
                product = product + arr[lowIndex];
                
                // calculate the number to put in the current cell
                // calculate the carry to put in the cell ahead
                arr[lowIndex] = product % 10;
                arr[highIndex] = arr[highIndex] + product / 10;
            }
        }
        
        StringBuilder sb = new StringBuilder();
        for(int digit : arr){
        // this logic : we have already added nums in or the nums in is not 0 we can then add  
            if(sb.length() > 0 || digit != 0){
                sb.append(digit);
            }
        }
        
        return (sb.length()==0)? "0":sb.toString();
        
    }
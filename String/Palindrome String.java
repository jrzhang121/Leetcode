    // Given a string, determine if it is a palindrome, considering only alphanumeric characters and ignoring cases.
    // For example, "A man, a plan, a canal: Panama" is a palindrome.
    // "race a car" is not a palindrome.
    
    public boolean isPalindrome(String s) {
        if(s == null || s.length() == 0){
            return true;
        }
        
        s = s.replaceAll("[^A-Za-z0-9]", "").toLowerCase(); 
        
        int start = 0;
        int end = s.length() - 1;
        
        while(start < end){
            if(s.charAt(start) != s.charAt(end)){
                return false;
            }
            start++;
            end--;
        }
        return true;
        
    }
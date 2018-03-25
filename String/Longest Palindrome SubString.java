


int pos, max;
	  public String longestPalindrome(String s) {
	        int length = s.length();
	        // < 2 return 
	        if(length < 2){
	            return s;
	        }
	        // from middle to left and right 
	        for(int i = 0; i < length - 1; i++){
	            //odd 
	            extend(s,i,i);  // aba" starts from b
	            // even 
	            extend(s,i,i + 1);   // “abba” starts from b1 and b2

	        }
	        // longest: return from the number where it starts and the max length 
	        return s.substring(pos, pos + max);  
	    } 
	    
	    private void extend(String s, int j, int k){
	        // 如果相等就继续往两边扩展 stretch from the current char to both sides 
	        while(j >= 0 && k < s.length() && s.charAt(j) == s.charAt(k)){
	            j--;
	            k++;
	        }
	        // 然后更新
	        if(max < k - j - 1){
	            pos = j + 1;
	            max = k - j - 1;
	        }
	        
	    }

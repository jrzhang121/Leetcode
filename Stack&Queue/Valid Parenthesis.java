// Given a string containing just the characters '(', ')', '{', '}', '[' and ']', 
// determine if the input string is valid.
// The brackets must close in the correct order, "()" and "()[]{}" are all valid but "(]" and "([)]" are not.


 
    public boolean isValid(String s) {
        if(s == null || s.length() == 0){
            return true;
        }
        
        Deque<Character> stack = new ArrayDeque<Character>();
        
        for(int i = 0; i < s.length(); i++){
            char cha = s.charAt(i);
            
            // Push any open parentheses onto stack
            if(cha == '{' || cha =='[' || cha == '('){
                stack.push(cha);
            } else {  // Check stack for corresponding closing parentheses, false if not valid

                if(stack.isEmpty()){
                    return false;
                }
                
                char leftParen = stack.pop();
                if(cha == '}' && leftParen != '{'){
                    return false;
                }
                
                if(cha == ']' && leftParen != '['){
                    return false;
                }
                
                if(cha == ')' && leftParen != '('){
                    return false;
                }
                
            }
        }
        
        // return true if no open parentheses left in stack
        return stack.isEmpty();
        
        
    }
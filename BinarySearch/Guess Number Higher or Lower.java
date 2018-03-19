    
    
    public int guessNumber(int n) {
        int start = 1;
        int end = n;
        while(start + 1 < end){
            int mid = start + (end - start) / 2;
            int guess = guess(mid);
            if(guess == 0){
                return mid;
            } else if(guess == -1){
                end = mid;
            } else {
                start = mid;
            }
            
        }
        if(guess(start) == 0){
            return start;
        }
        if(guess(end) == 0){
            return end;
        }
        return -1;
    }
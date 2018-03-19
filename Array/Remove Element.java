// remove all instances of that value in-place and return the new length.   
 
    public int removeElement(int[] nums, int val) {
        if(nums.length == 0 || nums == null){
            return 0;
        }
        
        int newEnd = 0;
        for(int i = 0; i < nums.length; i++){
            if(nums[i] != val){
                nums[newEnd] = nums[i];
                newEnd++;
            }
        }
        return newEnd;
        
    }
    public int rob(int[] nums) {
        if(nums == null || nums.length == 0){
            return 0;
        }
        if(nums.length == 1){
            return nums[0];
        }
        if(nums.length == 2){
            return Math.max(nums[0], nums[1]);
        }
        
        return Math.max(robHelper(nums, 0, nums.length - 2), robHelper(nums, 1, nums.length - 1));
    }
    
    public int robHelper(int[] nums, int start, int end){
        int last2 = nums[start];
        int last1 = Math.max(nums[start + 1], last2);
        int cur = 0;
        
        for(int i = start + 2; i <= end; i++){
            cur = Math.max(nums[i] + last2, last1);
            last2 = last1;
            last1 = cur;
        }
        
        return last1;
    }
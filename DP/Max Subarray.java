    
    
    
    public int maxSubArray(int[] nums) {
        if(nums == null || nums.length == 0){
            return 0;
        }
        
        int sum = 0;
        int max = Integer.MIN_VALUE;
        
        for(int i = 0; i < nums.length; i++){
            sum = sum + nums[i];    
            if(sum > max){      // 加后，大于max则更新max
                max = sum;
            }
            if(sum <= 0){   // 每次看是否小于0，小于0不如不要, 下一个循环重新set subarray的开头
                sum = 0;
            }
        }
        
        return max;
    }
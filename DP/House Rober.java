// You are a professional robber planning to rob houses along a street. 
// Each house has a certain amount of money stashed, the only constraint stopping 
// you from robbing each of them is that adjacent houses have security system connected
//  and it will automatically contact the police if two adjacent houses were broken into 
// on the same night.
// Given a list of non-negative integers representing the amount of money of each house, 
// determine the maximum amount of money you can rob tonight without alerting the police.


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
        
        int pre2 = nums[0];
        int pre1 = Math.max(nums[0], nums[1]);
        int curMax = 0;
        
        for(int i = 2; i < nums.length; i++){
            // this means every time you calculate whether stealing the current gives you a better value or not stealing gives you a better value 

            curMax = Math.max(pre2+nums[i], pre1);    
            pre2 = pre1;
            pre1 = curMax;
        }
        
        return curMax;
}
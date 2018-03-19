    /*
    Given an array of integers sorted in ascending order, find the starting and ending position of a given target value.

    Your algorithm's runtime complexity must be in the order of O(log n).

    If the target is not found in the array, return [-1, -1].

    For example,
    Given [5, 7, 7, 8, 8, 10] and target value 8,
    return [3, 4].
    */
    
    
    public int[] searchRange(int[] nums, int target) {
        int[] results = new int[2];
        
        if(nums == null || nums.length == 0){
            results[0] = -1;
            results[1] = -1;
            return results;
        }
        
        results[0] = nums.length;
        results[1] = -1;
        
        int start = 0;
        int end = nums.length - 1;
        
        binaryHelper(nums, start, end, results, target);
        
        return (results[0] <= results[1])? results:new int[]{-1, -1};
        
    }
    
    public void binaryHelper(int[] nums, int start, int end, int[] results, int target){     
        if(start > end){
            return;
        }
        
            int mid = start + (end - start) / 2;
            if(nums[mid] < target){
                binaryHelper(nums, mid + 1, end, results, target);
            } else if(nums[mid] > target){
                binaryHelper(nums, start, mid - 1, results, target);
            } else {
                if(mid < results[0]){
                    results[0] = mid;
                    binaryHelper(nums, start, mid - 1, results, target);
                } 
                if(mid > results[1]) {
                    results[1] = mid;
                    binaryHelper(nums, mid + 1, end, results, target);
                }
            }
        
    }
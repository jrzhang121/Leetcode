// Suppose an array sorted in ascending order is rotated at some pivot unknown to you beforehand.

// (i.e., 0 1 2 4 5 6 7 might become 4 5 6 7 0 1 2).

// Find the minimum element.

// You may assume no duplicate exists in the array.
    
    
    public int findMin(int[] nums) {
        if(nums == null || nums.length == 0){   // corner case
            return -1;
        }
        
        int endNum = nums[nums.length - 1]; // record last element: still work if not rotating
        int start = 0;
        int end = nums.length - 1;
        
        while(start + 1 < end){     // approach to the broken point
            int mid = start + (end - start) / 2;
            if(nums[mid] <= endNum){
                end = mid;
            } else {
                start = mid;
            }
        }
        
        return Math.min(nums[start], nums[end]);
    }
    
    
    
    // If there is duplicate
    public int findMin(int[] nums) {
        if(nums == null || nums.length == 0){
            return -1;
        }
        
	    int start = 0;
        int end = nums.length-1;
        
	    while (start + 1 < end) {
		    int mid = start + (end - start) / 2;
		    if (nums[mid] < nums[end]) {
			    end = mid;
		    } else if (nums[mid] > nums[end]){
			    start = mid;
		    } else {  
		        end--;  //nums[mid]=nums[end] no idea, but we can eliminate the duplicate: nums[end];
		    }
	    }
	    return Math.min(nums[start], nums[end]);
    }
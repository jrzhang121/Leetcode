// Given an unsorted integer array, find the first missing positive integer.
// 
// For example,
// Given [1,2,0] return 3,
// and [3,4,-1,1] return 2.
// 
// Your algorithm should run in O(n) time and uses constant space.
	        
	   public int firstMissingPositive(int[] nums) {     
	        int i = 0;
	        // for a certain index, we put the 
	        //specific number into it
	        // each index + 1 should be the number stored in
	        // this index 
	        while (i < nums.length) {
	            // if possitive(don't worry negative numbers)
	            // and the number is less than the length(we can have an index to put)
	            // and the number is not index + 1(in this case we don't have to swap)
	            // and nums[i] != nums[nums[i] - 1] : because in this case even if you swap it changes nothing
	            if (nums[i] > 0 && nums[i] <= nums.length && nums[i] != i + 1 && nums[i] != nums[nums[i] - 1]) {
	                // swapping and value 
	                int tmp = nums[i];
	                nums[i] = nums[tmp - 1];
	                nums[tmp - 1] = tmp;
	            } else {
	                i++;
	            }
	        }
        
        
        
// 	        loop through to find the first index + 1 is not
// 	        the number stored in the index
	        for (i = 0; i < nums.length; i++) {
	            if (nums[i] != i + 1) {
	                break;
	            }
	        }
	        // index + 1 is the number! 
	        return i + 1;
	    }
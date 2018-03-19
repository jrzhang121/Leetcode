    // Given two sorted integer arrays nums1 and nums2, merge nums2 into nums1 as one sorted array.
    // Assumption: nums1 is large enough
    
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        if(nums1 == null || nums2 == null || nums2.length == 0){    // corner case
            return;
        }
        
        int end = m + n - 1;
        while(m > 0 && n > 0){      // When both array hold elements, compare and pick larger one to the merged array
            if(nums1[m - 1] >=  nums2[n - 1]){
                nums1[end] = nums1[m - 1];
                end--;
                m--;
            } else {
                nums1[end] = nums2[n - 1];
                end--;
                n--;
            }
        }
        
        while(n > 0){       // When only nums2 holds element, copy all the elements to the merged array
            nums1[end] = nums2[n - 1];
            end--;
            n--;
            
        }
        
    }
    // Given a sorted integer array without duplicates, return the summary of its ranges.
    // Input: [0,1,2,4,5,7]   Output: ["0->2","4->5","7"]
    
    public List<String> summaryRanges(int[] nums) {
        List<String> results = new ArrayList<>();
        
        if(nums == null || nums.length == 0){
            return results;
        }
        
        int start = 0;
        String str = "";
        
        for(int i = 1; i < nums.length; i++){
            if(nums[i] != nums[i-1]+1){
                if(i-1 == start){
                    str = ""+nums[start];
                    results.add(str);
                    start = i;
                } else {
                    str = nums[start] + "->" + nums[i-1];
                    results.add(str);
                    start = i;
                }
            }
        }
        
        if(nums.length-1 == start){
            str = ""+nums[start];
            results.add(str);
        } else {
            str = nums[start] + "->" + nums[nums.length-1];
            results.add(str);
        } 
        
        return results;
        
    }
    // Given a set of distinct integers, nums, return all possible subsets (the power set).

    // Note: The solution set must not contain duplicate subsets.
    
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> res = new ArrayList<>();
        if(nums == null || nums.length == 0){
            return res;
        } 
        List<Integer> list = new ArrayList<>();
        subHelper(nums, res, list, 0);
        return res;
    }
    
    private void subHelper(int[] nums, List<List<Integer>> res, List<Integer> list, int pos){
        res.add(new ArrayList<>(list));
        
        for(int i = pos; i < nums.length; i++){
            list.add(nums[i]);
            
            subHelper(nums, res, list, i+1);
            list.remove(list.size() - 1);
        }
    }
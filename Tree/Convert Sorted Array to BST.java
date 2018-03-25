public TreeNode sortedArrayToBST(int[] nums) {
        if(nums == null || nums.length == 0){
            return null;
        }
        return BSTHelper(nums, 0, nums.length - 1);
    }
    
    private TreeNode BSTHelper(int[] nums, int start, int end){
        if(start > end){
            return null;
        }
        int mid = start + (end - start) / 2;
        TreeNode root = new TreeNode(nums[mid]);
        root.left = BSTHelper(nums, start, mid - 1);
        root.right = BSTHelper(nums, mid + 1, end);
        return root;
        
    }
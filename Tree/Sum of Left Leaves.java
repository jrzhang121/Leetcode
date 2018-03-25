    // Find the sum of all left leaves in a given binary tree.
    
    
    public int sumOfLeftLeaves(TreeNode root) {
        int[] result = new int[1];
        sumHelper(root, result);
        return result[0];
    }
    
    private void sumHelper(TreeNode root, int[] result){
        if(root == null){
            return;
        }
        
        if(root.left != null && root.left.left == null && root.left.right == null){
            result[0] = result[0] + root.left.val;
        }
        
        sumHelper(root.left, result);
        sumHelper(root.right, result);
    }
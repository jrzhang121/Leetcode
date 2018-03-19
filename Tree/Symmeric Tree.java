// Given a binary tree, check whether it is a mirror of itself (ie, symmetric around its center).    
    
    public boolean isSymmetric(TreeNode root) {
        if(root == null){
            return true;
        }
        
        return helper(root.left, root.right);
    }
    
    public boolean helper(TreeNode left, TreeNode right){
        // At current level
        if(left ==  null && right == null){
            return true;
        }
        if(left == null || right == null){
            return false;
        }
        
        if(left.val != right.val){
            return false;
        }
        // Tail recursion
        return helper(left.left, right.right) && helper(left.right, right.left);
        
    
    }
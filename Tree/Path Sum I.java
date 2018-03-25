// Given a binary tree and a sum, determine if the tree has a root-to-leaf path 
// such that adding up all the values along the path equals the given sum.

    
    public boolean hasPathSum(TreeNode root, int sum) {
        if(root == null){       // corner case and base case 2 not found
            return false;
        }
        
        if(root.left == null && root.right == null && root.val == sum){
            return true;   // base case 2: found the path
        }
        
        return hasPathSum(root.left, sum - root.val) || hasPathSum(root.right, sum - root.val);
        
        
    }
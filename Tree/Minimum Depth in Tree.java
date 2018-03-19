// Given a binary tree, find its minimum depth.
// The minimum depth is the number of nodes along the shortest path from 
// the root node down to the nearest leaf node.

    public int minDepth(TreeNode root) {
        if(root == null) {   // corner case and base case 1 for node with only one child
            return 0;
        }
        if(root.left == null && root.right == null) {    // base case for leaf node
            return 1;
        }
        
        
        // At current level
        int left = minDepth(root.left);
        int right = minDepth(root.right);
    
        if(left == 0) {
            return 1 + right;   // The depth from leaf
        } else if(right == 0) {
            return 1 + left;
        } else {
            return 1 + Math.min(left, right);
        }
    }
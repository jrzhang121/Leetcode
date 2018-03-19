// Given a binary tree, find its maximum depth.
// The maximum depth is the number of nodes along the longest path from the root node down to the farthest leaf node.

    public int maxDepth(TreeNode root) {
        if(root == null){   // base case and corner case
            return 0;
        }
        
        // Bottom is level 0，every time going upper level +1
        int leftHeight = maxDepth(root.left);
        int rightHeight = maxDepth(root.right);
        return Math.max(leftHeight, rightHeight) + 1;
    }
    
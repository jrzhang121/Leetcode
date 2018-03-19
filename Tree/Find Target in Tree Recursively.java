public boolean findTargetInTree(TreeNode root, int target) {
    if(head == null){   // edge case, and base case: no target in this tree

        return false;
    }
    
    if(head.val == target){     // found target
        return true;
    }
    
    
    // found target either on left branch or right branch, return true
    boolean leftFind = findTargetInTree(root.left, target);
    boolean rightFind = findTargetInTree(root.right, target);
    
    return leftFind || rightFind;

}

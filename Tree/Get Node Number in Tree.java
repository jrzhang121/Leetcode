public int getNodeNumber(TreeNode root) {
    if(root == null){  // corner case and base case
        return 0;
    }
    
    // 2. What to do on this layer：
    // Nodes number from left and right, plus current node

    int leftSum = getNodeNumber(root.left);
    int rightSum = getNodeNumber(root.right);
    
    return 1 + leftSum + rightSum;
    
}

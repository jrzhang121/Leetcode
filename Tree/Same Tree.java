// Given two binary trees, write a function to check if they are the same or not.
// Two binary trees are considered the same if they are structurally identical and
// the nodes have the same value.

    public boolean isSameTree(TreeNode p, TreeNode q) {
        if(p == null && q == null){     // base case
            return true;
        }
        if(p == null || q == null){
            return false;
        }
        
        // At current level, two trees need to satisfy three requirements
        boolean leftSame = isSameTree(p.left, q.left);
        boolean rightSame = isSameTree(p.right, q.right);
        boolean rootSame = (p.val == q.val)? true:false;
        
        return leftSame&&rightSame&&rootSame;
    }
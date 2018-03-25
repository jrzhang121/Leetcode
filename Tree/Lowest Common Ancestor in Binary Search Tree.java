// 1. both smaller find left, 2. both bigger find right, 3. one on left one on right root is LCA


    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        if(root == null || root == null || root == null){
            return null;
        }
        
        if(p.val < root.val && q.val < root.val){
            return lowestCommonAncestor(root.left, p, q);
        } else if(p.val > root.val && q.val > root.val){
            return lowestCommonAncestor(root.right, p, q);
        } else {
            return root;
        }
    }

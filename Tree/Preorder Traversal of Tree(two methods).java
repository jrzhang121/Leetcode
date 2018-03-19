    
    // Recursively 
    public List<Integer> preorderTraversal(TreeNode root) {
        List<Integer> result = new ArrayList<>(); 
        return preHelper(root, result);
    }
    
    public List<Integer> preHelper(TreeNode root, List<Integer> result){

        result.add(root);
        if(root.left != null){
            preHelper(root.left, result);
        }
        if(root.right != null){
            preHelper(root.right, result);
        }
        
        return result;
    
    }
// Given a binary tree, return the zigzag level order traversal of its nodes' values. 
// (ie, from left to right, then right to left for the next level and alternate between).

    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        List<List<Integer>> result = new ArrayList<>();
        Queue<TreeNode> queue = new LinkedList<>();
        
        if(root == null){
            return result;
        }
        
        queue.offer(root);
        boolean addRight = false;
        
        while(!queue.isEmpty()){
            int size = queue.size();
            List<Integer> levelList = new ArrayList<>();
            
            for(int i = 0; i < size; i++){
                TreeNode node = queue.poll();             
                if(addRight){
                    levelList.add(0, node.val);
                } else {
                    levelList.add(node.val);
                }
                if(node.left != null) queue.offer(node.left);  //
                if(node.right != null) queue.offer(node.right);
                     
            }
            
            addRight = !addRight;  
            result.add(levelList);
        }
        
        return result;
    }
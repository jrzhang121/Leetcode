    public TreeNode sortedListToBST(ListNode head) {
        if(head == null){
            return null;
        }
        
        return BSTHelper(head, null);
    }
    
    private TreeNode BSTHelper(ListNode head, ListNode tail){
        if(head == tail){
            return null;
        }
        
        ListNode slow = head;
        ListNode fast = head;
        while(fast != tail && fast.next != tail){
            fast = fast.next.next;
            slow = slow.next;
        }
        
        TreeNode root = new TreeNode(slow.val);
        root.left = BSTHelper(head, slow);
        root.right = BSTHelper(slow.next, tail);
        return root;    
    }
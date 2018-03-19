    // Given linked list: 1->2->3->4->5, and n = 2.
    // After removing the second node from the end, the linked list becomes 1->2->3->5.
    
    public ListNode removeNthFromEnd(ListNode head, int n) {
        if(head == null){
            return head;
        }
        
        ListNode dummy = new ListNode(-1);
        dummy.next = head;
        ListNode start = dummy;
        ListNode end = dummy;
        
        //Move end pointer forward so that the number of nodes between start and end becomes n - 1
        int count = 0;
        while(count < n){
            end = end.next;
            count++;
        }
        
        //Move them together, maintaining the gap
        while(end.next != null){
            start = start.next;
            end = end.next;
        
        }
        
        //Skip the desired node
        start.next = start.next.next;
        return dummy.next;
    
    }
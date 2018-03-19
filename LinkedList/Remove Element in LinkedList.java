// Remove all elements from a linked list of integers that have value val.
// Example:    Given: 1 --> 2 --> 6 --> 3 --> 4 --> 5 --> 6, val = 6
// Return: 1 --> 2 --> 3 --> 4 --> 5
    
    public ListNode removeElements(ListNode head, int val) {
        if(head == null){
            return head;
        }
        
        ListNode dummy = new ListNode(-1);
        dummy.next = head;
        ListNode cur = dummy;
        
        while(cur.next != null){    // Assumption: there are duplicates in the linkedlist
            if(cur.next.val == val){
                cur.next = cur.next.next;    // don't move the scanner forward after deleting a node;
            } else {
                cur = cur.next;
            }
        }
        
        return dummy.next;
        
        
        
    }
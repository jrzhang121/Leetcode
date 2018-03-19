    // Given a list, rotate the list to the right by k places, where k is non-negative.
    // Given 1->2->3->4->5->NULL and k = 2, return 4->5->1->2->3->NULL.
    
    
    public ListNode rotateRight(ListNode head, int k) {
        if(head == null || head.next == null){
            return head;
        }
        
        ListNode cur = head;
        int size = 1;
        while(cur.next != null){    // Get to know the size of the linked list
            cur = cur.next;
            size++;
        }
        
        cur.next = head;    // Connect the tail to the head
        k = k % size;
        int count = 0;
        
        while(count < size - k){    // rotate linked list, keep size-k nodes after cur pointer
            cur = cur.next;
            head = head.next;
            count++;
        }
        
        cur.next = null;     // Disconnect tail and head
        return head;
  
    }
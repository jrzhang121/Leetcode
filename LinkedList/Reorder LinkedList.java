// Given a singly linked list L: L0→L1→…→Ln-1→Ln,
// reorder it to: L0→Ln→L1→Ln-1→L2→Ln-2→…
// You must do this in-place without altering the nodes' values.
// For example, Given {1,2,3,4}, reorder it to {1,4,2,3}.


    public void reorderList(ListNode head) {
        if(head == null || head.next == null || head.next.next == null){
            return;
        }
        
        // 1. Find the middle of linked list
        ListNode middle = findMiddle(head);
        ListNode secondHead = middle.next;
        middle.next = null;
        
        // 2. Reverse the second part
        secondHead = reverse(secondHead);
        
        // 3. Merge two linked lists
        return mergeList(head, secondHead);
        
    
    
    
    }
    
    public ListNode findMiddle(ListNode head){
        ListNode slow = head;
        ListNode fast = head;
        
        while(fast != null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;
        }
        
        return slow;
    }
    
    public ListNode reverse(ListNode head){
        if(head == null || head.next == null){
            return head;
        }
        
        ListNode pre = null;
        ListNode cur = head;
        ListNode nex;
        
        while(cur != null){
            nex = cur.next;
            cur.next = pre;
            pre = cur;
            cur = nex;
        }
        
        return pre;
    }
    
    public ListNode mergeList(ListNode head, ListNode second){
        ListNode dummy = new ListNode(-1);
        ListNode cur = dummy;
        
        while(head != null && second != null){
            cur.next = head;
            head = head.next;
            cur = cur.next;
            
            cur.next = second;
            second = second.next;
            cur = cur.next;
        
        }
        
        if(head == null){
            cur.next = second;
        }
        if(second == null){
            cur.next = head;
        }
        
        return dummy.next;
    
    
    }
    
    
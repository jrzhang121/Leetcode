    // Sort a linked list in O(n log n) time using constant space complexity.
    public ListNode sortList(ListNode head) {
        if(head == null || head.next == null){   // base case and also corner case
            return head;
        }
        
        ListNode mid = findMiddle(head);
        ListNode secondHead = mid.next;
        mid.next = null;
        
        ListNode left = sortList(head);
        ListNode right = sortList(secondHead);
        
        return merge(left, right);      
    }
    
    private ListNode findMiddle(ListNode head){
        if(head == null || head.next == null){
            return head;
        }
        
        ListNode slow = head;
        ListNode fast = head.next;
        while(fast != null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;
        }
        
        return slow;
    }
    
    private ListNode merge(ListNode first, ListNode second){
        if(first == null && second == null){
            return null;
        }
        ListNode dummy = new ListNode(-1);
        ListNode cur = dummy;
        while(first != null && second != null){
            if(first.val < second.val){
                cur.next = first;
                first = first.next;
            } else {
                cur.next = second;
                second = second.next;
            }
            cur = cur.next;
        }
        if(first == null){
            cur.next = second;
        }
        if(second == null){
            cur.next = first;
        }
        return dummy.next;
    }
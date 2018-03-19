    
    
    public ListNode mergeKLists(ListNode[] lists) {
        if(lists == null || lists.length == 0){ // corner case
            return null;
        }
        
        // Helper function to divide into k lists
        return mergeHelper(lists, 0, lists.length - 1);
    }
    
    public ListNode mergeHelper(ListNode[] lists, int start, int end){
        if(start == end){   // when only 1 list left, we get it
            return lists[start];
        }
        
        // find mid point and devide k to k / 2 lists 
        int mid = start + (end - start) / 2;
        
        // merge two lists: from the left and right 
        ListNode left = mergeHelper(lists, start, mid);
        ListNode right = mergeHelper(lists, mid+1, end);
        
        return mergeTwoLists(left, right);

    }
    
    
    //  use the function without any changes! 
	    private ListNode mergeTwoLists(ListNode l1, ListNode l2) {
	    	 // dummy is the node before the head
	        ListNode dummy = new ListNode(-1);
	        // head for keeping track of where we are 
	        ListNode head = dummy;
	        // put small number in the front of combined list
	        while(l1 != null && l2 != null) {
	        	// link smaller value behind 
	            if(l1.val < l2.val) {
	                head.next = l1;
	                l1 = l1.next;
	            } else {
	                head.next = l2;
	                l2 = l2.next;
	            }
	            // move head to next to continue to next link 
	            head = head.next;
	        }
	        // link what’s left of l1 or l2 
	        if(l1 != null) {
	            head.next = l1;
	        }   
	        if(l2 != null) {
	            head.next = l2;
	        }
	        // after dummy is our new head of linkedlist
	        return dummy.next;
	    }

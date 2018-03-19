public boolean findTarget(ListNode head, int target) {
    if(head == null){   // edge and base case, end of list
        return false;
    }
    
    if(head.val == target){  // found
        return true;
    }
    
    return findTarget(head.next, targte);   // If we couldn't find target at current level, continue to find at next level

}

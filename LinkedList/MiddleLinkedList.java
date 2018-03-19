public class MiddleLinkedList {
    /*
     * @param head: the head of linked list.
     * @return: a middle node of the linked list
     */
    public ListNode middleNode(ListNode head) {
        
        if(head == null || head.next == null){  // Corner case with no node or only one node
            return head;
        }
        
        // Two pointers
        ListNode slow = head;
        ListNode fast = head.next;
        while(fast != null && fast.next != null){
            fast = fast.next.next;
            slow = slow.next;
        }
        
        return slow;
    }
}
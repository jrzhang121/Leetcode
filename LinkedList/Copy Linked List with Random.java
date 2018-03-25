    public RandomListNode copyRandomList(RandomListNode head) {
        	if (head == null) {
	    		return head;
	    	}
	    	//  create mapping for original node to new ones
	    	  Map<RandomListNode, RandomListNode> map = new HashMap<RandomListNode, RandomListNode>();
	    	  
	    	  // deep copy all the original nodes
	    	  RandomListNode cur = head;
	    	  while (cur != null) {
	    	    map.put(cur, new RandomListNode(cur.label));
	    	    cur = cur.next;
	    	  }
	    	  
	    	  // copying all the pointers including next and random
	    	  cur = head;
	    	  while (cur != null) {
	    		// pointing the copied node's next pointer to the copied
	    		 // next node
	    	    map.get(cur).next = map.get(cur.next);
	    		// pointing the copied node's random pointer to the copied
	    		// random node
	    	    map.get(cur).random = map.get(cur.random);
	    	    // move to next
	    	    cur = cur.next;
	    	  }
	    	  // copied head 
	    	  return map.get(head);
	}
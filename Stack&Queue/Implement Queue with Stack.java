class MyQueue {
    // Push element x to the back of queue.
    Deque<Integer> stackIn = new ArrayDeque<Integer>();
    Deque<Integer> stackOut = new ArrayDeque<Integer>();
    
    public void push(int x) {
        stackIn.push(x);
    }

    // Removes the element from in peek position of queue.
    public void pop() {
        if(stackOut.isEmpty()) {
            while(!stackIn.isEmpty()) {
                stackOut.push(stackIn.pop());
            }
        }
        stackOut.pop();
    }

    // Get the peek element.
    public int peek() {
        if(stackOut.isEmpty()) {
            while(!stackIn.isEmpty()) {
                stackOut.push(stackIn.pop());
            }
        }
        return stackOut.peek();
    }

    // Return whether the queue is empty.
    public boolean empty() {
        return stackIn.isEmpty() && stackOut.isEmpty();
    }
}

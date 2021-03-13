package Stacks;

import java.util.LinkedList;
import java.util.Queue;

public class StackUsing2Queues {

	Queue<Integer> q1;
    Queue<Integer>q2;
    public void MyStack() {
        q1 = new LinkedList<>();
        q2 = new LinkedList<>();
    }
    
    /** Push element x onto stack. */
    public void push(int x) {
        q1.add(x);
        
    }
    
    /** Removes the element on top of the stack and returns that element. */
    public int pop() {
        while(q1.size()>1) {
            q2.add(q1.poll());
        }
        int x = q1.poll();
        while(!q2.isEmpty()) {
            q1.add(q2.poll());
        }
        return x;
    }
    
    /** Get the top element. */
    public int top() {
        while(q1.size()>1) {
            q2.add(q1.poll());
        }
        int x = q1.peek();
        q2.add(q1.poll());
        while(q2.size()>0) {
            q1.add(q2.poll());
        }
        return x;
    }
    
    /** Returns whether the stack is empty. */
    public boolean empty() {
        if(q1.isEmpty())
            return true;
        else
            return false;
    }
}

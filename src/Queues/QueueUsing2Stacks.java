package Queues;

import java.util.Stack;

public class QueueUsing2Stacks {

	Stack<Integer> mainS;
    Stack<Integer> helperS;
    public void MyQueue() {
      
       mainS = new Stack<>();
       helperS = new Stack<>();
        
    }
    
    /** Push element x to the back of queue. */
    public void push(int x) {
        mainS.push(x);
        
    }
    
    /** Removes the element from in front of queue and returns that element. */
    public int pop() {
        while(mainS.size() > 1){
            helperS.push(mainS.pop());
        }
         int val = mainS.pop();
        
        while(helperS.size()>0){
            mainS.push(helperS.pop());
        }
        
        return val;
        
    }
    
    /** Get the front element. */
    public int peek() {
     while(mainS.size() > 1){
            helperS.push(mainS.pop());
        }
        
        int val = mainS.peek();
        
        while(helperS.size()>0){
            mainS.push(helperS.pop());
        }
        
        return val;
    }
    
    /** Returns whether the queue is empty. */
    public boolean empty() {
        if (mainS.size()!=0) return false;
        else return true;
    
        
    }
}

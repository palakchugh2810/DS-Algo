package Queues;

import java.util.Queue;
import java.util.Stack;

public class InterLeaveQueue {

	public static void main(String[] args) {
		 Queue<Integer> q = new java.util.LinkedList<>(); 
		    q.add(11); 
		    q.add(12); 
		    q.add(13); 
		    q.add(14); 
		    q.add(15); 
		    q.add(16); 
		    q.add(17); 
		    q.add(18); 
		    q.add(19); 
		    q.add(20); 
		    interLeaveQueue(q);
	}
	public static void interLeaveQueue( Queue<Integer> q )
	{
		Stack<Integer> s = new Stack();
		Stack<Integer> s2 = new Stack();
		 Queue<Integer> q2 = new java.util.LinkedList<>(); 
		 Queue<Integer> q3 = new java.util.LinkedList<>(); 



		int size = q.size()/2;
		for(int i=0; i<size; i++)
		{
			q2.add(q.peek());
			q.poll();
		}
		for(int j=0; j<size; j++)
		{
			q3.add(q.peek());
			q.poll();
		}
		while(!q2.isEmpty() && !q3.isEmpty())
		{
			q.add(q2.peek());
			q2.poll();
			q.add(q3.peek());
			q3.poll();
		}
		System.out.println(q);
		
	}
	

}

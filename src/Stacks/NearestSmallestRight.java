package Stacks;

import java.util.ArrayList;
import java.util.Stack;
import java.util.Vector;

public class NearestSmallestRight {

	public static void main(String[] args) {
		int a[] = { 1, 3, 2, 4 };
		/*
		 * Stack<Integer> s= new Stack(); Vector<Integer> v = new Vector();
		 */
		findNSR(a);
	}

	public static ArrayList<Integer> findNSR(int a[]) {
		Stack<Integer> s = new Stack();
		Vector<Integer> v = new Vector();
		ArrayList<Integer> arr= new ArrayList<>();
		ArrayList<Integer> newArr= new ArrayList<>();

		Object[] b;

		for (int i = a.length-1; i>=0; i--) {
			if (s.isEmpty() || s.size() == 0) {
				v.add(-1);
				arr.add(-1);
			} else if (s.size() > 0 && s.peek() < a[i]) {
				v.add(s.peek());
				arr.add(s.peek());
			} else if (s.size() > 0 && s.peek() > a[i]) {
				while (s.size() > 0 && s.peek() > a[i]) {
					s.pop();

				}
				if (s.isEmpty() || s.size() == 0) {
					v.add(-1);
					arr.add(-1);
				} else {
					v.add(s.peek());
					arr.add(s.peek());

				}
			}
			s.push(a[i]);
		}

		b = v.toArray();
		/*int length = b.length;
		int intArray[] = new int[length];
		for(int i=0; i<length; i++){
	         intArray[i] = (int) b[i];
	      }
		System.out.println(intArray);*/
		System.out.println(arr);

		for(int j= arr.size()-1; j>=0; j--)
		{
			newArr.add(arr.get(j));
		}
		//need to reverse
		return newArr;

	}

}

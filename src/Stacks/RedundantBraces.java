package Stacks;

import java.util.HashMap;
import java.util.Stack;

public class RedundantBraces {

	public static void main(String[] args) {
String A="((a+b)+c)";
	}
	 public static int braces(String A) {
		 int count=0;
		 Stack<Character> stack = new Stack();
	        HashMap<Character, Character> map= new HashMap<>();
	        map.put('(', ')');
	        map.put('[', ']');
	        map.put('{','}');

		 for(int i=0; i<A.length(); i++)
		 {
			 if(map.containsKey(A.charAt(i)))
		        {
				 if(count>1)
				 {
					 return 0;
				 }
		        	stack.push(map.get(A.charAt(i)));
		        }
			 else
			 {
				 count++;
			 }
		 }
		return 1;
	    }

}

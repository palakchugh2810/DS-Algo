package Stacks;

import java.util.HashMap;
import java.util.Stack;

public class Paranthesis {

	public static void main(String[] args) {
		String s="{()}[]";
		isValid(s);
	}
	public static boolean isValid(String s) {
	       HashMap<Character, Character> map= new HashMap<>();
		     // HashMap<String, Integer> mapnew= new HashMap<>();
		      Stack<Character> st= new Stack<>();
		        map.put('(', ')');
				map.put('{', '}');
				map.put('[', ']');
				for(int i=0;i<s.length();i++){
					if(map.containsKey(s.charAt(i))){
						st.push(map.get(s.charAt(i)));
					}
					else { if(!st.isEmpty() && s.charAt(i) == st.peek())
			            {
			              st.pop();         
			            }
					else {
						return false;
					}
				 }
				}
	        return st.isEmpty() ? true: false;
	}
}

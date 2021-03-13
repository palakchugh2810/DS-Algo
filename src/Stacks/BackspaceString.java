package Stacks;

import java.util.Stack;

public class BackspaceString {

	public static void main(String[] args) {
		backspaceCompare("bxj##tw", "bxj###tw");

	}

	public static boolean backspaceCompare(String S, String T) {
		Stack<Character> s = new Stack();
		Stack<Character> t = new Stack();

		for (int i = 0; i < S.length(); i++) {
			if (S.charAt(i) == '#' && !s.isEmpty()) {
				s.pop();
			} else if(S.charAt(i) == '#'){
			}
			else{
				s.add(S.charAt(i));
			}
		}
		for (int i = 0; i < T.length(); i++) {
			if (T.charAt(i) == '#' && !t.isEmpty()) {
				t.pop();
			}
			else if(T.charAt(i) == '#'){
			}
			else {
				t.add(T.charAt(i));
			}
		}
		if(s.size()!=t.size())
		{
			return false;
		}
		while(!s.isEmpty() && !t.isEmpty())
		{
			if(s.peek()==t.peek())
			{
				s.pop();
				t.pop();
			}
			else{
				return false;
			}
		}
		return true;

	}
}

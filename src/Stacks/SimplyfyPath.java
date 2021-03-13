package Stacks;

import java.util.Stack;

public class SimplyfyPath {

	public static void main(String[] args) {
		String A = "/a/./b/../../c/";
	}

	public static String simplifyPath(String A) {

		Stack<String> stack = new Stack();
		String res = "";
		res = res + '/';

		for (int i = 0; i < A.length(); i++) {
			String temp = "";
			/*
			 * if(A.charAt(i)!='/') { temp=temp+A.charAt(i); }
			 */
			while (i < A.length() && A.charAt(i) == '/')
				i++;

			while (i < A.length() && A.charAt(i) != '/') {
				temp += A.charAt(i);
				i++;
			}

			
			if (temp.equals("..")) {
				stack.pop();
			} else if (temp.equals(".") == true)
				continue;
			else if (temp != null && temp.length() != 0) {
				stack.push(temp);
			}

		}

		Stack<String> st1 = new Stack<String>();
		while (!stack.empty()) {

			st1.push(stack.pop());
			// st.pop();
		}

		while (!st1.empty()) {

			if (st1.size() != 1)
				res += (st1.pop() + "/");
			else
				res += st1.pop();

		}
		return res;
	}

}

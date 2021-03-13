package Scalar;

import java.util.Stack;

public class WinLose {

	public static void main(String[] args) {
		int A[] = { 1, 1, 2, 2, 2 };

		solve(A);
	}

	public static String solve(int[] A) {

		Stack<Integer> sA = new Stack();
		Stack<Integer> sB = new Stack();
		int count = 0;
		System.out.println("value of a LENGTH AFTER " + (A.length));
		if ((A.length) % 2 == 0) {

			for (int i = 0; i < A.length; i++) {
				if (sA.isEmpty() || sA.size() == 0 || (A[i] == sA.peek())) {
					sA.push(A[i]);
				} else if (sB.isEmpty() || (A[i] == sB.peek())) {

					sB.push(A[i]);
				} else {
					return "LOSE";
				}

			}

		} else {
			return "LOSE";
		}
		return "WIN";
	}
}

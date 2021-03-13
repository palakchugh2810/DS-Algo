package Amdocs;

public class RecursiveFibnocci {

	public static int recursiveFibnocci(int n) {
		if (n <= 1)
		{
			return n;
		}
		
		return recursiveFibnocci(n-1) + recursiveFibnocci(n-2);
	}

	public static void main(String args[]) {
		int n = 9;
		recursiveFibnocci(n);
	}
}

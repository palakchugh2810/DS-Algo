package Amdocs;

public class Fibnocci {
	public static int fibnocci(int n) {
		int previousFibocciNumb = 0,  nextFibocciNumb= 1, sum;
        if (n == 0)
            return previousFibocciNumb;
        for (int i = 2; i <= n; i++)
        {
        	sum = previousFibocciNumb + nextFibocciNumb;
            previousFibocciNumb = nextFibocciNumb;
            nextFibocciNumb = sum;
        }
        System.out.println(nextFibocciNumb);
        return nextFibocciNumb;
    }
	

	public static void main(String args[]) {
		int n = 9;
		fibnocci(n);
	}
}

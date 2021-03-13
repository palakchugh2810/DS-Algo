/**
 * 
 */
package Arrays;

import java.util.Scanner;

/**
 * @author palak
 *
 */
public class Sqrt {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		System.out
				.println("enter number to be searched for finding perfect sq");
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		sqrt(n);
	}

	public static int sqrt(int A) {
		int i, sqrt=0;
		for (i = 0; i < A; i++) {
			if (i * i <= A) {
				sqrt=i;
				
			}

		}
		return sqrt;

	}
}

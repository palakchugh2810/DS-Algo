/**
 * 
 */
package Arrays;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Scanner;

/**
 * @author palak
 *
 */
public class TrailingZero {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		System.out.println("enter Integer");
		Scanner sc = new Scanner(System.in);
		int n =sc.nextInt();
		trailingZeroes(n);
	}
	 public static int trailingZeroes(int A) {
		int count=0;
		while(A!=0)
		{
			count =count+A/5;
			A=A/5;
			
		}
		System.out.println(count);
		return count;

}

}
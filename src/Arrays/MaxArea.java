/**
 * 
 */
package Arrays;

import java.util.Arrays;
import java.util.Scanner;

/**
 * @author palak
 *
 */
public class MaxArea {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		System.out.println("enter size of array");
		Scanner sc = new Scanner(System.in);
		int n =sc.nextInt();
		int arr[] = new int[n];
		for(int i=0; i<n;i++)
		{
			arr[i]=sc.nextInt();
		}
		maxArea(arr);
	}
	 public static int maxArea(int[] A) {
		 int area=0;
		 Arrays.sort(A);
		 area=A[(A.length-1)]*A[0];
		 
		 
		return area;
	    }
}

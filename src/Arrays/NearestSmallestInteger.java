/**
 * 
 */
package Arrays;

import java.util.Scanner;

/**
 * @author palak
 *
 */
public class NearestSmallestInteger {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		System.out.println("enter array size");
		Scanner sc= new Scanner(System.in);
		int n =sc.nextInt();
		int arr[]= new int[n];
		for(int i=0; i<n;i++)
		{
			arr[i]=sc.nextInt();
		}
		prevSmaller(arr);
	}
	 public static int[] prevSmaller(int[] A) {
			int arr[]= new int[A.length];
			
			for(int i=(A.length-1); i>0; i--)
			{
				for(int j=i-1; j>1;j--)
				{
					//if(A[i])
				}
			}
			
			return arr;

		 
	    }
	// public
}
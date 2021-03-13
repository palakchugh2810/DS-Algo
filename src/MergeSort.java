import java.util.Scanner;

/**
 * 
 */

/**
 * @author palak
 *
 */
public class MergeSort {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		System.out.println("enter array size");
		Scanner sc= new Scanner(System.in);
		int m =sc.nextInt();
		int nums2[]= new int[m];
		System.out.println("enter elements in nums2 array");

		for(int i=0; i<m;i++)
		{
			nums2[i]=sc.nextInt();
		}
		System.out.println("enter array size");
		Scanner s= new Scanner(System.in);
		int n =sc.nextInt();

		System.out.println("enter elements in nums1 array");
		int nums1[]= new int[m+n];

		for(int i=0; i<n;i++)
		{
			nums1[i]=sc.nextInt();
		}
		for(int k=n+1; k<m;k++)
		{
			
			nums1[k]=nums2[]
			
		}
		System.out.println(nums1);
		//nums1.
		//merge(arr, )
	}
	 public static void merge(int[] nums1, int m, int[] nums2, int n) {
	        
	    }

}

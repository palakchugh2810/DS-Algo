/**
 * 
 */
package Arrays;

import java.util.Scanner;

/**
 * @author palak
 *
 */
public class BinarySearch {

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
		System.out.println("enter element to be searched");
		Scanner s = new Scanner(System.in);
		int x =s.nextInt();

		int result=binarySearch(arr,0,arr.length-1,x);
		 /*if (result == -1) 
	            System.out.println("Element not present"); 
	        else
	            System.out.println("Element found at index " + result); */
	}
	
	public static int binarySearch(int arr[], int l, int r, int x) 
	{
		if(r>=0)
		{
			int mid = l + (r - l) / 2; 
			if(arr[mid]==x)
			{
				System.out.println(" Index of element is "+mid);
				return mid;
				
			}
			if(arr[mid]>x)
			{
				System.out.println("No. of operations");
				binarySearch(arr, l, mid-1, x);
			}
			if(arr[mid]<x)
			{
				System.out.println("No. of operations");
				binarySearch(arr, mid+1, r, x);

			}
		}
		return -1;
		
	}

}

/**
 * 
 */
package Arrays;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * @author palak
 *
 */
public class FindInRotate {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		System.out.println("enter size of array");
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int arr[] = new int[n];
		for (int i = 0; i < n; i++) {
			arr[i] = sc.nextInt();
		}
		System.out.println("enter element to be searched");
		Scanner s = new Scanner(System.in);
		int x = s.nextInt();
		search(arr, x);
	}

	public static int search(final int[] A, int B) {
		int mid = (0 + A.length - 1) / 2;
		int index=-1;
		int pivot = findPivot(A, mid);
	
		if((B >= A[pivot+1]) && (B <= A[A.length-1] ))
		{
			index=binarySearch(A, pivot+1, A.length-1, B);

		}
		if((B < A[pivot]) && (B > A[0] ))
		{
			index=binarySearch(A, 0, pivot - 1, B);

		}
		
		return index;
	}

	private static int findPivot(int[] A, int mid) {
		
		if (A[mid] < A[mid - 1] && A[mid] < A[mid + 1]) {
			return mid;

		}

		else if (A[mid] > A[mid + 1] && A[mid] > A[mid - 1]) {
			return findPivot(A, mid + 1);
		} else if (A[mid] > A[mid - 1] && A[mid] < A[mid + 1]) {
			return findPivot(A, mid - 1);
		}
		return mid;
	}

	private static int binarySearch(int[] A, int l, int r, int B) {
		int midElement = (l + r) / 2;
		if (B == A[midElement]) {
			return midElement;
		} else if (A[midElement] > B) {
			return binarySearch(A, 0, midElement - 1, B);
		} else if (A[midElement] < B) {
			return binarySearch(A, midElement + 1, r, B);

		}
		return midElement;
	}
}

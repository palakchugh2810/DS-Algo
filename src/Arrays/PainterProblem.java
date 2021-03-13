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
public class PainterProblem {

	/**
	 * @param args
	 */
	public static int ans = 0;
	public static void main(String[] args) {
		System.out.println("enter number of paitners");
		Scanner sc = new Scanner(System.in);
		int p = sc.nextInt();
		System.out.println("enter unit of time taken by paitners");
		Scanner s = new Scanner(System.in);
		int t = s.nextInt();
		System.out.println("enter size of array");
		Scanner sca = new Scanner(System.in);
		int n = sca.nextInt();
		int arr[] = new int[n];
		for (int i = 0; i < n; i++) {
			arr[i] = sc.nextInt();
		}
		paint(p, t, arr);

	}

	public static int paint(int A, int B, int[] C) {
		Arrays.sort(C);
		int sum = 0;
		int l = C[C.length - 1];
		for (int i = 0; i < C.length; i++) {
			sum = sum + C[i];
		}
		int h = sum;

		binarySearch(A, l, h, C);
		return B;
	}

	public static int binarySearch(int A, int l, int h, int[] C) {
		int mid = (l + h) / 2;
		int sum = 0, countPainter = 1 ;
		for (int i = 0; i < C.length; i++) {

			sum = sum + C[i];
			if (mid == sum) {
				if ((countPainter + 1) <= A) {
					countPainter++;
					sum = 0;
				}
				ans = mid;
			}
			else if (mid < sum) {

				if ((countPainter + 1) <= A && i == (C.length - 1)) {
					countPainter++;
					ans = mid;
					binarySearch(A, l, mid - 1, C);
				} else if ((countPainter + 1) <= A && i!=(C.length - 1)) {
					countPainter++;
					sum = 0;

				} else if ((countPainter + 1) > A) {
					binarySearch(A, mid + 1, h, C);

				}
			}
			else if(mid > sum && (countPainter + 1) > A)
			{
				binarySearch(A, mid + 1, h, C);
			}
		}
		return ans;

	}
}

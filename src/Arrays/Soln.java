/**
 * 
 */
package Arrays;

import java.util.Scanner;

/**
 * @author palak
 *
 */
public class Soln {

	/**
	 * @param args
	 */
	public static int ans = 0;

	public static void main(String[] args) {
		System.out.println("enter size of array");
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int arr[] = new int[n];
		for (int i = 0; i < n; i++) {
			arr[i] = sc.nextInt();
		}
		// TODO Auto-generated method stub
		binarySearch(0, (arr.length - 1), arr);

	}

	/*
	 * public int findPeakElement(int[] nums) {
	 * 
	 * 
	 * binarySearch(0, ((nums.length) - l), nums);
	 * 
	 * }
	 */
	private static int binarySearch(int l, int r, int[] nums) {

		if (r >= l) {
			int mid = l + (r - l) / 2;
			if ( mid > (mid + 1)
					&& mid > (mid - 1)) {
				return ans;
			}
			if (mid == 0 && nums[mid + 1] > nums[mid]) {
				binarySearch(mid + 1, r, nums);

			} 
			if (mid == nums.length - 1 && nums[mid] < nums[mid - 1]) {

				binarySearch(0, mid - 1, nums);
			} 

		}
		return ans;
	}

}


/**
 *  public int findPeakElement(int[] nums) {
        
    if (nums.length == 1) return 0;
        
        int l = 0, r = nums.length - 1;
        
        			int mid = l + (r - l) / 2;

		if (r >= l) {
			if ( mid > (mid + 1)
					&& mid > (mid - 1)) {
				return mid;
			}
			if (nums[mid + 1] > nums[mid]) {
                mid=mid+1;

			} 
			if ( nums[mid] < nums[mid - 1]) {

				mid= mid - 1;
			} 

		}
		return mid;
}**/

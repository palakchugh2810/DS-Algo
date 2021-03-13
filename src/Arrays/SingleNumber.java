/**
 * 
 */
package Arrays;

import java.util.Scanner;

/**
 * @author palak
 *
 */
public class SingleNumber {

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
		maxSubArray(arr);
	}
		 public static int maxSubArray(int[] nums) {
			 int sum=0,temp=0;
			 for(int i =0; i<(nums.length-1); i++)
			 {
				 for(int j =i+1; j< nums.length; j++)
				 {
					 sum=sum+nums[i]+nums[j];
					 if(sum>temp)
					 {
					 temp=sum;
					 }
				 }
			 }
			 System.out.println("largest sum is "+temp);
			return temp;
		        
		    }
	

}

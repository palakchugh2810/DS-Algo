/**
 * 
 */
package Arrays;

import java.util.Scanner;

/**
 * @author palak
 *
 */
public class MaxSubArray {

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
	 /* public static int maxSubArray(int[] nums)
	  {
		  int max_so_far=0,max_subarray_ending_here=0;

		  if(nums.length==0)
		  {
			  max_so_far=nums[0];
		  }
		  for(int i=0; i< nums.length;i++)
		  {
			  max_subarray_ending_here = max_subarray_ending_here + nums[i];
			  if(max_so_far<max_subarray_ending_here)
			  {
				  max_so_far=max_subarray_ending_here;
			  }
//			  if(max_subarray_ending_here==0)
//			  {
//				  max_subarray_ending_here=0;
//			  }
		  }
		  
		  System.out.println("max so far is "+max_so_far);
		return max_so_far;
		  
	        
	    }

}*/
	
	 public static int maxSubArray(int[] arr) {
	        
	        int max_sum_so_far = arr[0];
			int max_ending_here = 0;
			
			for(int i=0;i<arr.length;i++)
			{
				max_ending_here = max_ending_here + arr[i];
				
				if(max_sum_so_far<max_ending_here)
				{
					max_sum_so_far = max_ending_here;
				}
				
				if(max_ending_here<0)
				{
					max_ending_here = 0;
				}
			}
			  System.out.println("max so far is "+max_sum_so_far);

			return max_sum_so_far;
	    }
}

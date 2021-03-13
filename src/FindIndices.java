import java.sql.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

/**
 * 
 */

/**
 * @author palak
 *
 */
public class FindIndices {

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
		System.out.println("Enter the target : the total sum");
		Scanner s= new Scanner(System.in);
		int k =s.nextInt();
		twoSum(arr,k);

	}
	 public static int[] twoSum(int[] nums, int target) {
		 ArrayList<Integer> arr= new ArrayList<>();
		 for(int i=0; i<(nums.length-1); i++)
		 {
			 for (int j=i+1; j<nums.length; j++)
			 {
				 if((nums[i]+nums[j])==target)
				 {
//					 arr.add(i);
//					 arr.add(j);
					 nums= new int[]{i,j};
					
				 }
			 }
		 }
		 System.out.println("array is"+nums);
		return nums;
	        
	    }
}

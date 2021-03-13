import java.util.Arrays;
import java.util.Scanner;
import java.util.stream.Collectors;

/**
 * 
 */

/**
 * @author palak
 *
 */
public class ContainsDuplicates {

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
		
		containsDuplicate(arr);
		

	}
	 public static boolean containsDuplicate(int[] nums) {
		 boolean flag=false;
		 for(int i=0; i<(nums.length-1); i++)
		 {
			 //Arrays.sort(nums);
			 for (int j=i+1; j<nums.length; j++)
			 {
				 if(nums[j]==nums[i])
				 {
					 flag=true;
					 System.out.println(" duplicate flag = "+flag);

					 return flag;
				 }
				 
			 }
		 }
		 System.out.println(" duplicate flag = "+flag);
		return flag;
	        
	    }

}

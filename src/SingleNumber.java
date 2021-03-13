import java.util.Scanner;

/**
 * 
 */

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
		int n =sc.nextInt();
		int arr[] = new int[n];
		for(int i=0; i<n;i++)
		{
			arr[i]=sc.nextInt();
		}
		singleNumber(arr);
		

	}
public static int singleNumber(int[] nums) {
	int singleNum=0, sngn=0;
	 for(int i=0; i<(nums.length-1); i++)
	 {
		 for (int j=i+1; j<nums.length; j++)
		 {
			 if(nums[i]!=nums[j])
			 {
				 singleNum=nums[j];
				 for(int k =j+1; k<nums.length;k++)
				 {
					 if(nums[j]!=nums[k])
					 {
						 sngn= nums[j];
					 }
				 }
				 System.out.println(" single = "+sngn);

			 }
			 
		 }
	 }
	 System.out.println(" singleNum = "+sngn);
	return sngn;
       
   }
}

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
public class NextPermutation {

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
		nextPermutation(arr);
		
	}
	 public static void nextPermutation(int[] nums) {
		 boolean nFlag=false;
		 int temp=0;
		 /*int nums1[] = nums.clone(); 
		 Arrays.sort(nums1);
		 flag=areEqual(nums,nums1);
		 if(flag)
		 {
			 int secondLast = nums[nums.length-2];
			 int last=nums[nums.length-1];
			 nums[nums.length-1]=secondLast;
			 nums[nums.length-2]=last;
			// int sum=0;
			 for(int i=0; i<nums.length; i++)
			 {
				  concat=concat+Integer.toString(nums[i]);  

			 }
			 int originalNum=Integer.parseInt(concat);*/
			 int min=nums[nums.length-1];
			 for(int j=(nums.length-1); j>0; j--)
			 {
				 if(nums[j]>nums[j-1])
				 {
					 min=Math.min(min, nums[j-1]);
					 nFlag=true;
					 temp =nums[j-1];
					 nums[j-1]=nums[j];
					 nums[j]=temp;
					 break;
				 }
				 else{
					 min=nums[j];
				 }
			 }
			 if(!nFlag)
			 {
				 Arrays.sort(nums);
			 }

		// }
		 /*else{
			 Arrays.sort(nums);
		 }*/
		 System.out.println(nums);
	        
	    }
	/* public static boolean areEqual(int arr1[], int arr2[]) 
	    { 
		
		 
		 
	        int n = arr1.length; 
	        int m = arr2.length; 
	  
	        // If lengths of array are not equal means 
	        // array are not equal 
	        if (n != m) 
	            return false; 
	  
	        // Sort both arrays 
	        
	  
	        // Linearly compare elements 
	        for (int i = 0; i < n; i++) 
	        {
	            if (arr1[i] != arr2[i]) 
	            {
	                return false;
	            }
	        
	        }
	           // If all elements were same. 
	        return true; 
	        
	           // }
	    } */

}

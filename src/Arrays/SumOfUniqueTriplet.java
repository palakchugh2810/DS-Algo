/**
 * 
 */
package Arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

/**
 * @author palak
 *
 */
public class SumOfUniqueTriplet {

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
		threeSum(arr);
	}
	 public static List<List<Integer>> threeSum(int[] nums) {
	        int sum=0,count=0;
	        Arrays.sort(nums);
	        List<Integer> OneDList= new ArrayList<Integer>();
	        List<List<Integer>> TwoDList= new ArrayList<List<Integer>>();
	        
	        for(int i=0; i<nums.length; i++)
	        {
	        	if(nums[i]!=0)
	        	{
	        		int first=0, Second=0;
	        		if(nums[i]>0)
	        		{
	        			/*if(nums[i]==sum)
	        			{
	        				OneDList = new ArrayList<>();
	        				OneDList.add(first);
	        				OneDList.add(Second);
	        				OneDList.add(nums[i]);
	        			}*/
	        			
	        		}
	        		if(i+2<nums.length)
	        		{
	        			
	        			first=nums[i];
	        			Second=nums[i+1];
	        			sum=nums[i]+nums[i+1];
	        			for(int k=i+2; k< nums.length; k++)
	        			{
	        				if(nums[k]+sum==0)
	        				{
	        					OneDList = new ArrayList<>();
		        				OneDList.add(first);
		        				OneDList.add(Second);
		        				OneDList.add(nums[k]);
		        				TwoDList.add(OneDList);

	        				}
		        		//	System.out.println("TwoDList{}: "+TwoDList);
	        			}
	        		}
	        		
	        	
	        	}
	        	if(nums[i]==0)
	        	{
	        		count++;
	        	}
	        	if(count==3)
	        	{
	        		OneDList = new ArrayList<>();

	        		OneDList.add(0);
	        		OneDList.add(0);
	        		OneDList.add(0);
    				TwoDList.add(OneDList);

	        	}
	        }
			return TwoDList;
	 }

}

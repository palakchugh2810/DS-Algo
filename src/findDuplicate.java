import java.util.ArrayList;
import java.util.Scanner;

/**
 * 
 */

/**
 * @author palak
 *
 */
public class findDuplicate {

	public static int removeDuplicates(int[] nums) {
		int a,count=0;
		ArrayList<Integer> al=new ArrayList<>();
		
		
        for(int j = 0; j<(nums.length-1);j++)
        {
        	for(int k = j+1; k<nums.length;k++)
        	{
            
        		if(nums[j]==nums[k])
        		{
        			if(!al.contains(nums[j]))
        			{
        			al.add(nums[j]);
        			}
        		}
        		if(nums[j]<nums[k])
        		{
        			if(!al.contains(nums[k]))
        			{
        			al.add(nums[k]);
        			}
        		}
        		
        	}
            
        }
        System.out.println("length of array after removing duplicate elements is "+al.size()+" values is this array "+al);
		return al.size();
    }
        public static void main(String args[])
        {
        	System.out.println("Enter number of elements to be stored in array");
         Scanner sc= new Scanner(System.in);
        int n =sc.nextInt();
        int arr[] = new int[n];
        
        for(int i=0; i<n; i++)
        {
            arr[i]=sc.nextInt();
        }
            
           removeDuplicates(arr);
        }
    

}

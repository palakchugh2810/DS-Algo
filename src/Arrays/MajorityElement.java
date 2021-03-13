/**
 * 
 */
package Arrays;

import java.util.Scanner;

/**
 * @author palak
 *
 */
public class MajorityElement {

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
		majorityElement(arr);
	}
public static int majorityElement(int[] nums) {
	
	int majority_element=nums[0],count=1;
    for(int i=0;i<nums.length;i++)
    {
        if(majority_element!=nums[i])
        {
            count--;
            if(count==0)
            {
                majority_element=nums[i];
                count=1;
            } 
        }
        else
        {
            count++;
        }
    }
    System.out.println("majority element is "+majority_element);
     return majority_element;   
}
}

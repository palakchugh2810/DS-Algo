/**
 * 
 */
package Arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Scanner;
import java.util.Set;

/**
 * @author palak
 *
 */
public class SortByColor {

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
		ArrayList<Integer> intList = new ArrayList<Integer>(arr.length);
        /*Set<Integer> aSet = new HashSet<Integer>(intList);
        aSet.*/

		for (int j : arr)
		{
		    intList.add(j);
		}
 		sortColors(intList);

        
	}
	public static void sortColors(ArrayList<Integer> a) {
	    int left = 0;
	        int right = a.size() - 1;
	        int itr = left;
	        
	        while(itr <= right) {
	            if(a.get(itr) == 0) {
	                Collections.swap(a, left, itr);
	                left++;
	                itr++;
	            } else if(a.get(itr) == 2) {
	                Collections.swap(a, itr, right);
	                right--;
	            } else {
	                itr++;
	            }
	        }
	        
	    }
}

/**
 * 
 */
package Arrays;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * @author palak
 *
 */
public class RainwaterProblem {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		System.out.println("enter size of array");
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int arr[] = new int[n];
		//ArrayList<Integer> ar=new ArrayList<>();
		for (int i = 0; i < n; i++) {
			arr[i] = sc.nextInt();
		}
		List<Integer> intList = new ArrayList<Integer>(arr.length);
		for (int i : arr)
		{
		    intList.add(i);
		}
		
		trap(intList);
	}
	public static int trap(final List<Integer> A) {
		int[] array = A.stream().mapToInt(i->i).toArray();
		int leftArr[] = new int[array.length];
		int rightArr[] = new int[array.length];
		int water=0;
		for(int i=0; i<array.length; i++)
		{
			leftArr[i] = Math.max(leftArr[i - 1], array[i]); 

		}
		rightArr[array.length - 1] = array[array.length - 1]; 
        for (int i = array.length - 2; i >= 0; i--) 
        	rightArr[i] = Math.max(rightArr[i + 1], array[i]);
        // bar will be equal to min(left[i], right[i]) - arr[i] . 
        for (int i = 0; i < array.length; i++) 
            water += Math.min(leftArr[i], rightArr[i]) - array[i]; 
  
        System.out.println("max water can be held "+water);
        return water; 

    }

}

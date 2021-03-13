/**
 * 
 */
package Arrays;

import java.util.Scanner;

/**
 * @author palak
 *
 */
public class MaxChunks {

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
		maxChunksToSorted(arr);
		
	}
	  public static int maxChunksToSorted(int[] arr) {
	        
	        int count  = 0;
	        int max = Integer.MIN_VALUE;
	     
	        for(int i = 0 ; i < arr.length; i++){
	            
	             max = Math.max(arr[i] , max);
	           
	            if(max == i){
	                count++;
	            } 
	        }

	        return count;
	    }

}

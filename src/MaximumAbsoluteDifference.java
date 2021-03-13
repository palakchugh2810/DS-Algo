import java.util.Scanner;

/**
 * 
 */

/**
 * @author palak
 *
 */
public class MaximumAbsoluteDifference {

	/**
	 * @param args
	 */
	
		static final int MAX = 10; 
	      
	    // Return maximum value of  
	    // |arr[i] - arr[j]| + |i - j| 
		public static int maxArr(int[] A, int n) 
	    { 
	        int ans = 0; 
	      
	        // Iterating two for loop,  
	        // one for i and another for j. 
	        for (int i = 0; i < A.length; i++)  
	            for (int j = 0; j < A.length; j++)  
	      
	                // Evaluating |arr[i] - arr[j]| 
	                // + |i - j| and compare with 
	                // previous maximum. 
	                ans = Math.max(ans,  
	                     Math.abs(A[i] - A[j])  
	                            + Math.abs(i - j)); 
	      
	        return ans; 
	    } 
	      
	    // Driver code 
	    public static void main (String[] args) 
	    { 
	        /*int arr[] = { 1, 2, 3, 1 }; 
	        int n =arr.length;*/ 
	        Scanner s=new Scanner(System.in);

            System.out.println("enter number of elements");

            int n=s.nextInt();

            int arr[]=new int[n];

            System.out.println("enter elements");

            for(int i=0;i<n;i++){//for reading array
                arr[i]=s.nextInt();
                System.out.println(arr[i]);
            }
	          
	        System.out.println(maxArr(arr, n)); 
	    } 
	} 
	  
/**
 * 
 */
package com.ciena.dashboard.service;

import java.util.Scanner;

/**
 * @author palak
 *
 */
public class NobleInteger {

	/**
	 * @param args
	 */
	 
	    public static void main(String args[]) 
	    { 
	       // int [] arr = {3, 2, 1, 3}; 
	        Scanner s=new Scanner(System.in);

	        System.out.println("enter number of elements");

	        int n=s.nextInt();

	        int arr[]=new int[n];

	        System.out.println("enter elements");

	        for(int i=0;i<n;i++){//for reading array
	            arr[i]=s.nextInt();
	            System.out.println(arr[i]);
	        }
	        	        int res = solve(arr); 
	       // int returnnedValue=returnMeth(res);
	        System.out.println("returned value is "+res);
	    } 
	    private static int returnMeth(int res)
	    {
	    	int count=0;
	    	 if (res != -1)
	    	 {
	    		 count=1;
		            return count;
	    	 }
		        else
		        {
		        	count=-1;
		          return count;
		        }
	    }
	    
	    public static int solve(int[] A) {
	    	 int size = A.length; 
		        for (int i = 0; i < size; i++ ) 
		        { 
		            int count = 0; 
		            for (int j = 0; j < size; j++) 
		                if (A[i] < A[j]) 
		                    count++; 
		  
		            // If count of greater elements 
		            // is equal to arr[i] 
		            if (count == A[i]) 
		                return 1; 
		        } 
		        return -1; 
	    }
	
}

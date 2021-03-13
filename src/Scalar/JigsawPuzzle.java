package Scalar;

import java.util.Arrays;

public class JigsawPuzzle {

	public static void main(String[] args) {
		int []A={10, 12, 10, 7, 5, 22};
		int B=4;
		solve(A,B);

	}
	
	 public static int solve(int[] A, int B) {
	        Arrays.sort(A);
	        int absosulteDifference=0, ans=Integer.MAX_VALUE;
	       //int bLength=B.length-1;
	        int m=B-1;
	       for(int i=0 ; i<A.length; i++)
	       {
	    	   while(m<A.length)
	    	   {
	           absosulteDifference=Math.abs(A[m]-A[i]);
	           ans=Math.min(ans,absosulteDifference);
	           m++;
	    	   }
	       }
	        
	        return ans;
	    }

}

package Scalar;

import java.util.Arrays;

public class AbsoluteDiff {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int A[] ={1,2,3,4,5};
		solve(A);

	}
	public static int solve(int A[]){
	int result=0, absval=0;
	Arrays.sort(A);
	result =  Math.abs(A[0] - A[1]);
    /*for(int i=0; i<A.length; i++)
    {
        for(int j=i+1; j<(A.length-1); j++ )
        {
          int absoluteDiff= Math.abs(A[i] - A[j]);
          if(i==0 && j==1)
          {
        	  absval=absoluteDiff;
          }
//        		   + 
//                        Math.abs(i - j);
                         result = Math.min(result,absval);
                     	

        }
    }*/
	System.out.println(result);
    return result;
	}
}

package Scalar;

import java.util.Arrays;

import Arrays.SingleNumber;

public class OnlyAppearsOnce {

	public static void main(String[] args) {
		int[] A={1,2,3,3,2,2,3};
		singleNumber(A);

	}
	public static int singleNumber(final int[] A) {
		int count=0;
        Arrays.sort(A);
        for(int i=0; i<A.length;i++)
        {
        	while(A[i+2]<A.length)
        	{
        	if(A[i]==A[i+1] && A[i]==A[i+2])
        	{
        		count++;
        		
        	}
        	else{
        		return A[i];
        	}
        	}
        }
		return 0;
    }
}

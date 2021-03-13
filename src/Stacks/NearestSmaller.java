package Stacks;

public class NearestSmaller {

	public static void main(String[] args) {
		int A[]={4,5,2,10,8};
		prevSmaller(A);
	}
	
	public static int[] prevSmaller(int[] A) {
		
		int B[]=new int[A.length];
		B[0]=-1;
		
        for(int i=(A.length-1) ; i>0;i--)
        {
            for(int j=(i-1);j>=0;j--)
            {
            	if(A[j]<A[i])
            	{
            		B[i]=A[j];
            		break;
            	}
                B[i]=-1;

            }
        }
		return B;
    }

}

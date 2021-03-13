package Scalar;

public class CountSetBits {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		solve(3);

	}

	public static int solve(int A) {
		 // Integer.toBinaryString(A);
	       int count=0,cnt=0;
	       if (A == 0)
	            return 0;
	       /*for(int j=1; j<=A; j++)
	       {
	          // int count = 0;
	          int i=j;
	        while (i > 0) {
	            count += i & 1;
	            i >>= 1;
	        }*/
	        cnt=recur(1,A,count);
	        return cnt;
	       }
	       
	    
	    
	    public static int recur(int j, int A, int count)
	    {
	    	int i=j;
	       // int count=0;
	        if(i<=A){
	        while (i > 0 && i<=A) {
	            count += i & 1;
	            i >>= 1;
	        }
	        recur(j+1,A,count);
	        }
	        return count;
	    }
}

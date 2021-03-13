package Scalar;

public class XorSum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		solve(5);

	}
	
	public static int solve(int A) {
        int s=A-1, l=A+1, sum=0, xor=0;
        while(s<A && l>A)
        {
         sum=s+l;
         xor=s^l;
        if(sum==xor)
        {
        	System.out.println(sum);
            return sum;
        }
        
        else{
        	if(s-1!=0)
        
        	{
        	s--;
        	}
        	l++;
        }
        }
        return sum;
        
    }

}

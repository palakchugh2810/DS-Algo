package Scalar;

public class Fizz {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		fizzBuzz(5);

	}
	
	 public static String[] fizzBuzz(int A) {
	       // int n =A.length;
	        String fizbz[] = new String[A];
	        for(int i=1; i<=A; i++)
	        {
	            if(i%15==0)
	            {
	                fizbz[i-1]="FizzBuzz";
	            }
	             else if(i%5==0)
	            {
	                fizbz[i-1]="Buzz";
	            }
	            else if(i%3==0)
	            {
	                fizbz[i-1]="Fizz";
	            }
	            else{
	                fizbz[i-1]=String.valueOf(i);
	            }
	        }
	        return fizbz;
	    }

}

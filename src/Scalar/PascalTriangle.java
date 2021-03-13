package Scalar;

import java.util.ArrayList;

public class PascalTriangle {

	public static void main(String[] args) {
		solve(5);
	}
	 public static ArrayList<ArrayList<Integer>> solve(int A) {
	        ArrayList<Integer> lis = new ArrayList();
	        ArrayList<ArrayList<Integer>> arr = new ArrayList();
	        int sum=0;
	        
	            
	        if(A==1)
	        {
	            lis.add(1);
	            arr.add(lis);
	            return arr;
	        }
	        else{
	        for(int i=0; i<A; i++)
	        {
                lis=new ArrayList();

	            for(int j=0; j<=i;j++)
	            {
	                if(j==0||j==i)
	                {
	                    
	                    lis.add(1);
	                }
	                else{
	                    lis.add(arr.get(i-1).get(j-1)+arr.get(i-1).get(j));
	                }
	               
	            }
	             arr.add(lis);
	        }
	        }
	        return arr;
	    }
}

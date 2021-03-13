/**
 * 
 */
package Arrays;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * @author palak
 *
 */
public class SearchMatrix {

	/**
	 * @param args
	 */
	public static void main(String[] args) 
	{
		int p, q;
		ArrayList<Integer> ar= new ArrayList<>();
        Scanner s = new Scanner(System.in);
        System.out.print("Enter number of rows in first matrix:");
        p = s.nextInt();
        System.out.print("Enter number of columns in first matrix:");
        q = s.nextInt();
       
        
            int a[][] = new int[p][q];
            /*int b[][] = new int[m][n];
            int c[][] = new int[m][n];*/
            System.out.println("Enter all the elements of first matrix:");
            for (int i = 0; i < p; i++) 
            {
                for (int j = 0; j < q; j++) 
                {
                    a[i][j] = s.nextInt();
                }
            }
            System.out.print("Enter integer to be searched ");
            int B = s.nextInt();
            searchMatrix(a,B);
            
	}
	 public static int searchMatrix(int [][] A, int B) {
	        int count = 0;
	        for(int i=0; i< A.length; i++)
	        {
	            for(int j=0; j< A[0].length; j++)
	            {
	                if(B==A[i][j])
	                {
	        	        System.out.println(count);
	        	        count=1;
	                    return count;
	                    
	                }
	                /*else
	                {
	        	        System.out.println(count);

	                    return count =0;
	                }*/
	            }
	        }
	        System.out.println(count);
	        return count;
	    }

}

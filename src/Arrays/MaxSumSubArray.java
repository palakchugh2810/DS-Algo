/**
 * 
 */
package Arrays;

import java.util.Scanner;

/**
 * @author palak
 *
 */
public class MaxSumSubArray {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int p, q, l ,r;
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
	            NumMatrix(a);
	            
	}
	 public static void NumMatrix(int[][] matrix) {
		 int m = matrix.length;
		 int n=matrix[0].length;
		 
         int a[][] = new int[m][n];
         
         for(int i=0; i<m; i++)
         {
        	 a[i][0]=matrix[i][0];
        	 for(int j=1; j< n; j++)
        	 {
        		 a[i][j]=a[i][j-1]+ matrix[i][j];
        	 }
         }
         for(int l=0; l<n; l++)
         {
        	 a[0][l]=matrix[0][l];
        	 for(int r=1; r<m;r++)
        	 {
        		a[r][l] =a[r][l-1]+a[r][l];
        	 }
         }

	        
	    }
	    
	    public static int sumRegion(int row1, int col1, int row2, int col2) {
			return col2;
	        
	        
	    }

}

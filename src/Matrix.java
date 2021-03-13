import java.util.ArrayList;
import java.util.Scanner;

/**
 * 
 */

/**
 * @author palak
 *
 */
public class Matrix {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int min=0;
		int p, q, m, n;int l=6;int rtn = 0;
		boolean flag=false;
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
            System.out.println("First Matrix:");
            for (int i = 0; i < p; i++) 
            {
                for (int j = 0; j < q; j++) 
                {
                    System.out.print(a[i][j]+" ");
                    if(a[i][j]==l)
                    {
                    	 rtn= (i*1009+j);
                    	 ar.add(rtn);
                    	 flag=true;
                    }
                    else if (flag==false)
                    {
                    	rtn=-1;
                    }
                }
                System.out.println("");
            }
            if(rtn!=-1)
            {
           /* for(int it:ar)
            {*/
            	for(int h=0;h<(ar.size()-1);h++)
            	{
            		for(int k=h+1; k<ar.size();k++)
            		{
            				
            			if(min!=0){
            				if(ar.get(h)<ar.get(k) &&ar.get(h)<min)
            				{
            					min=ar.get(h);
            				}
            				else if(ar.get(k)<ar.get(h) &&ar.get(k)<min)
            				{
            					min=ar.get(k);
            				}
            				
            			}
            			if(ar.get(h)<ar.get(k))
            			{
            				min=ar.get(h);
            			}
            			else{
            				min=ar.get(k);
            			}
            		}
            	}
           // }
            }
            System.out.println(" value of list"+ar+" returned value "+rtn+"minimum is "+min);
	}

}

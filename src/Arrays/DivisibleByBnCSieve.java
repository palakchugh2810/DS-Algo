/**
 * 
 */
package Arrays;

import java.util.Scanner;

/**
 * @author palak
 *
 */
public class DivisibleByBnCSieve {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		System.out.println("enter positive integer A ");
		Scanner sa = new Scanner(System.in);
		int A =sa.nextInt();
		System.out.println("enter positive integer B ");
		Scanner sb = new Scanner(System.in);
		int B =sb.nextInt();
		System.out.println("enter positive integer C ");
		Scanner sc = new Scanner(System.in);
		int C =sc.nextInt();
		findNumbers(A, B, C);
	}
	
	private static int findNumbers(int a, int b, int c)
	{
		
		/*if(a==1 || b==1)
		{
			return 1;
		}
		int count=0;
	    for(int i=1; i<=a; i++)
	    {
	    	if(i%b==0 && i%c==0)
	    	{
	    		count++;
	    	}
	    }
	    System.out.println(" output is "+count);
		return count;
		*/
		int count=0;
		if(a==1 ||b==1)
		{
			return 1;
		}
		count=a/(b*c);
	
		System.out.println(" output is "+count);
		return count;
	}

}

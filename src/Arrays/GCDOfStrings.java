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
public class GCDOfStrings {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		System.out.println("enter value of A");
		Scanner s = new Scanner(System.in);
		String a = s.next();
		System.out.println("enter value of B");
		Scanner sc = new Scanner(System.in);
		String b = sc.next();
		findGCDString(a,b);
	}
	
	private static String findGCDString(String a, String b)
	{
		
		
		int div=findGCDInt(a, b);
		System.out.println(div);
		return String.valueOf(div);
		
	}
	
	private static int findGCDInt(String a, String b)
	{
		int div=1,count=0;
		int A=Integer.parseInt(a);
		int B=Integer.parseInt(b);
		ArrayList<Integer> arr= new ArrayList<>();
		for(int k =A; k<=B; k++)
		{
			if(k==1)
			{
				div=1;
				return div;
			}
			arr.add(k);
		}
		/*int C=Math.min(A,B);*/
		
		for(int i=0; i<arr.size(); i++)
		{
			if(i%A==0)
			{
				count++;
			}
		}
		if(count==arr.size())
		{
			div=A;
			return div;
		}
		else{
			div=1;
			return div;
		}
		//return div;
		
	}

}

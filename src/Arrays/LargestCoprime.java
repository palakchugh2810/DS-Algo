/**
 * 
 */
package Arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

/**
 * @author palak
 *
 */
public class LargestCoprime {

	/**
	 * @param args
	 */
	public static void main(String[] args)
	{
		System.out.println("enter A digit");
		Scanner sc = new Scanner(System.in);
		int a =sc.nextInt();
		System.out.println("enter B digit");
		Scanner s = new Scanner(System.in);
		int b =s.nextInt();
		cpFact(a,b);
		

		
	}
	 public static int cpFact(int A, int B) 
	 {
		 int x=1;
		 
		 ArrayList<Integer> arr= new ArrayList<>();
		 for(int j = 1; j< A; j++)
		 {
			 if((A%j)==0)
			 {
				 arr.add(j);
			 }
		 }
		 /*int[] ar1= new int[arr.size()];
		 ar1=arr.toArray();
       	 Arrays.sort(ar1);*/
       	 Collections.sort(arr);
       	for(int i=(arr.size()-1); i>0; i--)
       	{
       		if((B % arr.get(i))!=0)
       		{
       			x=arr.get(i);
       	       	System.out.println(arr.get(i));
       			return x;
       		}
       	}
       	System.out.println(x);
       	 return x;
		
	 }

}

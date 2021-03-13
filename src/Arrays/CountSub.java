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
public class CountSub {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
 		 ArrayList<Integer> arrB= new ArrayList<>();
 		 int B= 10;
 		 arrB.add(1);
 		 arrB.add(2);
 		 arrB.add(3);
 		 arrB.add(4);


		solve(arrB, B);
	}
	public static int solve(ArrayList<Integer> A, int B) {
        int n=A.size();
   int sum;
   int count=0;
   for(int i=0;i<n;i++)
   {
       sum=0;
       for(int j=i;j<n;j++)
       {
           sum=sum+A.get(j);
           if(sum<B)
           {
               count++;
              
           }
           else
               break;
       }
   }
   return count;
}

}

/**
 * 
 */
package Arrays;

import java.util.Arrays;
import java.util.Scanner;

/**
 * @author palak
 *
 */
public class findNonDuplicate {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		System.out.println("enter size of array");
		Scanner sc = new Scanner(System.in);
		int n =sc.nextInt();
		int arr[] = new int[n];
		for(int i=0; i<n;i++)
		{
			arr[i]=sc.nextInt();
		}
		singleNumber(arr);
	}
	public static int singleNumber(final int[] A) {
		int i =0;
        Arrays.sort(A);
        if(A.length==1)
        {
            return A[0];
        }
        while(i<A.length && A.length!=1){
        if((i+1)<A.length && (i+2)<A.length && A[i]==A[i+1] && A[i]==A[i+2])
        {
            i=i+3;
        }
        else{
            return A[i];
        }
       /* for(int i=0; i<(A.length-1); i++;)
        {
            for(int j=0; j<(A.length); j++;)
            {
                boolean retval = arrlist.contains(10); 
                if(A[i]==A[j])
                {
                    
                }
            }

        }*/
        }
        return A[i];
    }

}

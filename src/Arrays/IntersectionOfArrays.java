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
public class IntersectionOfArrays {

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
		System.out.println("enter size of second array");
		Scanner s = new Scanner(System.in);
		int m =sc.nextInt();
		int arrS[] = new int[m];
		for(int j=0; j<m;j++)
		{
			arrS[j]=s.nextInt();
		}
		
		intersect(arr,arrS);
	}
	public static int[] intersect(final int[] A, final int[] B) {
		 ArrayList<Integer> list= new ArrayList<>();

        int i=0,j=0;
          while(i<A.length&&j<B.length){
        if(A[i]==B[j]){
            list.add(A[i]);
        i++;
        j++;
        }
        else if(A[i]<B[j]){
            i++;
        }else if(A[i]>B[j]){
            j++;
        }
    }
          list.toArray();
int[]  arr=new int[list.size()];
for(int k=0;k<arr.length;k++){
    arr[k]=list.get(k);
}
    return arr;
    }
}

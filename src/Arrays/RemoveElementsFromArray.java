/**
 * 
 */
package Arrays;


import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

/**
 * @author palak
 *
 */
public class RemoveElementsFromArray {

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
		ArrayList<Integer> arrList=new ArrayList<Integer>();
		// Collections.addAll(arrList, arr); 
		/*arrList=Arrays.asList(arr);*/
		//removeElement()
	}

	 public static  int removeElement(ArrayList<Integer> a, int b) {
		 a.removeAll(Collections.singleton(b));
		 return a.size();
	    }
}

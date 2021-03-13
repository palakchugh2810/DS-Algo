package Scalar;

import java.util.ArrayList;
import java.util.Arrays;

public class Pattern {
	
	public static void main(String args[])
	{
		int [] A={1,2,3,3,5,6};
		solve(A);
	}
	/*public static ArrayList<ArrayList<Integer>> solve(int A) {
        ArrayList<Integer> arr= new ArrayList<>();
        ArrayList<ArrayList<Integer>> arr2= new ArrayList<>();
        for(int i=1;i<=A; i++)
        {
        	arr=new ArrayList<>();

            for(int j=1;j<=i;j++)
            {
                arr.add(j);

            }
            arr2.add(arr);

        }
        return arr2;
    }*/
	public static int solve(int[] A) {
        Arrays.sort(A);
        System.out.print("helooooo"+(A.length-2));
        return A.length-2;
    }
}

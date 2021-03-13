import java.util.ArrayList;
import java.util.Scanner;

/**
 * 
 */

/**
 * @author palak
 *
 */
public class RotateArray {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		System.out.println("enter array size");
		Scanner sc= new Scanner(System.in);
		int n =sc.nextInt();
		int arr[]= new int[n];
		for(int i=0; i<n;i++)
		{
			arr[i]=sc.nextInt();
		}
		System.out.println("Enter the index of rotations");
		Scanner s= new Scanner(System.in);
		int k =s.nextInt();
		rotate(arr,k);
		
	}
	 public static void rotate(int[] nums, int k){
		 ArrayList<Integer> firstList = new ArrayList<>();
		 ArrayList<Integer> secondList = new ArrayList<>();
		 ArrayList<Integer> combinedList = new ArrayList<>();
		 ArrayList<Integer> itrSecList = new ArrayList<>();
		 ArrayList<Integer> itrFirstList = new ArrayList<>();
		 ArrayList<Integer> commonList = new ArrayList<>();


		 int count=0; boolean itrFlag=false;

		 boolean flag=false;

		 /*for(int r=0; r<nums.length;r++)
		 {
			 if(r==k+1)
			 {
				 flag=true;
				 for(int m=r; m<nums.length; m++)
				 {
					 secondList.add(nums[m]);
				 }
			 }
			 else if(flag==false){
			 firstList.add(nums[r]);
			 }
		 }
		 combinedList.addAll(secondList);
		 combinedList.addAll(firstList);
		 System.out.println(" List after rotation "+combinedList);*/

		 for(Integer num : nums)
		 {
			if(count==k+1)
			{
				itrFlag=true;
			}
			if(itrFlag==true)
			{
				itrSecList.add(num);

			}
			else{
				itrFirstList.add(num);
			}
			count++; 

		 }
		 commonList.addAll(itrSecList);
		 commonList.addAll(itrFirstList);
		 System.out.println(" List after rotation "+commonList);

	 }

}

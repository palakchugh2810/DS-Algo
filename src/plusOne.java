import java.sql.Array;
import java.util.Arrays;
import java.util.Scanner;

/**
 * 
 */

/**
 * @author palak
 *
 */
public class plusOne {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		System.out.println("enter size of array");
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int arr[] = new int[n];
		for (int i = 0; i < n; i++) {
			arr[i] = sc.nextInt();
		}
		plusOne(arr);

	}
	 public static int[] plusOne(int[] digits) {
	        
	        int count=1;
	        for(int i=digits.length-1;i>=0;i--){
	            if(digits[i]!=9){
	                digits[i]= digits[i]+1;
	                return digits;
	            }
	            else{
	                digits[i]=0;
	                count+=1;
	            }
	        }
	        int[] arr=new int[count];
	        arr= Arrays.copyOf(digits, (count-1));
	        arr[0]=1;
	        
	        /*for(int j=1;j<count;j++){
	            arr[j]=0;
	        }*/
	             
	    return arr;
	    }
	/*public static int[] plusOne(int[] digits) {
		int[] newArray = null,int count=0;

		if (digits[digits.length - 1] != 9) {

			newArray = Arrays.copyOf(digits, digits.length);
			newArray[(newArray.length - 1)] = newArray[(newArray.length - 1)] + 1;
		} else {
			newArray = Arrays.copyOf(digits, digits.length + 1);
			for (int j = 1; j < digits.length; j++) {
				if(digits[j]==9 && count==0)
				{
					newArray[j]=1;
					newArray[j+1]=0;
					count++;
				}
				else if(digits[j]==9 && count!=0 )
				{
					newArray[j]=0;
				}
				newArray[(newArray.length - 2)] = 1;
				newArray[(newArray.length - 1)] = 0;
			}
		}
		System.out.println(" array after increement is " + newArray);
		return newArray;

	}*/
	

}

import java.util.ArrayList;
import java.util.Scanner;

/**
 * 
 */

/**
 * @author palak
 *
 */
public class ReverseInteger {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		System.out.println("enter array size");
		Scanner sc= new Scanner(System.in);
		int n =sc.nextInt();
		reverse(n);

	}
	public static int reverse(int x) {
		String temp = Integer.toString(x);
		String rev=new String();
		int[] newGuess = new int[temp.length()];
		for (int i = (temp.length()-1); i>=0 ; i--)
		{
		    newGuess[i] = temp.charAt(i) - '0';
		    rev=rev+Integer.toString(newGuess[i]);
		    for(int nw:newGuess)
		    {
		    	newGuess= new int[]{nw};
		    }

		}
		x=new Integer(Integer.parseInt(rev));
        System.out.println(x);
		return x;
		
	}
}

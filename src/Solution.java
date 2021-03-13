import java.util.Scanner;

/**
 * 
 */

/**
 * @author palak
 *
 */
public class Solution {

	/**
	 * @param args
	 */
	 public int lengthOfLastWord(final String a) 
	    { 
	        int len = 0; 
	  
	        /* String a is 'final'-- can not be modified 
	           So, create a copy and trim the spaces from 
	           both sides */
	        String x = a.trim(); 
	  
	        for (int i = 0; i < x.length(); i++) { 
	            if (x.charAt(i) == ' ') 
	                len = 0; 
	            else
	                len++; 
	        } 
	  
	        return len; 
	    } 
	  
	    // Driver code 
	    public static void main(String[] args) 
	    { Scanner sc= new Scanner(System.in); //System.in is a standard input stream  
    	System.out.print("Enter a string: ");  
    	String str= sc.nextLine(); 
	        String input = "Geeks For Geeks  "; 
	        Solution gfg = new Solution(); 
	        System.out.println("The length of last word is " + gfg.lengthOfLastWord(str)); 
	    } 

}

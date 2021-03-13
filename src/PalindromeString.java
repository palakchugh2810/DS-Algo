import java.util.Scanner;

/**
 * 
 */

/**
 * @author palak
 *
 */
public class PalindromeString {

	/**
	 * @param args
	 */
	
		static int isPalindrome(String A) 
	    {     int count=0;
	        int l = 0; 
	        int h = A.length()-1; 
	          
	        // Lowercase string 
	        A = A.toLowerCase(); 
	          
	        // Compares character until they are equal 
	        while(l <= h) 
	        { 
	              
	            char getAtl = A.charAt(l); 
	            char getAth = A.charAt(h); 
	              
	            // If there is another symbol in left 
	            // of sentence 
	            if (!(getAtl >= 'a' && getAtl <= 'z')||!(getAtl >= '0' && getAtl <= '9')) 
	                l++; 
	              
	            // If there is another symbol in right  
	            // of sentence 
	            else if(!(getAth >= 'a' && getAth <= 'z')||!(getAth >= '0' && getAth <= '9')) 
	                h--; 
	              
	            // If characters are equal 
	            else if( getAtl == getAth) 
	            { 
	                l++; 
	                h--; 
	            } 
	              
	            // If characters are not equal then 
	            // sentence is not palindrome 
	            else 
	            {
	            	count=0;
	                return count;
	            }
	        } 
	          
	        // Returns true if sentence is palindrome 
	        return count=1;     
	    } 
	      
	    // Driver program to test sentencePallindrome() 
	    public static void main(String[] args)  
	    { 
	    	Scanner sc= new Scanner(System.in); //System.in is a standard input stream  
	    	System.out.print("Enter a string: ");  
	    	String str= sc.nextLine(); 
	        if( isPalindrome(str)==1) 
	          System.out.println("Sentence is palindrome"); 
	        else
	          System.out.println("Sentence is not" + " " + 
	                                         "palindrome"); 
	    } 
	    
	} 
	  

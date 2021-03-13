/**
 * 
 */
package Arrays;

import java.util.Scanner;

/**
 * @author palak
 *
 */
public class SubstringWithNoDuplicate {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		System.out.println("enter value of A");
		Scanner s = new Scanner(System.in);
		String a = s.next();
		lengthOfLongestSubstring(a);
	}

	public static int lengthOfLongestSubstring(String s)
    {
		 String temp = "";
		 int max=0;
		if ( s.length() > 1) { 
		for(int i =0; i<s.length();i++)
		{
			if ( !temp.contains("" + s.charAt(i))) 
			{
                temp += "" + s.charAt(i);
            }
			else
			{
				if ( max < temp.length()) {
                    max = temp.length();
				}
                    temp = temp.substring(temp.indexOf(s.charAt(i)) + 1, temp.length());
                    
                    if ( temp.length() == 0 || !temp.contains("" + s.charAt(i)))
                    {
                        temp += s.charAt(i);
                    }
				
			/*}
				else
                {
                    temp = temp.substring(temp.indexOf(s.charAt(i)) + 1, temp.length()); 
                    
                    if (temp.length() == 0 || !temp.contains("" + s.charAt(i)))
                    {
                        temp += s.charAt(i);
                    }
                }*/
			
		}
		}
		System.out.println(" temp string is "+max);
			 if ( max < temp.length()) {
		            max = temp.length();
		        }
		}
		else if(s.length()==1){
			max = 1;
		}
		return max;
        
    }
}
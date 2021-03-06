package Scalar;

import javax.print.MultiDoc;

public class PermutationsOfString {
	
    static final int MAX = 256; 

	public static void main(String args[]) 
    { 
        String txt = "pccdpeeooadeocdoacddapacaecb"; 
        String pat = "p"; 
        search(pat, txt); 
    } 
	static boolean compare(char arr1[], char arr2[]) 
    { 
		
        for (int i = 0; i < MAX; i++) 
            if (arr1[i] != arr2[i]) 
                return false; 
        return true; 
    } 
  
    // This function search for all permutations 
    // of pat[] in txt[] 
    static int search(String pat, String txt) 
    { 
        int M = pat.length(); 
        int N = txt.length(); 
        String returnValue="";
        int lengthOfstr=0;
  
        // countP[]:  Store count of all  
        // characters of pattern 
        // countTW[]: Store count of current 
        // window of text 
        char[] countP = new char[MAX]; 
        char[] countTW = new char[MAX]; 
        for (int i = 0; i < M; i++) 
        { 
            (countP[pat.charAt(i)])++; 
            (countTW[txt.charAt(i)])++; 
        } 
  
        // Traverse through remaining characters 
        // of pattern 
        for (int i = M; i < N; i++) 
        { 
            // Compare counts of current window 
            // of text with counts of pattern[] 
            if (compare(countP, countTW)) 
            {
                returnValue=txt.substring(i - M,i); 
                lengthOfstr++;
                System.out.println(lengthOfstr);

                
            }
              
            // Add current character to current  
            // window 
            (countTW[txt.charAt(i)])++; 
  
            // Remove the first character of previous 
            // window 
            countTW[txt.charAt(i-M)]--; 
        } 
  
        // Check for the last window in text 
        if (compare(countP, countTW))
        {
        	returnValue=txt.substring((N - M),N);
        	lengthOfstr++;
            System.out.println(lengthOfstr);

        }
        System.out.println(lengthOfstr);
            return lengthOfstr;
    } 

}

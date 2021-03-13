/**
 * 
 */
package Arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

/**
 * @author palak
 *
 */
public class LetterCombination {

	/**
	 * @param args
	 */
	public static void main(String[] args) 
	{
		System.out.println("enter array size");
		Scanner sc= new Scanner(System.in);
		String n =sc.next();
		letterCombinations(n);
		
	}
    public static List<String> letterCombinations(String digits) 
    {
    	String str[] = digits.split(",");
    	List<String> al = new ArrayList<String>();
    	al = Arrays.asList(str);
    	
    	 HashMap<String, String> map = new HashMap<>(); 
    	 map.put("2", "abc");
    	 map.put("3", "def");
    	 map.put("4", "ghi");
    	 map.put("5", "jkl");
    	 map.put("6", "mno");
    	 map.put("7", "pqrs");
    	 map.put("8", "tuv");
    	 map.put("9", "wxyz");
    	 for(String s: al){
      	   System.out.println(s);
      	}
     	List<String> mapVals = new ArrayList<String>();

    	 for(int i=0; i< al.size(); i++)
    	 {
    		 if(map.containsKey(str[i]))
    				 {
    			 String val=map.get(str[i]);
    			 mapVals.add(val);
    			 
    				 }
    	 }
    	/* for(int j=0;j<mapVals.size(); j++)
    	 {
    		 
    	 }*/
    	// mapVals.toArray();
         /*List<Character> chars = new ArrayList<>(); 

    	 for(String st:mapVals ){
    	 for (char ch : st.toCharArray()) { 
    		  
             chars.add(ch); 
         } 
    	 }*/
    	 

		return null;
        
    }

	
}

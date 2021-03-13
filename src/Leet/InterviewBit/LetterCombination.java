/**
 * 
 */
package Leet.InterviewBit;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * @author palak
 *
 */
public class LetterCombination {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		System.out.println("enter array size");
		Scanner sc= new Scanner(System.in);
		String n =sc.next();
		letterCombinations(n);
	}
	
	 public static List<String> letterCombinations(String digits) {
	        
	        String map[]={"abc","def","ghi","jkl","mno","pqrs","tuv","wxyz"};
	        
	        List<String> result = new ArrayList<>();
	        
	        if(digits.length()==0)
	            return result;
	        calcpossible(result,new StringBuilder(),0,map,digits);
	        System.out.println(result);
	        return result;
	        
	    }
		
		
	    
	    
	    public static void calcpossible(List<String> result,StringBuilder currstr,int index, String map[],String digits)
	    {
	        
	        if(currstr.toString().length()==digits.length())
	        {
	            //System.out.println(currstr.toString());
	            
	            result.add(currstr.toString());
	            currstr.deleteCharAt(currstr.length()-1);
	            return;
	        }
	        char hel = digits.charAt(index);
	        
	        char letters[]=map[digits.charAt(index)-'2'].toCharArray();
	        for(char c:letters)
	        {
	            
	            currstr.append(c);
	            calcpossible(result,currstr,index+1,map,digits);
	        }
	        if(currstr.length()!=0)
	            currstr.deleteCharAt(currstr.length()-1);
	        return;
	    }
}
package Scalar;

import java.util.ArrayDeque;
import java.util.Deque;

public class validStr {

	public static void main(String[] args) {
		validate_xml("text<a>more</a>");

	}
	public static String validate_xml(String xml) {
	    // Write your code here
	    if(!xml.isEmpty())
	    {
	       // HashMap<Integer,Character> map = new HashMap<>();
	        Deque<Character> stack = new  ArrayDeque<Character>();
	        String vars="";
	        char opn='<';
	        int count=0;
	        for(int i=0; i<xml.length(); i++)
	        {
	            char x=xml.charAt(i);
	            if(x=='<'|| x=='>'|| x=='/')
	            {
	                stack.push(x);
	            }
	            else{
	                char chr=xml.charAt(i);
	                vars=Character.toString(chr);
	            }
	            char check;
	           
	            switch(x)
	            {
	            
	                case '>':
	                char curTag=stack.pop();
	                check=stack.pop();
	                System.out.println(check);
	                if(check=='/')
	                {
	                	if(!(stack.pop()!='<')){
	                    return "missing closing tag for < " +vars+ ">";
	                	}
	                }
	                else if(check=='<')
	                {
	                	count++;
	                }
	                case '/':
	                check=stack.pop();
	                if(check!='<')
	                {
	                    return "encountered closing tag without matching open tag"+vars;
	                }
	                else if(check=='<')
	                {
	                    if(stack.pop()!='>')
	                    {
	                        //String rtn=vars;
	                        return "missing closing tag for"+vars;
	                    }
	                }
	            }
	        }
	        
	    }
	    return "valid";
	    }

}

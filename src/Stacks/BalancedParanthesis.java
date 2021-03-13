package Stacks;

import java.util.HashMap;
import java.util.Stack;

public class BalancedParanthesis {

	public static void main(String[] args) {
		String A="(()())";
	}
	
	public static int solve(String A) {
        Stack<Character> stack= new Stack<>();
        HashMap<Character, Character> map= new HashMap<>();
        map.put('(', ')');
        map.put('[', ']');
        map.put('{','}');
        for(int i=0;i<A.length();i++){
        if(map.containsKey(A.charAt(i)))
        {
        	stack.push(map.get(A.charAt(i)));
        }
        else if(!stack.isEmpty() && stack.peek() == A.charAt(i))
        {
        	stack.pop();
        }
        else{
        	return 0;
        }
        }

        
		return stack.isEmpty()? 1 :0;
    }

}

package Stacks;

import java.util.Stack;

public class Pattern132 {

	public static void main(String[] args) {
		int nums[]={3,1,4,2};
		find132pattern(nums);
	}
	
    public static boolean find132pattern(int[] nums) {
        if(nums.length < 3)
           return false;
       
       Stack<Integer> stack = new Stack<>();
       int minValue = Integer.MIN_VALUE;
       
       for(int i=nums.length-1;i>=0;i--){
           if(nums[i] < minValue)
               return true;
           while(!stack.isEmpty() && nums[i] > stack.peek())
               minValue = stack.pop();
           
           stack.push(nums[i]);
       }

       return false;
       
   }

}

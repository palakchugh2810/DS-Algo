package Leet.InterviewBit;

import java.util.Arrays;

public class AbsoluteDiff {

	public static void main(String[] args) {
		int nums[] ={1,3, 1, 5,4};
		int k=2;
		findPairs(nums,k);
	}
	
	 public static int findPairs(int[] nums, int k) {
	        
		  int result = 0;
		        Arrays.sort(nums);
		        for (int left = 0; left < nums.length; left++) {
		            if (left > 0 && nums[left] == nums[left-1])
		                continue;
		            for (int right = left+1; right < nums.length; right++) {
		                int diff = Math.abs(nums[left] - nums[right]); 
		                if (diff == k)
		                    result++;
		                if (diff >= k)
		                    break;
		            }
		        }
		        return result;
		    }

}

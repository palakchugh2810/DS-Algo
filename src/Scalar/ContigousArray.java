package Scalar;

import java.util.HashMap;

public class ContigousArray {

	public static void main(String[] args) {
		int A[] = {0, 0, 0, 1, 1,0, 1, 0};		
		solve(A);
	}

	
	public static int solve(int[] A) {
		int sum=0;
		int max=0;
		HashMap<Integer, Integer> map= new HashMap<>();
		map.put(0,-1);
		for (int j = 0; j < A.length; j++) {	
			if(A[j]==1)
			{
				sum+=1;
			}
			else
			{
				sum-=1;
			}
			if(sum==0)
			{
				max=j+1;
			}
			if(map.containsKey(sum))
			{
				
				max=Math.max(max,(j-map.get(sum)));
				
			}
			map.put(sum, j);
					
		}
		System.out.println(max);
		return max;
	
	}
}

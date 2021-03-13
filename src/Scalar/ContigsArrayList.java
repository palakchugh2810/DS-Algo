package Scalar;

import java.util.ArrayList;
import java.util.HashMap;

public class ContigsArrayList {

	public static void main(String[] args) {
		ArrayList<Integer> A = new ArrayList<>();
		A.add(0);
		A.add(0);
		A.add(0);
		A.add(0);
		A.add(0);
		A.add(1);
		A.add(1);
		A.add(0);
		A.add(1);
		// TODO Auto-generated method stub
		solve(A);

	}
	public static int solve(ArrayList<Integer> A)
	{
		int ans=0;
		ArrayList<Integer> prefixSum = new ArrayList<>();
		for(int i=0; i<A.size(); i++)
		{
			if(A.get(i)==0)
				A.set(i, -1);
		}
		prefixSum.add(A.get(0));
		for(int i =1; i<A.size(); i++)
		{
			prefixSum.add(prefixSum.get(i-1)+A.get(i));
		}
		HashMap<Integer, Integer> map = new HashMap<>();
		map.put(-1,0);
		for(int i=0; i<prefixSum.size(); i++)
		{
			if(map.containsKey(prefixSum.get(i)))
			{
				int n=prefixSum.get(i);
				System.out.println("prefix sum"+prefixSum.get(i));
				System.out.println("prefix sum key"+map.get(prefixSum));
				ans= Math.max(ans, (i-map.get(n)));
			}
			else{
				map.put(prefixSum.get(i), i);
			}
		}
		System.out.println(ans);
		return ans;
	}

}

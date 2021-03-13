package Scalar;

import java.util.ArrayList;
import java.util.HashMap;

public class UniqueElement {
	
	public static void main(String args[])
	{
		ArrayList<Integer> A = new ArrayList<>();
		A.add(1);
		A.add(1);
		A.add(2);
		A.add(2);
		
		solve(A);
	}

	public static int solve(ArrayList<Integer> A) 
	{
		int count=0;
		HashMap<Integer, Integer> map= new HashMap<>();
		for(int i=0; i< A.size(); i++)
        {
			if(map.containsValue(A.get(i)))
			{
	            map.put(i, A.get(i)+1);
	            count++;
			}
			else
			{
            map.put(i, A.get(i));
			}
        }
		System.out.println(count);
		return count;
		
	}
}

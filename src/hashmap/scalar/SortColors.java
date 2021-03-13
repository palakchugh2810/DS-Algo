package hashmap.scalar;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class SortColors {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int []A ={0,1,0,0,1,2,2};
		sortColors(A);

	} 
	  public static void sortColors(int[] A) {
	        Map<String, List<Integer>> map = new HashMap<String, List<Integer>>();
	        List<Integer> listOfRed= new ArrayList<Integer>();
	        List<Integer> listOfWhite= new ArrayList<Integer>();
	        List<Integer> listOfBlue= new ArrayList<Integer>();
	        List<List<Integer>> listOfList= new ArrayList<>();


	        for(int i=0; i<A.length; i++)
	        {
	            if(A[i]==0)
	            {
	            	listOfRed.add(A[i]);
	                map.put("red",listOfRed);
	            }
	            else if(A[i]==1)
	            {
	            	listOfWhite.add(A[i]);
	                map.put("white",listOfWhite);
	            }
	            else if(A[i]==2)
	            {
	            	listOfBlue.add(A[i]);
	                map.put("blue",listOfBlue);
	            }
	        }
	        System.out.println("map.values(): "+map.values());
	        listOfList = (List<List<Integer>>) map.values();
	        
	    }
	  
}

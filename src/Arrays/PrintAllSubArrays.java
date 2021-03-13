/**
 * 
 */
package Arrays;

import java.util.ArrayList;
import java.util.List;

/**
 * @author palak
 *
 */
public class PrintAllSubArrays {

	/**
	 * @param args
	 */
	 public void printSubArrays(int [] arrA , int B){
	        List<List<Integer>> TwoDList= new ArrayList<List<Integer>>();
      		 ArrayList<Integer> arrB= new ArrayList<>();

	        int arrSize = arrA.length;
	        //start point
	        for (int startPoint = 0; startPoint <arrSize ; startPoint++) {
	            //group sizes

	            for (int grps = startPoint; grps <arrSize ; grps++) {
	                //if start point = 1 then
	                //grp size = 1 , print 1
	                //grp size = 2, print 1 2
	                //grp size = 3, print 1 2 3 ans so on
		       		 ArrayList<Integer> arr= new ArrayList<>();

	                for (int j = startPoint ; j <= grps ; j++) {
	                    System.out.print(arrA[j] + " ");
	                    arr.add(arrA[j]);
	                }
	                int sum=0;
	                for(int l=0; l<arr.size();l++)
	                {
	                	sum=sum+arr.get(l);
	                }
	                if(sum<B)
	                {
	                	arrB.add(sum);
	                }
	                System.out.println(arrB);

	            	/*arr.add(arrA[grps]);
	            	TwoDList.add(arr);*/
	            }
	        }
          //  System.out.println(TwoDList);
	        

	    }

	    public static void main(String[] args) {
	        int [] arrA = {1,2,3, 4};
	        int B=20;
	        new PrintAllSubArrays().printSubArrays(arrA,B);
	    }

}

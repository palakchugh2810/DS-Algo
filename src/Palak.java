import java.util.ArrayList;
import java.util.Collections;
import java.util.List;


public class Palak {

	public static void main(String[] args) {
		/*String str1 = new String("abc");
		String str2 = new String("abc");
		System.out.println(str1.equals(str2));

		 

		StringBuffer strB = new StringBuffer("abc");
		StringBuffer strB2 = new StringBuffer("abc");
		System.out.println(strB.equals(strB2));
*/	
		ways(4,2);
		}
	
	public static int ways(int total, int k)
	{
		ArrayList<Integer> lis= new ArrayList<>();
		ArrayList<List<Integer>> lisOfList= new ArrayList<>();
		ArrayList<List<Integer>> newlisOfList= new ArrayList<>();

		int sum=0;

		for(int i=1; i<=k; i++)
		{
			for(int j=1; j<=i; j++)
			{
			sum=sum+j;
			lis= new ArrayList<>();

			 if(sum<total){
				while(sum<total)
				{
				
				lis.add(sum);
				sum=sum+j;
				}
			}
			 if(sum==total)
				{
					lisOfList.add(lis);

				    			    
				// Collections.copy(newlisOfList,lisOfList);
				}
			 
			}
				
		}
		return lisOfList.size();
	}

	
}

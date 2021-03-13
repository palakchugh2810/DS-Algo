package Amdocs;

public class FactorsOfThreeAndFive {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
	public void divisibleBy3And5(int n)
	{
		n=100;//for this case
		for(int i=0; i< n ; i++)
		{
			if(n%3==0 ||  n%5==0)
			{
				System.out.println(n);
			}
		}
	}

}

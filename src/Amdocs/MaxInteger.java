package Amdocs;

public class MaxInteger {

	public static void main(String[] args) {
		int n[]={5,0,-1,9};
		maxArray(n);
	}
	
	public static int maxArray(int[] givenArray)
	{
		int max=0;
		for(int i=0; i<givenArray.length; i++)
		{
			max=Math.max(max, givenArray[i]);
		}
		return max;
	}

}

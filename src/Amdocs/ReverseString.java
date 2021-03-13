package Amdocs;

public class ReverseString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	public static String reverseString(String givenString)
	{
		String reversedString="";
		if(givenString.isEmpty() || givenString=="")
		{
			return "";
		}
		for(int i=givenString.length(); i>0;i--)
		{
			reversedString=reversedString+givenString.charAt(i);
		}
		return reversedString;
	}

}

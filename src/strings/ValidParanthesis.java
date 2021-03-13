package strings;

public class ValidParanthesis {

	public static void main(String[] args) {
    String s="()[";
    isValid(s);
	}
	public static boolean isValid(String s) {
		boolean isValid=false;
        for(int i=0; i<s.length(); i=i+2)
        {
        	/*for(int j= i+1; j<(i+2 && s.length()); j++)
        		{*/
        		System.out.println(s.charAt(i));
        		int j=i+1;
            if(s.charAt(i)=='(' && s.charAt(j)==')')
            {
            	isValid=true;
            }
            else if(s.charAt(i)=='[' && s.charAt(j)==']')
            {
            	isValid=true;
            }
            else if(s.charAt(i)=='{' && s.charAt(j)=='}')
            {
            	isValid=true;
            }
            else{
            	return false;
            }
       // }
    }
		return true;

}
}
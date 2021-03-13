package Scalar;

public class Regex {

	public static void main (String[] args) {
		boolean ans = recur("bqyyyyyyb","b.*",0,0);
    System.out.println(ans);
    
	}

	public static boolean recur(String s, String p, int i, int j)
	{
		if(i == s.length() && j == p.length()) 
      return true;
    
    else if(i == s.length() && j < p.length() ) {
      //System.out.println("condition 1 "+i + ", "+j);
      if(j+ 2 <= p.length() && p.charAt(j+1)=='*')
      {
        return recur(s,p,i,j+2);
      }
      return false;
    }
       
		if(p.charAt(j) == s.charAt(i) )
		{
      if(j+1 < p.length() && p.charAt(j+1)=='*')
      {
       // System.out.println("condition 2"+i + ", "+j);
        return recur(s, p, i+1,j) || recur(s, p, i+1,j+2);        
      }
      
			return recur(s,p,i+1,j+1);
		}
    else {
      if(p.charAt(j) == '.'){
        
          if(j+1 < p.length() && p.charAt(j+1)=='*')
          {
            return recur(s,p,i+1,j) || recur(s,p,i,j+2) ;
          }
          else
          {
            return recur(s,p,i+1,j+1);
          }
      }
      else if(j+1 < p.length() && p.charAt(j+1)=='*')
      {
        return recur(s, p, i+1,j) || recur(s, p, i,j+2);        
      }      
    
    }
    return false;
	}
}

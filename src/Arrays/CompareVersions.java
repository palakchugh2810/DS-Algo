/**
 * 
 */
package Arrays;

/**
 * @author palak
 *
 */
public class CompareVersions {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		String a="1.0.1";
		String b="1.0.0.1";
		compareVersion(a,b);
	}
	 public static int compareVersion(String version1, String version2) {
	        String[] revisions1 = version1.split("\\.");
			String[] revisions2 = version2.split("\\.");
	        int len = Math.min(revisions1.length, revisions2.length);
	        int max=0;
	        
	        for(int i=0; i<len; i++)
	        {
	            int r1 = Integer.parseInt(revisions1[i]);
				int r2 = Integer.parseInt(revisions2[i]);
	            if(r1<r2)
	            {
	                return -1;
	            }
	            else if(r1>r2)
	            {
	                return 1;
	            }
	            
	        }
	        if((revisions1.length < revisions2.length) && (Integer.parseInt(revisions2[revisions2.length-1])!= 0) )
	        {
	            return -1;
	        }
	        if(revisions1.length>revisions2.length && (Integer.parseInt(revisions1[revisions1.length-1])!= 0) )
	        {
	            return 1;
	        }
	        
	       return 0; 
	    }

}

import java.util.Scanner;

/**
 * 
 */

/**
 * @author palak
 *
 */
public class LongestPrefixString {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		System.out.println("enter size of array");
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		String arr[] = new String[n];
		for (int i = 0; i < arr.length; i++) {
			arr[i] = sc.next();

		}
		longestCommonPrefix(arr);

	}

	public static String longestCommonPrefix(String[] strs) {

		String prefix = null;
		if (strs.length == 0 || strs[0]==", ") {
			return prefix = "";
		}
		
		for (int j = 0; j < (strs.length - 1); j++) {
			for (int k = j + 1; k < (strs.length); k++) {
				for (int l = 0; l < Math
						.min(strs[j].length(), strs[k].length()); l++) {
					if (strs[j].substring(0, l).equals(strs[k].substring(0, l))) {
						prefix = strs[j].substring(0, l);
					}
					

				}
			}

		}

		System.out.println("longest prefix is " + prefix);
		return prefix;

	}
}

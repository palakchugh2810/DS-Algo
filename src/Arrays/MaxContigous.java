package Arrays;

import java.util.HashMap;

public class MaxContigous {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int A[] = { 0, 1, 0, 1 };

		// findSubArray(A, A.length);
		maxLen(A, A.length);

	}

	// using n^2

	public static int findSubArray(int arr[], int n) {
		int sum = 0;
		int maxsize = -1, startindex = 0;
		int endindex = 0;

		// Pick a starting point as i

		for (int i = 0; i < n - 1; i++) {
			sum = (arr[i] == 0) ? -1 : 1;

			// Consider all subarrays starting from i

			for (int j = i + 1; j < n; j++) {
				if (arr[j] == 0)
					sum += -1;
				else
					sum += 1;

				// If this is a 0 sum subarray, then
				// compare it with maximum size subarray
				// calculated so far

				if (sum == 0 && maxsize < j - i + 1) {
					maxsize = j - i + 1;
					// startindex = i;
				}
			}
		}
		// endindex = startindex + maxsize - 1;
		/*
		 * if (maxsize == -1) System.out.println("No such subarray"); else
		 * System.out.println(startindex + " to " + endindex);
		 */

		return maxsize;
	}

	public static int maxLen(int arr[], int n) {
		// Creates an empty hashMap hM

		HashMap<Integer, Integer> hM = new HashMap<Integer, Integer>();

		// Initialize sum of elements
		int sum = 0;

		// Initialize result
		int max_len = 0;
		int ending_index = -1;
		int start_index = 0;

		for (int i = 0; i < n; i++) {
			arr[i] = (arr[i] == 0) ? -1 : 1;
		}

		// Traverse through the given array

		for (int i = 0; i < n; i++) {
			// Add current element to sum

			sum += arr[i];

			// To handle sum=0 at last index

			if (sum == 0) {
				max_len = i + 1;
				ending_index = i;
			}

			// If this sum is seen before,
			// then update max_len if required
			if (hM.containsKey(sum + n)) {
				if (max_len < i - hM.get(sum + n)) {
					max_len = i - hM.get(sum + n);
					ending_index = i;
				}
			} else
				// Else put this sum in hash table
				hM.put(sum + n, i);
		}

		for (int i = 0; i < n; i++) {
			arr[i] = (arr[i] == -1) ? 0 : 1;
		}

		int end = ending_index - max_len + 1;
		System.out.println(end + " to " + ending_index);

		return max_len;
	}
	
	/*public static int solve(int A[]) {
        int n=A.length;
    if(n==0)
        return 0;
    HashMap<Integer,Integer> mp;
    int sum=0,ans=0;
    mp.put(0, -1);
    for(int i=0; i<A.length; ++i){
        if(A[i]==0)
            --sum;
        else
            ++sum;
        if(mp.get(sum)==mp.end())
            mp[sum]=i;
        else
            ans=max(ans,i-mp[sum]);
    }
    return ans;
    
}*/

	/*public static int solve(int[] A) {
		// A.sort();
		int count = 0;
		int coun = 0;
		int maxEndinghere = 0;
		int maxSofar = 0;
		for (int i = 0; i < A.length; i++) {
			if (A[i] == 0) {
				A[i] = -1;
			}

		}
		for (int j = 0; j < A.length; j++) {
			for (int k = 1; k < A.length - 1; k++) {
				for (int l = 0; l < A.length; l++) {
					maxEndinghere = maxEndinghere + A[j];
					count++;
					if (maxEndinghere == 0) {
						coun = count;

					}
				}
			}

		}
		return coun;
	}*/

}

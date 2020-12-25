package dailycodingpgm;

import java.util.ArrayList;
import java.util.List;

public class FindMatchingOfSum {
	public static void main(String[] str) {
		int[] a = {10,2,3,7};
		int sum = 17;
		
		int matchingPairCount = 0;
		
		matchingPairCount = findMatchingCount(a, sum);
		
		// Time Complexity = n * n = n^2 = O(n^2)
		
		// Solution 2
		/*
		 * Time complexity
		 * n + 1 + 1 = n + 2 => O(n)
		 */
		matchingPairCount = 0;
		List<Integer> unmatchingNumber = new ArrayList<Integer>();
		for (int i = 0; i< a.length; i++) {
			int k = sum - a[i] ;
			if (unmatchingNumber.contains(new Integer(k))) {
				matchingPairCount++;
			} else {
				unmatchingNumber.add(a[i]);
			}
		}
		
		System.out.println("matchingPairCount : " + matchingPairCount);
	}

	private static int findMatchingCount(int[] a, int sum) {
		//Solution1
		int matchingPairCount = 0;
		for (int i = 0; i< a.length - 1; i++) {
			for (int j = i + 1; j< a.length; j++) {
				if (a[i] + a[j] == sum) {
					matchingPairCount++;
				}
			}
		}
		
		System.out.println("matchingPairCount : " + matchingPairCount);
		return matchingPairCount;
	}
}

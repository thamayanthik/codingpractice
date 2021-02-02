package amazon;

public class FIndMatchingPairMultiplesOf {
	public static void main(String[] str) {
		int[] time = {30,20,150,100,40,30};
		// 30 + 150 = 180
		// 30 + 30 = 60
		// 20 + 100 = 120
		// 20 + 40 = 60
		// 150 + 30 = 180
		// Solution : O(n^2) = n * n + 1+1+1+1 = 4n^2 = n^2 = O(n^2)
		Long pairCount = 0l;
		for (int i = 0; i < time.length - 1 ; i++) { // n 
			for (int j = i + 1; j < time.length; j++) { // n
				int total = time[i] + time[j];
				int r = total % 60;
				if (r == 0) {
					pairCount++;
				}
			}
		}
		
		/**
		 * if suppose n = 2;
		 * i = 0, j = 1,2
		 * i = 1, j = 1,
		 * i = 2, j = 3 but loop won't start but still j ran 3 so it is consider as n times
		 */
		
		System.out.println("PairCount : " + pairCount);
		
		//Solution : 2 Time Complexity : O(n)
		int remainders[] = new int[60];
		int count = 0;
		for (int t: time) {
		    if (t % 60 == 0) { // check if a%60==0 && b%60==0
		        count += remainders[0];
		    } else { // check if a%60+b%60==60
		    	int reminder = t % 60;
		    	int pos = 60 - reminder;
		        count += remainders[pos];
		    }
		    remainders[t % 60]++; // remember to update the remainders
		}
		System.out.println("Count : " + count);
	}
}


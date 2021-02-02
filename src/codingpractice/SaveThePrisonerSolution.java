package codingpractice;

public class SaveThePrisonerSolution {
	public static void main(String[] str) {
		int n = 7;
		int sweets = 19;
		int start = 2;

		// performance issue on below code but works
		int i = 2;
		// 1,2,3,4,5
		// s = 1, sweets = 2, 1,2 -> warn
		// s = 2, sweets = 2, 2,3 -> warn
		while(i <= sweets) {
			if (start == n) {
				start = 1;
			} else start++;
			i++;
		}
		
		System.out.println(start);
		
		int n1 = 5;
		int sweets1 = 5;
		int start1 = 1;
		
		int warn = 0;
		int firstRoundLeft = n1 - start1 + 1;
		int distributedSweet = sweets1 - firstRoundLeft;
		System.out.println("firstRoundLeft : " + firstRoundLeft);
		System.out.println("distributedSweet : " + distributedSweet);
		
		if (sweets1 > n1) {
			int round = distributedSweet / n1;
			int balance = distributedSweet % n1;
				
			if (balance == 0) {
				warn = start1;
			}
			System.out.println("round : " + round);
			System.out.println("balance : " + balance);
		} else {
			if (distributedSweet > 0) {
				warn = distributedSweet;
			} else {
				warn = n1 + distributedSweet;
			}
			System.out.println("Else");
		}
		
		System.out.println("warn : " + warn);
		
	
	}
}

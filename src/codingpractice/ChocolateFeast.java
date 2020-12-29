package codingpractice;

public class ChocolateFeast {
	public static void main(String[] str) {
		int n = 6;
		int cost = 2;
		int wrapperToFree = 2;
		
		int grandTotal = totalBarBought(n, cost, wrapperToFree);
		
		System.out.println(grandTotal);
	}

	private static int totalBarBought(int n, int cost, int wrapperToFree) {
		int totalBarsBought = n / cost;
		int grandTotal = totalBarsBought;
		boolean leftWrapper = true;
		int balanceWrapper = 0;
		while (leftWrapper) {
			totalBarsBought = totalBarsBought + balanceWrapper;
			int newBarForFree = totalBarsBought / wrapperToFree;
			if (newBarForFree > 0) {
				grandTotal = grandTotal  + newBarForFree;
				balanceWrapper = totalBarsBought % wrapperToFree;
				totalBarsBought = newBarForFree;
			} else {
				break;
			}
		}
		return grandTotal;
	}
}

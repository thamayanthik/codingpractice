package codingpractice;

public class HowManyGames {
	public static void main(String[] str) {
		int p = 54;
		int m = 35;
		int d = 10;
		int s =3335;
		
		//54 10 35 3335
		
		int total = 0;
		int totalGames = 0;
		int nextNumber = p;
		while (nextNumber > 0) {
			total = total + nextNumber;
			if (total <= s) {
				totalGames++;
				System.out.println("NextNumber : " + nextNumber + "Total : " + total + ", totalGames " + totalGames);
				/*if ((nextNumber - d) > m) {
					nextNumber = nextNumber - d;
				} else {
					nextNumber = m;
				}*/
				nextNumber = Math.max(nextNumber -d, m);
			} else {
				nextNumber = -1;
			}
		}
		
		System.out.println("Total Games : " + totalGames);
	}
}

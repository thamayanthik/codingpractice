package codingpractice;

public class ViralAdvertisingSolution {

	public static void main(String[] str) {
		int day = 3;
		int cumulative = 0;
		int peopleCount = 5;
		for (int i = 0; i<day;i++) {
			int liked = peopleCount / 2;
			cumulative += liked;
			peopleCount = liked * 3;
		}
		
		System.out.println("cumulative : "  + cumulative);
	}
}

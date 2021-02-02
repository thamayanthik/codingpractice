package codingpractice;

public class FindDigitsSolution {
	
	public static void main(String[] str) {
		int a = 106108048;
		int dc = findDigit(a);
		
		System.out.println("dc : " + dc);
		
		/*a = 114108089;
		dc = findDigit(a);
		
		System.out.println("dc : " + dc);*/
	}

	private static int findDigit(int a) {
		int dc = 0;
		int b1 = a;
		while (b1 > 0) {
			int b = b1 % 10;
			if (b != 0) {
				int r = a % b;
				if (r ==0) {
					dc++;
				}
			}	
			b1 = b1 / 10;
		}
		return dc;
	}

}

package codingpractice;

public class BeautifulDaysSolution {
	
	public static void main(String[] str) {
		int i = 20; 
		int j = 23;
		int k = 6;
		
		for (int s = i; s<=j;s++) {
			// Reverse the number
			boolean reverseFound = false;
			String reverse = "";
			int number = s;
			while (!reverseFound) {
				int r = number % 10;
				number = number / 10;
				reverse = reverse + r;
				
				if (number == 0) {
					break;
				} 
			}
			
			Integer reverseNumber = Integer.valueOf(reverse);
			Integer diff = 0;
			if (reverseNumber > s) {
				diff = reverseNumber - s;
			} else {
				diff = s - reverseNumber;
			}
			
			if (diff % k == 0) {
				System.out.println(s  + " is beautiful number");
			}
		}
	}

}

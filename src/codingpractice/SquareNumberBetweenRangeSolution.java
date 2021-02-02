package codingpractice;

public class SquareNumberBetweenRangeSolution {
	public static void main(String[] str) {
		int a = 35;
		int b = 70;
		long count = countNumberOfSquareSolution2(a, b);
		System.out.println("countNumberOfSquareSolution2 : " + count);
		int count1 = countNumberOfSquareSolution1(a, b);
		System.out.println("countNumberOfSquareSolution1 : " + count1);
	}

	/**
	 * Performance issue but if range is smaller number works fine
	 * @param a
	 * @param b
	 * @return
	 */
	private static int countNumberOfSquareSolution1(int a, int b) {
		int count = 0;
		for (int j = 2; j <= b / 2; j +=1) {
			int square = j * j;
			if (square >= a && square <=b) {
				count++;
			}
		}
		return count;
	}
	
	/**
	 * Not working all the case
	 * @param a
	 * @param b
	 * @return
	 */
	private static long countNumberOfSquareSolution2(int a, int b) {
		
		double sa = Math.floor(Math.sqrt(a));
		double sb = Math.ceil(Math.sqrt(b));
		
		double count = sb - sa;
		
		System.out.println("sa : " + sa + ", sb : " + sb);
		
		return (long) count;
	}
}

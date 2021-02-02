package codingpractice;

import java.math.BigDecimal;
import java.text.DecimalFormat;

public class PlusMinusSolution {

		public static void main(String[] str) {
			int[] arr = {-4, 3 ,-9 ,0, 4, 1};
			long postiveCount = 0;
			long negativeCount = 0;
			long zeroCount = 0;
			int len = arr.length;
			for (int i = 0; i<arr.length;i++) {
				if (arr[i] > 0) {
					postiveCount++;
				} else if (arr[i] < 0) {
					negativeCount++;
				} else {
					zeroCount++;
				}
		    }
			
			double p = 0;
			if (postiveCount > 0) {
				p = (double) postiveCount / len;
			}
			
			System.out.println(BigDecimal.valueOf(p).setScale(7, BigDecimal.ROUND_HALF_DOWN));
			double n = 0;
			if (negativeCount > 0) {
				n = (double) negativeCount / len;
			}
			System.out.println(BigDecimal.valueOf(n).setScale(7, BigDecimal.ROUND_HALF_DOWN));
			double z = 0;
			if (zeroCount > 0) {
				z = (double) zeroCount / len;
			}
			System.out.println(BigDecimal.valueOf(z).setScale(7, BigDecimal.ROUND_HALF_DOWN));
		}
}

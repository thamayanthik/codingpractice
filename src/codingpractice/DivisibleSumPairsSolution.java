package codingpractice;

public class DivisibleSumPairsSolution {

		public static void main(String[] str) {
			int a[] = {1, 3, 2, 6 ,1, 2};
			int k = 3;
			int count = 0;
			for (int i = 0; i < a.length - 1; i++) {
				for (int j = i + 1; j < a.length; j++) {
					int sum = a[i] + a[j];
					if (sum % k == 0) {
						count++;
					}
				}
			}
			System.out.println(count);
		}
}

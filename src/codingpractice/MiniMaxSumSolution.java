package codingpractice;

public class MiniMaxSumSolution {
	
	public static void main(String[] str) {
		int arr[] = {256741038, 623958417, 467905213, 714532089, 938071625};
		long total = 0;
		for (int i = 0; i < arr.length; i++)  {
			total += arr[i];
		}
		
		System.out.println("Total : " + total);
		long minValue = total;
		long maxValue = 0;
		for (int i = 0; i < arr.length; i++)  {
			long rest = total - arr[i];
			if (minValue > rest) {
				minValue = rest;
			}
			
			if (maxValue < rest) {
				maxValue = rest;
			}
		}
		
		System.out.println("minValue : " + minValue + ", maxValue : " + maxValue);
	}
}

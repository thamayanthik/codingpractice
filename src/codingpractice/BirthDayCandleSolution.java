package codingpractice;

import java.util.ArrayList;
import java.util.List;

public class BirthDayCandleSolution {
	
	public static void main(String[] str) {
		List<Integer> arr = new ArrayList();
		arr.add(4);
		arr.add(4);
		arr.add(1);
		arr.add(3);
		
		long maxValue = 0;
		int maxCount = 0;
		for (int i = 0; i < arr.size(); i++)  {
			if (maxValue < arr.get(i)) {
				maxCount = 1;
				maxValue =arr.get(i);
			} else if (maxValue == arr.get(i)) {
				maxCount++;
			}
		}
		
		System.out.println(maxCount);
		
	}
}

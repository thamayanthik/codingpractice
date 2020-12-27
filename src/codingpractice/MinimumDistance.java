package codingpractice;

import java.util.HashMap;
import java.util.Map;

public class MinimumDistance {
	
	public static void main(String[] str) {
		int a[] = {7, 1, 3, 4, 1, 7};
		Integer distance = minimumDistance(a);
		System.out.println("distance : " + distance);
	}

	private static Integer minimumDistance(int[] a) {
		Integer minimumDistance =  -1 ;
		Map<Integer, Integer> distance = new HashMap<Integer, Integer>();
		for (int i = 0; i < a.length; i++) {
			if (distance.containsKey(a[i])) {
				Integer fIndice = distance.get(a[i]);
				Integer diff = i - fIndice;
				System.out.println(a[i] + " distance " + diff);
				if (minimumDistance == -1 || minimumDistance > diff) {
					minimumDistance = diff;
				} 				
			} else {
				distance.put(a[i], i);
			}
		}
		
		return minimumDistance;
	}

}

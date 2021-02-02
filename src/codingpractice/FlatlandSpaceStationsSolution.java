package codingpractice;

public class FlatlandSpaceStationsSolution {

	public static void main(String[] str) {
		int n = 6;
		int[] c = {0,4};
		
		int maxDistance = flatlandSpaceStations(n, c);
		System.out.println(maxDistance);
	}
	
	static int flatlandSpaceStations(int n, int[] c) {
		int maxDistance =  0;
		if (n == c.length) {
			return 0;
		}
		
		for (int ai = 0; ai < n; ai++) {
			int distance = n;
			for (int st = 0; st < c.length; st++) {  // convert to binary search
				int d = c[st] - ai;
				if (d < 0) d = d * -1;
				if (d < distance) distance = d;
			}
			if (distance > maxDistance) {
				maxDistance = distance;
			}
		}
		
		return maxDistance;
	}
}


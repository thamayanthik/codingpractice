package codingpractice;

public class ServiceLaneSolution {
	
		public static void main(String[] str) {
			int n = 8;
			int[] width = {2, 3, 1, 2, 3, 2, 3, 3};
			int[][] cases = {{0,3}, {4,6}, {6, 7}, {3, 5}, {0, 7}};
			
			int[] result = serviceLane(n, width, cases);
			for (int i =0; i < result.length; i++) 
				System.out.println(result[i]);
		}

	 	static int[] serviceLane(int n, int[] width, int[][] cases) {
	 		int[] result = new int[cases.length];
	 		for (int i =0; i < cases.length; i++) {
	 			int startIndex = cases[i][0];
	 			int endIndex = cases[i][1];
	 			
	 			int smallest = 0;
	 			for (int j = startIndex; j<= endIndex; j++){
	 				if (smallest == 0 || smallest > width[j]) {
	 					smallest = width[j];
	 				}
	 			}
	 			result[i] = smallest;
	 			
	 		}
	 		return result;
	 	}	
}

package codingpractice;

public class BeautifulTriplets {

	public static void main(String[] str) {
		int[] arr = {1,2,4,5,7,8,10};
		int d = 3;
		beautifulTripletsSolution1(d, arr);
	}
	
	public static int beautifulTripletsSolution1(int d, int[] arr) {
		//Short the array
		
		int len = arr.length;
		
		int numberOfTriplets = 0;
		for (int i = 0; i<len - 1;i++) {
			for (int j1 = i + 1; j1 < len - 1 ; j1++) {
				if (arr[j1] - arr[i] == d) {
					String tripleStr = arr[i] + " ";
					for (int j = j1 + 1; j <= len - 1 ; j++) {
						if (arr[j] - arr[j1] == d) {
							tripleStr = tripleStr + arr[j1] + " " + arr[j];
							numberOfTriplets++;
							System.out.println("tripleStr : [" + tripleStr + "]");
							break;
						}
					}
				}
			}
		}
		
		return numberOfTriplets;
    }
	
	public static int beautifulTripletsSolution2(int d, int[] arr) {
		//Short the array
		
		int len = arr.length;
		
		int numberOfTriplets = 0;
		for (int i = 0; i < len - 1;i++) {
			int nextNumber = 0;
			if (arr[i] < d)
				nextNumber = d - arr[i];
			else 
				nextNumber = arr[i] - d;
			
		}
		
		return numberOfTriplets;
    }
}

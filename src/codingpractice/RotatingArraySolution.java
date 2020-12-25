package codingpractice;

public class RotatingArraySolution {
	public static void main(String[] s) {
		int a[] = {1, 2, 3 ,4, 5};
		int d =4;
		System.out.print("Input Array a : ");
		for (int ai = 0; ai < a.length ; ai++) 
			System.out.print(a[ai] + " ");
		System.out.println("");
		System.out.println("OutPut Solution1 : ");
		leftShiftArraySolution1(a, d); // it has performance issue taking more time to execute when array size grows
		int a1[] = {1, 2, 3 ,4, 5};
		int d1 =  4;
		System.out.println("");
		System.out.print("Input Array a1 : ");
		for (int ai = 0; ai < a1.length ; ai++) 
			System.out.print(a1[ai] + " ");
		leftShiftArraySolution2(a1, d1);
		
		leftShiftArraySolution3(a1, d1);
		
		
	}
	
	public static void leftShiftArraySolution1(int a[], int d) {
		//1 2 3 4 5
		//2,3,4,5,1
	
		// Right Shift
		for (int shift = 1; shift <= d; shift++) {
			for (int ai = 0; ai < a.length - 1; ai++) {
				int temp = a[ai];
				a[ai] = a[ai + 1];
				a[ai + 1] = temp;
			}
		}
		
		for (int ai = 0; ai < a.length ; ai++) 
			System.out.print(a[ai] + " ");
	}
	
	public static void leftShiftArraySolution2(int a[], int d) {
		//1 2 3 4 5
		//2,3,4,5,1 -> d = 1
	
		// Left Shift
		int[] result = new int[a.length];
		for (int cp = 0; cp < a.length; cp++) {
			int newPos = cp - d;
			if (newPos < 0) {
				newPos = a.length - (-1 * newPos);
			}
			result[newPos] = a[cp];
		}
		System.out.println("");
		for (int ai = 0; ai < result.length ; ai++) 
			System.out.print(result[ai] + " ");
	}
	
	public static void leftShiftArraySolution3(int a[], int d) {
		//1 2 3 4 5
		//2,3,4,5,1 -> d = 1
	
		// Left Shift
		d = 1;
		int len = a.length;
		int[] result = new int[len];
		for (int cp = len - 1 ; cp > 0; cp--) {
			int newPos = cp - d;
			result[newPos] = a[cp];
		}
		System.out.println("");
		for (int ai = 0; ai < result.length ; ai++) 
			System.out.print(result[ai] + " ");
	}
	
	
}

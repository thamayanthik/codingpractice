package dailycodingpgm;

public class ProductOfAll {
	
	public static void main(String[] str) {
		int[] a = {1, 2, 3, 4, 5};  //output : {120, 60, 40, 50, 24}
		
		System.out.print("Input : [ ");
		for (int i = 0; i<a.length;i++) 
			System.out.print(a[i] + " ");
		
		System.out.println("]");
				
		solution1(a);
		solution2(a);

	}

	public static void solution2(int[] a) {
		//Solution 2; without using division
		int[] newArray1 = new int[a.length];
		for (int i = 0; i<a.length;i++) {
			int s = 1;
			for (int j = 0;j <a.length;j++) {
				if (i != j ) {
					s = s * a[j];
				}
			}
			newArray1[i] = s;
		}
		
		System.out.print("Solution2 : [ ");
		for (int i = 0; i<a.length;i++) 
			System.out.print(newArray1[i] + " ");
		
		System.out.println("]");
	}

	public static int[] solution1(int[] a) {
		int sum = 1;
		int[] newArray = new int[a.length];
		for (int i = 0; i<a.length;i++) {
			sum = sum * a[i];
		}
		
		for (int i = 0; i<a.length;i++) {
			newArray[i] = sum / a[i];
		}
		
		System.out.print("Solution1 : [ ");
		for (int i = 0; i<a.length;i++) 
			System.out.print(newArray[i] + " ");
		
		System.out.println("]");
		return newArray;
	}


}

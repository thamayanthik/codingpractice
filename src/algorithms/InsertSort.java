package algorithms;

public class InsertSort {
	
	public static void main(String[] str) {
		int a[] = {3,5,0,2,7,6};
		System.out.print("Input Array : ");
		for (int i = 0; i<a.length;i++) 
			System.out.print(a[i] + " ");
		System.out.println("");
		System.out.println("-------------------------------");
		insertSortSolution2(a);
		System.out.print("Output Shorted Array : ");
		for (int i = 0; i<a.length;i++) 
			System.out.print(a[i] + " ");
		
	}

	public static int[] insertSort(int a[]) {
		
		for (int i = 0; i < a.length - 1; i++) {
			if (a[i] > a[i+1]) {
				int temp = a[i];
				a[i] = a[i+1];
				a[i+1] = temp;
			} 
			
			if (i > 0){
				for (int r = i - 1; r > 0; r--) {
					if (a[r -1] > a[r]) {
						int temp = a[r];
						a[r] = a[r-1];
						a[r-1] = temp;	
					}
				}
			}
		}
		
		return a;
	}
	
	public static int[] insertSortSolution2(int a[]) {
		
		for (int i = 1; i < a.length - 1; i++) {
			int key = a[i];
			int r = i - 1;
			while (r>=0 && a[r] > key) {
				a[r+1] = a[r];
				r--;
			}
			
			a[r + 1] = key;
			
		}
			
		return a;
	}
}

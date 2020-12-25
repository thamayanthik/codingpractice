package geeksforgeeks;

public class SortArray {
	public static void main(String[] str) {
		int a[] = {0, 1, 1, 0, 1, 2, 1, 2, 0, 0, 0, 1};
	
		int lo = 0; 
        int hi = a.length - 1; 
        int mid = 0, temp = 0; 
        while (mid <= hi) { 
            switch (a[mid]) { 
            case 0: { 
                temp = a[lo]; 
                a[lo] = a[mid]; 
                a[mid] = temp; 
                lo++; 
                mid++; 
                break; 
            } 
            case 1: 
                mid++; 
                break; 
            case 2: { 
                temp = a[mid]; 
                a[mid] = a[hi]; 
                a[hi] = temp; 
                hi--; 
                break; 
            } 
            } 
        } 
		
		System.out.print("Input : [ ");
		for (int i = 0; i<a.length;i++) 
			System.out.print(a[i] + " ");
		
		System.out.println("]");
	}
}

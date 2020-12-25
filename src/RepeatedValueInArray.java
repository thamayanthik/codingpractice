import java.util.ArrayList;
import java.util.List;


public class RepeatedValueInArray {
	
	public static void main(String[] str) {
		Integer[] a = new Integer[] {1,2,2,2};
		System.out.println(a);

		//Solution1
		List<Integer> repeatFound = new ArrayList<Integer>();
		for (int i = 0; i < a.length; i++) {
			if (!repeatFound.contains(a[i])) {
				for (int j = i + 1 ; j < a.length; j++) {
					if (a[i] == a[j]) {
						System.out.println("Repeated : " + a[i]);
						//remove repeated element from array
						repeatFound.add(a[i]);
						break;
					} 
				}
			}
		}
		
		if (repeatFound.isEmpty()) {
			System.out.println("No Duplicate Found");
		}
		
		//Solution 2, not works all the case, if the number in array > number of elements
		int arr[] = { 1, 6, 3, 1, 3, 23, 23 }; 
		int arr_size = arr.length; 
		printDuplicates(arr, arr_size); 
	}
	
	static void printDuplicates(int arr[], int n) 
	{ 
	    int i; 
	  
	    // Flag variable used to 
	    // represent whether repeating 
	    // element is found or not. 
	    int fl = 0; 
	    System.out.println("n : " + n);
	    for (i = 0; i < n; i++)  
	    { 
	  
	        // Check if current element is repeating or not. If it is repeating then value will be greater than or equal to n. 
	    	int j = arr[i] % n;
	    	System.out.println("j : " + j);
	        if (arr[j] >= n)  
	        { 
	        	// Check if it is first repetition or not. If it is first repetition then value 
	            // at index arr[i] is less than 2*n. Print arr[i] if it is first repetition. 
	            if (arr[arr[i] % n] < 2 * n)  
	            { 
	                System.out.print( "Repeat : " + arr[i] % n + " "); 
	                fl = 1; 
	            } 
	        } else {
	        	 System.out.print("arr[" + j + "] = " + arr[j]); 
	        }
	  
	        // Add n to index arr[i] to mark 
	        // presence of arr[i] or to 
	        // mark repetition of arr[i]. 
	        arr[j] += n; 
	        System.out.println("arr[" + j + "] = " + arr[j]); 
	    } 
	  
	    // If flag variable is not set 
	    // then no repeating element is 
	    // found. So print -1. 
	    if (!(fl > 0)) 
	        System.out.println("-1"); 
	} 

}

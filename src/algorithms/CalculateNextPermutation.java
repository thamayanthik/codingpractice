package algorithms;

public class CalculateNextPermutation {
	
	public static void main(String[] s) {
		nextPermutation();
	}
	
	public static boolean nextPermutation() {
		int[] array = {0, 1, 2, 5, 3, 3, 0};
	    // Find longest non-increasing suffix
	    int i = array.length - 1;
	    while (i > 0 && array[i - 1] >= array[i])
	        i--;
	    // Now i is the head index of the suffix
	    System.out.println();
	    System.out.println("array[" + i + "]=" + array[i]);
	    // Are we at the last permutation already?
	    if (i <= 0)
	        return false;
	    
	    // Let array[i - 1] be the pivot
	    // Find rightmost element that exceeds the pivot
	    int j = array.length - 1;
	    while (array[j] <= array[i - 1])
	        j--;
	    System.out.println("array[" + j + "]=" + array[j]);
	    // Now the value array[j] will become the new pivot
	    // Assertion: j >= i
	    
	    // Swap the pivot with j
	    int temp = array[i - 1];
	    array[i - 1] = array[j];
	    array[j] = temp;
	    
	    System.out.println("New Permutation : ");
	    for (int y = 0; y<array.length;y++) 
	    	System.out.print(array[y] + " ");
	    
	    // Reverse the suffix
	    j = array.length - 1;
	    while (i < j) {
	        temp = array[i];
	        array[i] = array[j];
	        array[j] = temp;
	        i++;
	        j--;
	    }
	    
	    System.out.println();
	    System.out.println("New Permutation : ");
	    for (int y = 0; y<array.length;y++) 
	    	System.out.print(array[y] + " ");
	    
	    // Successfully computed the next permutation
	    return true;
	}
	

}

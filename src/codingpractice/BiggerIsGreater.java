package codingpractice;

public class BiggerIsGreater {
	public static void main(String[] str) {
		String word = "dhck";
		
		String output = generateBiggerIsGreater(word);
		System.out.println("Input : " + word + ", output : " +  output);
		System.out.println("----------------------------");
		
		word = "dkhc";
		
		output = generateBiggerIsGreater(word);
		System.out.println("Input : " + word + ", output : " +  output);
		System.out.println("----------------------------");
		
		word = "hefg";
		
		output = generateBiggerIsGreater(word);
		System.out.println("Input : " + word + ", output : " +  output);
		System.out.println("----------------------------");
		
		word = "bb";
		
		output = generateBiggerIsGreater(word);
		System.out.println("Input : " + word + ",output : " +  output);
		System.out.println("----------------------------");
		
		word = "ab";
		
		output = generateBiggerIsGreater(word);
		System.out.println("Input : " + word + ",output : " +  output);
		System.out.println("----------------------------");
		
		word = "fedcbabcd";
		
		output = generateBiggerIsGreater(word);
		System.out.println("Input : " + word + ", output : " +  output);
		System.out.println("----------------------------");
		
		word = "abcd";
		
		output = generateBiggerIsGreater(word);
		System.out.println("Expected: acbd, Actual output : " +  output);
		System.out.println("----------------------------");
		
		solution2BackwardTrace(word);
		
		System.out.println("----------------------------");
		word = "dhck";
		output = solution2BackwardTrace(word);
		System.out.println("Input : " + word + ", output : " +  output);
		System.out.println("----------------------------");
		
		System.out.println("----------------------------");
		word = "dkhc";
		output = solution2BackwardTrace(word);
		System.out.println("Input : " + word + ", output : " +  output);
		System.out.println("----------------------------");
		
		System.out.println("----------------------------");
		word = "dkhc";
		output = nextPermutation(word);
		System.out.println("Output Using nextPermutation : " + output);
		
		word = "fedcbabcd";
		output = nextPermutation(word);
		System.out.println("Output Using nextPermutation : " + output);
		
		word = "bb";
		output = nextPermutation(word);
		System.out.println("Output Using nextPermutation : " + output);
		System.out.println("----------------------------");
	}

	/*
	 *  1. Iterate over every character, we will get the last value i (starting from the first character) that satisfies the given condition S[i] < S[i + 1]
		2. Now, we will get the last value j such that S[i] < S[j]
		3. We now interchange S[i] and S[j]. And for every character from i+1 till the end, we sort the characters. i.e., sort(S[i+1]..S[len(S) - 1])
	 */
	private static String nextPermutation(String word) {
		// Convert String to Array
		char[] wa = word.toCharArray();
		
		String newString = "No answer";
		
		// Find longest non-increasing suffix
		int i = wa.length - 1;
		while (i > 0 && wa[i - 1] >= wa[i])
		    i--;
		
		if (i<=0) 
			return newString;
		
		// Now, we will get the last value j such that S[i] < S[j]
		int j = wa.length - 1;
		while (wa[j] <= wa[i - 1]) {
			j--;
		}
		
		// Swap the pivot with j
	    char temp = wa[i - 1];
	    wa[i - 1] = wa[j];
	    wa[j] = temp;
	    
	    j = wa.length - 1;
	    while (i < j) {
	        temp = wa[i];
	        wa[i] = wa[j];
	        wa[j] = temp;
	        i++;
	        j--;
	    }
	    
	    if (String.valueOf(wa).compareTo(word) > 0) {
	    	newString = String.valueOf(wa);
	    }
	    
	    return newString;
	}

	private static String solution2BackwardTrace(String word) {
		String newWord  = "No answer";
		
		int len = word.length();
		
		for (int i = len - 1; i > 0; i--) {
			char c = word.charAt(i);
			char s = word.charAt(i - 1);
			
			String subStr = word.substring(0, i - 1) + c + s;
			
			if (i < len - 1) {
				subStr = subStr + word.substring(i+1, len);
			}
			
			if (subStr.compareTo(word) > 0) {
				newWord = subStr;
			}
			
		}
		
		return newWord;
	}
	
	private static String generateBiggerIsGreater(String word) {
		String newWord  = "No answer";
				
		int len = word.length();
		
		int numberOfCharMove = len/2;
		
		int count = 1;
		System.out.println("Input String : " + word);
		while (count <= numberOfCharMove) {
			String subStr1 = word.substring(len - count, len);
			int lastIndex = word.lastIndexOf(subStr1);
			String subStr2 = word.substring(lastIndex - count, lastIndex);
			int lastIndex2 = word.lastIndexOf(subStr2);
			if (subStr1.compareToIgnoreCase(subStr2) != 0) {
				String newStr = word.substring(0, lastIndex2) + subStr1 + subStr2;
				
				
				if (newStr.compareTo(word) > 0) {
					newWord = newStr;
					break;
				}
			}
			
			count++;
		}
		
		return newWord;
	}
	
	
}

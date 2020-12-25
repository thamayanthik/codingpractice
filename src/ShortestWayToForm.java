
public class ShortestWayToForm {
	
	public static void main(String[] str) {
		String source = "abc";
		String target = "abcb";
		int numberOfSequence = 0;
		String remaining = target;
		while (remaining.length() > 0) {
			StringBuilder subSequence = new StringBuilder();
			int i = 0;
			int j = 0;
			
			while (i < source.length() && j < remaining.length()) {
				if (source.charAt(i++) == remaining.charAt(j)) {
					subSequence.append(remaining.charAt(j++));
					System.out.println("subSequence : " + subSequence);
				}
			}
			
			System.out.println("subSequence1 : " + subSequence);
			
			if (subSequence.length() == 0) {
				System.out.println("No Sequence Found");
				System.exit(0);
			}
			
			numberOfSequence++;
			remaining = remaining.substring(subSequence.length());
			
			System.out.println("remaining : " + remaining);
		}
		
		System.out.println("numberOfSequence : " + numberOfSequence);
	}

}

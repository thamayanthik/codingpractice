package codingpractice;

public class RepeatedStringSolution {
	
	public static void main(String[] a) {
		long length = 554045874191l;
		String ar  = "cfimaakj";
		
		long acount = 0;
		if (ar.length() == 1 && ar.contains("a")) {
			acount  = length;
		} else {
			
			/* --- Solution1 Performance Issue
			long tempAcount = ar.chars().filter(c1 -> c1 == 'a').count();
			long charCount = 0;
			StringBuilder sb = new StringBuilder();
			while (charCount < length) {
				long balanceCharCount = length - sb.length();
				if (balanceCharCount >= ar.length()) {
					charCount = charCount + ar.length();
					acount = acount + tempAcount;
				} else {
					String balanceStr = ar.substring(0, Long.valueOf(balanceCharCount).intValue());
					tempAcount = balanceStr.chars().filter(c1 -> c1 == 'a').count();
					acount = acount + tempAcount;
					charCount = length;
				}
				System.out.println("acount : " + charCount);
			}*/
			
			long tempAcount = ar.chars().filter(c1 -> c1 == 'a').count();
			
			long repeatCount = length / ar.length();
			long balanceChar = length % ar.length();
			
			acount = repeatCount * tempAcount;
			
			String balanceStr = ar.substring(0, Long.valueOf(balanceChar).intValue());
			
			tempAcount = balanceStr.chars().filter(c1 -> c1 == 'a').count();
			
			acount = acount + tempAcount;
			
			System.out.println("acount : " + acount);
		}
	}

}

package codingpractice;

public class AppendAndDeleteStringSolution {
	
	public static void main(String[] str) {
		String s = "aba";
		String t = "aba";
		int k = 7;
		String result = appendAndDelete(s, t, k);
		
		// Expected Yes
		System.out.println("S: " + s + ", T : " + t + ", Result : " + result);
		
		s = "hackerhappy";
		t = "hackerrank";
		k = 9;
		result = appendAndDelete(s, t, k);
		System.out.println("S: " + s + ", T : " + t + ", Result : " + result);
		//Expected Yes
		
		s = "ashlay";
		t = "ash";
		k = 2;
		result = appendAndDelete(s, t, k);
		System.out.println("S: " + s + ", T : " + t + ", Result : " + result);
		
		s = "zzzzz";
		t = "zzzzzzz";
		k = 4;
		result = appendAndDelete(s, t, k);
		System.out.println("S: " + s + ", T : " + t + ", Result : " + result);
		
		s = "aaaaaaaaaa";
		t = "aaaaa";
		k = 7;
		result = appendAndDelete(s, t, k);
		System.out.println("S: " + s + ", T : " + t + ", Result : " + result);
		
		s = "y";
		t = "yu";
		k = 2;
		result = appendAndDelete(s, t, k);
		System.out.println("S: " + s + ", T : " + t + ", Result : " + result);
		
		s = "asdfqwertyuighjkzxcvasdfqwertyuighjkzxcvasdfqwertyuighjkzxcvasdfqwertyuighjkzxcvasdfqwertyuighjkzxcv";
		t = "bsdfqwertyuighjkzxcvasdfqwertyuighjkzxcvasdfqwertyuighjkzxcvasdfqwertyuighjkzxcvasdfqwertyuighjkzxcv";
		k = 100;
		result = appendAndDelete(s, t, k);
		System.out.println("S: " + s + ", T : " + t + ", Result : " + result);
		
		s = "uoiauwrebgiwrhgiuawheirhwebvjforidkslweufgrhvjqasw";
		t = "vgftrheydkoslwezxcvdsqjkfhrydjwvogfheksockelsnbkeq";
		k = 100;
		result = appendAndDelete(s, t, k);
		System.out.println("S: " + s + ", T : " + t + ", Result : " + result);
	}

	private static String appendAndDelete(String s, String t, int k) {
		String result = "No";
		
		System.out.println("S Length : " + s.length() + ", t Length : " + t.length());
		if (s.charAt(0) != t.charAt(0) && k < t.length() * 2) {
			result = "No";
			System.out.println("fff");
		} else if (s.equalsIgnoreCase(t) && k >= (t.length() * 2)) {
			result = "Yes"; // reason, we can delete all string from source and re-add if require step increment using empty string
		} else {
			if (s.length() < t.length()) {
				if (t.contains(s)) {
					String remainStr = t.substring(s.length(), t.length());
					int pos = 0;
					// remove additional char if remainStr < k
					System.out.println(remainStr);
					int y = k-remainStr.length();
					if (remainStr.length() < k && remainStr.length() < s.length() && y < s.length()) {
						s = s.substring(0, y);
						remainStr = t.substring(s.length(), t.length());
					}
					while (s.length() <= t.length() && pos < remainStr.length()) {
						s = s.concat(String.valueOf(remainStr.charAt(pos)));
						k--;
						pos++;
					} 
					if (k == -1) {
						result = "Yes";
					}
				} else {
					int dropCharCount = 0;
					while (true) {
						String remainStr = t.substring(s.length(), t.length());
						dropCharCount++;
						if (t.contains(s)) {
							remainStr = t.substring(s.length(), t.length());
							if ((dropCharCount + remainStr.length()) == k) {
								result = "Yes"; // append required str to get target string
							} 
							break;
						} else if (dropCharCount > k) {
							break;
						}
					}
				}
			} else {
				int dropCharCount = 0;
				String ss = s;
				while (true) {
					ss = ss.substring(0, ss.length() - 1);
					dropCharCount++;
					if (t.contains(ss)) {
						ss = t.substring(ss.length(), t.length());
						if ((dropCharCount + ss.length()) <= k) {
							result = "Yes"; // append required str to get target string
						} 
						break;
					} else if (dropCharCount > k) {
						break;
					}
				}
			}
			
		}
			
		return result;
	}
	
	private static String appendAndDelete2(String s, String t, int k) {
		String result = "No";
		
		if (s.equalsIgnoreCase(t) && k >= (t.length() * 2)) {
			result = "Yes"; // reason, we can delete all string from source and re-add if require step increment using empty string
		} else {
			
			
		}
			
		return result;
	}
}

package codingpractice;

enum Hour {
	one(1), two(2), three(3), four(4), five(5), six(6), seven(7), eight(8), nine(9), ten(10), eleven(11), twelve(12);
	
	private Integer value;
	
	private Hour(int index) {
		value = index;
	}
	
	public static Hour valueByInt(int i) {
		for (Hour h : Hour.values()) {
			if (h.value == i) {
				return h;
			}
		}
		return null;
	}
}

enum Minutes {
	one(1), two(2), three(3), four(4), five(5), six(6), seven(7), eight(8), nine(9), ten(10), eleven(11), twelve(12),
	thirteen(13), fourteen(14), fifteen(15), sixteen(16), seventeen(17), eighteen(18), nineteen(19), twenty(20);
	
	private Integer value;
	
	private Minutes(int index) {
		value = index;
	}
	
	public static Minutes valueByInt(int i) {
		for (Minutes h : Minutes.values()) {
			if (h.value == i) {
				return h;
			}
		}
		return null;
	}
}

public class TimeInWords {
	
	public static void main(String[] str) {
		int h = 3;
		int min = 45;
		String timeInWord = printTimeInWord(h, min);
		
		h = 5;
		min = 47;
		timeInWord = printTimeInWord(h, min);
		
		h = 5;
		min = 01;
		timeInWord = printTimeInWord(h, min);
		
		h = 6;
		min = 35;
		timeInWord = printTimeInWord(h, min);
	}

	private static String printTimeInWord(int h, int min) {
		String timeInWord = "";
		if (min == 00) {
			timeInWord = Hour.valueByInt(h).name() + " o' clock";
		} else if (min >= 1 && min <= 30) {
			if (min == 15) {
				timeInWord = "quarter past " + Hour.valueByInt(h).name();
			} else if (min == 30) {
				timeInWord = "half past " + Hour.valueByInt(h).name();
			} else if (min < 10) {
				timeInWord = Minutes.valueByInt(min) + " minute past " + Hour.valueByInt(h).name();
			} else if (min > 20) {
				int mp = min - 20;
				timeInWord = Minutes.valueByInt(20) + " " + Minutes.valueByInt(mp)  + " minutes past " + Hour.valueByInt(h).name();
			} else {
				timeInWord = Minutes.valueByInt(min) + " minutes past " + Hour.valueByInt(h).name();
			}
		} else if (min == 45){
			timeInWord = "quarter to " + Hour.valueByInt(h + 1).name();
		} else if (min > 30){
			int away = 60 - min;
			if (away > 20) {
				int mp = away - 20;
				System.out.println("mp " + mp);
				timeInWord = Minutes.valueByInt(20) + " " + Minutes.valueByInt(mp)  + " minutes to " + Hour.valueByInt(h+1).name();
			} else {
				timeInWord = Minutes.valueByInt(away) + " minutes to " + Hour.valueByInt(h + 1).name();
			}
		}
		
		System.out.println(h + ":" + min + ", timeInWord : " + timeInWord);
		return timeInWord;
	}
}

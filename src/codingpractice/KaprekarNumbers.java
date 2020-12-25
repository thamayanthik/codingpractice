package codingpractice;

public class KaprekarNumbers {
	public static void main(String[] args) {
		String kapreKarNumb = "";
		int p = 1; int q = 99999;
		
        for (long i=p; i<=q; i++) {
            //convert to string
            String strSquare = String.valueOf(i * i);
	           
            int len =  strSquare.length()/2;
            String part1 = strSquare.substring(0, len);
            String part2 = strSquare.substring(len, strSquare.length());
	           
            long newVal = 0;
            if (!part1.isEmpty()) {
            	newVal = newVal + Long.valueOf(part1);
            }
            if (!part2.isEmpty()) {
            	newVal = newVal + Long.valueOf(part2);
            }
	            	            
            if (newVal == i) {
             	kapreKarNumb = kapreKarNumb + newVal + " ";
            }
            
        }
        if (kapreKarNumb.isEmpty()) {
            System.out.println("INVALID RANGE");
        } else {
            System.out.println(kapreKarNumb);
        }

	}
}

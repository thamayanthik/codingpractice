package codingpractice;

public class StairCaseSolution {

	public static void main(String[] str) {
		int n = 4;
		for (int i = 1; i <= n;i++) {
	        int spaceChar = n - i;
	        for (int j=0;j<spaceChar;j++) {
	            System.out.print(" ");
	        }
	        for (int j=1;j<=i;j++) {
	           System.out.print("#");
	        }
	        System.out.println();
	    }

	}
}

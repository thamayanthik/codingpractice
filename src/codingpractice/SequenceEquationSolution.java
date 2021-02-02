package codingpractice;

public class SequenceEquationSolution {
	
	public static void main(String[] str) {
		int[] p = {2, 3, 1};
		int[] x = new int[p.length];
		
		for (int n = 0; n < p.length; n++) {
			int pofp = p[p[n] - 1];
			x[pofp - 1] = n + 1;
			
		}
		for (int n = 0; n < p.length; n++) {
			System.out.println(" pofp : " + x[n]);
		}
		
	}

}

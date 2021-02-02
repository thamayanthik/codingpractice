package codingpractice;

import java.math.BigInteger;

public class FactorialSolution {
	public static void main(String[] str) {
		int n = 5;
		BigInteger f = new BigInteger("1"); 
	    for (int i = 2; i <= n; i++) 
	        f = f.multiply(BigInteger.valueOf(i));
	    
	    System.out.println("Factorial : " + f);
	}

}

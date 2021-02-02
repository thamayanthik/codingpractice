package codingpractice;

import java.util.ArrayList;
import java.util.List;

public class DiagonalDifferenceSolution {
	
	public static void main(String[] str) {
		List<List<Integer>> arr = new ArrayList<>();
		//11 2 4
		//4 5 6
		//10 8 -12
		List<Integer> a = new ArrayList<Integer>();
		a.add(11);
		a.add(2);
		a.add(4);
		List<Integer> b = new ArrayList<Integer>();
		b.add(4);
		b.add(5);
		b.add(6);
		List<Integer> c = new ArrayList<Integer>();
		c.add(10);
		c.add(8);
		c.add(-12);
		arr.add(a);
		arr.add(b);
		arr.add(c);
		int fdSum = 0;
		int ldSum = 0;
		for (int r = 0; r < arr.size(); r++) {
			List<Integer> row = arr.get(r);
			fdSum += row.get(r);
			ldSum += row.get(arr.size() - (r+1));
			System.out.println("fdSum : " + fdSum + ", ldSum : " + ldSum);
			
		}
		int diff = Math.abs(fdSum-ldSum);
		System.out.println("diff : " + diff);
	}

}

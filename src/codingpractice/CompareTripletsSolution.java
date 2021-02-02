package codingpractice;

import java.util.ArrayList;
import java.util.List;

public class CompareTripletsSolution {

	public static void main(String[] str) {
		List<Integer> a = new ArrayList<Integer>();
		a.add(5);
		a.add(6);
		a.add(7);
		List<Integer> b = new ArrayList<Integer>();
		b.add(3);
		b.add(6);
		b.add(10);
		
		List<Integer> result = new ArrayList<Integer>();
		
		int bobCount = 0;
		int aliceCount = 0;
	    for (int i = 0; i < a.size();i++) {
	          if (a.get(i) > b.get(i)) {
	        	  aliceCount++;
	          } else if (a.get(i) < b.get(i)) {
	        	  bobCount++;
	          }
	    }
	    result.add(0, aliceCount);
		result.add(1, bobCount);
	    for (int i = 0; i <result.size(); i++) System.out.println(result.get(i) + " ");
	}
}

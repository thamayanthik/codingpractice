package amazon;

import java.util.Date;

public class FindItemInCompartmentString {
	public static void main(String[] str) {
		int[] startIndices = {1,3};
		int[] endIndices = {10,5};
		String  s = "*|**|**|*|*|";
		
		Long numberOfItems = 0l;
		System.out.println("Start : " +new Date());
		for (int indice = 0; indice < startIndices.length;indice++) {
			int si = startIndices[indice];
			int ei = endIndices[indice];
			String subStr = s.substring(si, ei);
			System.out.println("Substr : " + subStr);
			boolean stillProcessing = true;
			while (stillProcessing) {
				int firstPipeLine = subStr.indexOf("|");
				int endPipeLine = subStr.indexOf("|", firstPipeLine+1);
				System.out.println("FirstPipeLine " + firstPipeLine + ", endPipeLine : " + endPipeLine);
				if (endPipeLine == -1) {
					stillProcessing = false;
				} else {
					numberOfItems = numberOfItems + (endPipeLine - (firstPipeLine + 1));
					subStr = subStr.substring(endPipeLine, subStr.length());
					System.out.println("subStr " + subStr);
				}
			}
		}
		
		System.out.println("End : " +new Date());
		
		System.out.println("numberOfItems : " + numberOfItems);
	}
}

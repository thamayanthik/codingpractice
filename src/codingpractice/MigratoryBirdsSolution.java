package codingpractice;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;

public class MigratoryBirdsSolution {
	public static void main(String[] str) {
		List<Integer> arr = new ArrayList<Integer>();
		//1 4 4 4 5 3
		arr.add(new Integer(1));
		arr.add(new Integer(2));
		arr.add(new Integer(3));
		arr.add(new Integer(4));
		arr.add(new Integer(5));
		arr.add(new Integer(4));
		arr.add(new Integer(3));
		arr.add(new Integer(2));
		arr.add(new Integer(1));
		arr.add(new Integer(3));
		arr.add(new Integer(4));
		Map<Integer, Integer> countMap = new HashMap<Integer, Integer>();
		int maxCount = 0;
		for (Integer a : arr) {
			Integer count = 1;
			if (countMap.containsKey(a)) {
				Integer preCount = countMap.get(a);
				count = ++preCount;
			} 
			countMap.put(a, count);
			
			if (count > maxCount) {
				maxCount = count;
			}
		}
		
		final Integer mCount = maxCount;
		Map<Integer, Integer> numberWithSameCountMap = countMap.entrySet().stream().filter(e -> e.getValue().equals(mCount)).collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue));
		
		Set<Integer> numberWithSameCount = numberWithSameCountMap.keySet();
		//Find Smallest
		Integer result = Integer.MAX_VALUE;
		for (Integer number : numberWithSameCount) {
			if (number < result) {
				result = number;
			}
		}
		
		System.out.println("Result : " + result);
	}

}

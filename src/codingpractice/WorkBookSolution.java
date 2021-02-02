package codingpractice;

public class WorkBookSolution {
	
	public static void main(String[] str) {
		int n = 5;
		int k = 3;
		int[] arr = {4, 2, 6, 1, 10};
		int total = workbook(n,k, arr);
		System.out.println(total);
	}

	static int workbook(int n, int k, int[] arr) {
		int numberOfSpecialProblems = 0;

		int i = 0;
		int page = 0;
		while (i < n) {
			int problemPerChapter = arr[i];
			
			int pageRequired = problemPerChapter / k;
			int remainingProblem = problemPerChapter - (pageRequired * k);
			if (remainingProblem > 0) {
				pageRequired++;
			}
			
			int baseProblemNo = 1;
			int lastProblemNo = 0;
			while (pageRequired > 0) {
				page++;
				
				if ((lastProblemNo + k) < problemPerChapter) {
					lastProblemNo = lastProblemNo + k;
				} else {
					lastProblemNo = lastProblemNo + (problemPerChapter - lastProblemNo);
				}
				if (page >= baseProblemNo && page <= lastProblemNo) {
					numberOfSpecialProblems++;
				}
				baseProblemNo = lastProblemNo + 1;
				pageRequired--;
			}
			i++;
		}
		
		return numberOfSpecialProblems;
    }
}

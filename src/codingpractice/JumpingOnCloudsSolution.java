package codingpractice;

public class JumpingOnCloudsSolution {
	public static void main(String[] str) {
		int c[] = {0, 0, 0, 1 ,0, 0};
		int jumpCount = calculateJumpCount(c);
		
		System.out.println("JumpCount : " + jumpCount);
		
		int c1[] = {0, 0, 1 ,0 ,0, 1 ,0};
		
		jumpCount = calculateJumpCount(c1);
		
		System.out.println("JumpCount : " + jumpCount);
		
	}

	private static int calculateJumpCount(int[] c) {
		int jumpCount = 0;
		int index = 0;
		while (index < c.length - 1) {
		   if (c[index] == 0) {
			   if (index + 2 < c.length && c[index + 2] == 0) {
				   jumpCount++;
				   index +=2;
			   } else {
				   jumpCount++;
				   index++;
			   }
		   }
		}
		return jumpCount;
	}

}

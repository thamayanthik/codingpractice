package codingpractice;

public class JumpingOnClouds {
	public static void main(String[] str) {
		int c[] = {1, 1, 0, 1, 0, 1, 0, 1, 0, 1, 0, 1, 1, 0, 1, 1, 1, 1, 1};
		int k = 19;
		int e = 100;
		// decrease 1 unit jump to k, reduce additional 2 if thunder cloud
		//If c[i] = 0, then cloud  is a cumulus cloud.
		//If  c[i] = 1, then cloud  is a thunderhead.
		int jumpIndex = 0;
		while(jumpIndex < c.length) {
			int nextJumpPoint = jumpIndex + k;
			if (nextJumpPoint < c.length) {
				jumpIndex += k;
			} else {
				int remain = c.length - jumpIndex;
				jumpIndex = k - remain;
			}
			
			e = e - 1;
			if (c[jumpIndex] == 1) {
				e = e - 2;
			}
			
			if (jumpIndex == 0) {
				break;
			} 
			
		}
		
		System.out.println(e);
	}

	
}

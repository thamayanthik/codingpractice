package codingpractice;

public class CavityMapSolution {
	public static void main(String[] str) {
		String[] grid = {"179443854", "961621369", "164139922","968633951","812882578", "257829163", "812438597","176656233","485773814"};
		int i = 1;
		while(i < grid.length - 1) {
            String value = grid[i];
            char[] pa = grid[i-1].toCharArray();
            char[] ca = value.toCharArray();
            char[] ba = grid[i+1].toCharArray();
            int j = 1;
            while(j < ca.length - 1) {
            	if (!(String.valueOf(pa[j]).contains("X") || String.valueOf(ba[j]).contains("X"))) {
            		Integer topRowValue = Integer.valueOf(String.valueOf(pa[j]));
                	Integer bottomRowValue = Integer.valueOf(String.valueOf(ba[j]));
                    Integer preValue = Integer.valueOf(String.valueOf(ca[j - 1]));
                    Integer nextValue = Integer.valueOf(String.valueOf(ca[j + 1]));
                    Integer current = Integer.valueOf(String.valueOf(ca[j]));
                    
                    if (current > topRowValue && current > bottomRowValue && preValue < current && current > nextValue) {
                    	ca[j] = 'X';
                        j +=2;
                    } else {
                    	j++;
                    }
            	} else {
            		j++;
            	}
            	
            }
            
            grid[i] = String.valueOf(ca);
            i++;
        }

		for (int k = 0; k<grid.length;k++) 
			 System.out.println("Cavity : " + grid[k]);
	}
}

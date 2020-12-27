package test.com.coding.practice.problems;

import static org.junit.Assert.assertArrayEquals;

import java.util.Arrays;
import java.util.Collection;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

import dailycodingpgm.ProductOfAll;

@RunWith(Parameterized.class)
public class AllTests  {
	
	private int[] arrayIn;
    private int[] arrayOut;
    
    public AllTests(int[] arrayIn, int[] arrayOut) {
        this.arrayIn= arrayIn;
        this.arrayOut=arrayOut;   
    }

   
    // creates the test data
    @Parameters
    public static Collection<Object[]> parameters(){
        return Arrays.asList(new Object[][]{
            {new int[] {1, 2, 3, 4, 5}, new int[] {120, 60, 40, 30, 24}},
            {new int[] {1, 1, 1, 1, 1}, new int[] {1, 1, 1, 1, 1}},
        });
    }


	@Test
	public void test() {
		assertArrayEquals("test", arrayOut, ProductOfAll.solution1(arrayIn));
	}

}

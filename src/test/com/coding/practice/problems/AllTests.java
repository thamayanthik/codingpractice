package test.com.coding.practice.problems;

import java.util.Arrays;
import java.util.Collection;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameter;
import org.junit.runners.Parameterized.Parameters;

@RunWith(Parameterized.class)
public class AllTests  {
	
	// fields used together with @Parameter must be public
    @Parameter(0)
    public int[] m1;
   
    // creates the test data
    @Parameters
    public static Collection<Object[]> data() {
    	 Object[][] data = new Object[][] { { 1 , 2 }, { 5, 3 }, { 121, 4 } };
         return Arrays.asList(data);
    }


	@Test
	public void test() {
		
	}

}

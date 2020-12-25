package test.com.coding.interview.problems;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameter;
import org.junit.runners.Parameterized.Parameters;

import dailycodingpgm.ProductOfAll;

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
		int a[] = { 1 , 2, 2 };
		assertEquals("10 x 0 must be 0", 0  , ProductOfAll.solution1(m1) );
	}

}

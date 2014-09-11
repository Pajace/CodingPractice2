package leecodeoj;

import org.junit.Assert;
import org.junit.Test;

public class SelectPersonLogic_Unittest {

	@Test
	public void test() {
		int[] expecteds = { 3, 6, 9, 2, 7, 1, 8 };
		int[] actuals = SelectPersonLogic.Select(10, 3, 3, 7);

		Assert.assertArrayEquals(expecteds, actuals);
	}

	@Test
	public void test2() {
		int[] expecteds = { 6, 11, 4, 10, 5, 1, 9 };
		int[] actuals = SelectPersonLogic.Select(12, 6, 5, 7);

		Assert.assertArrayEquals(expecteds, actuals);
	}
	
	@Test
	public void test3() {
		int[] expecteds = { 4, 8, 2, 7, 3, 10 };
		int[] actuals = SelectPersonLogic.Select(10, 4, 4, 6);

		Assert.assertArrayEquals(expecteds, actuals);
	}
	
	@Test
	public void test4() {
		int[] expecteds = { 8, 3, 14, 11, 9, 7, 10, 13, 2, 12 };
		int[] actuals = SelectPersonLogic.Select(15, 8, 10, 10);

		Assert.assertArrayEquals(expecteds, actuals);
	}
	
	@Test
	public void test5(){
        int[] expecteds = { 2, 6, 10, 5, 1 };
        int[] actuals = SelectPersonLogic.Select(10, 2, 4, 5);
        
        Assert.assertArrayEquals(expecteds, actuals);
	}
}

package leecodeoj;

import org.junit.Assert;
import org.junit.Test;

public class BestTimeToBy_II_Unittest {

	private void assertMaxProfit(int prices[], int expectedMaxProfit) {
		BestTimeToBy_II b = new BestTimeToBy_II();

		int actualMaxProfit = b.maxProfit(prices);

		Assert.assertEquals(expectedMaxProfit, actualMaxProfit);
	}

	@Test
	public void maxProfit_testcase1() {
		int expectedProfit = 0;
		int[] prices = {};

		assertMaxProfit(prices, expectedProfit);
	}

	@Test
	public void maxProfit_testcase2() {
		int expectedProfit = 0;
		int[] prices = { 2, 1 };

		assertMaxProfit(prices, expectedProfit);
	}

	@Test
	public void maxProfit_testcase3() {
		int expectedProfit = 3;
		int[] prices = { 1, 2, 4 };

		assertMaxProfit(prices, expectedProfit);
	}

	@Test
	public void maxProfit_testcase4() {
		int expectedProfit = 5;
		int[] prices = { 1, 5, 2, 3 };

		assertMaxProfit(prices, expectedProfit);
	}

	@Test
	public void maxProfit_testcase5() {
		int expectedProfit = 16;
		int[] prices = { 1, 1, 2, 10, 11, 13, 5, 1, 5, 0 };

		assertMaxProfit(prices, expectedProfit);
	}
	
	@Test
	public void maxProfit_testcase6() {
		int expectedProfit = 8;
		int[] prices = { 3, 3, 5, 0, 0, 3, 1, 4 };

		assertMaxProfit(prices, expectedProfit);
	}

}

package leecodeoj;

import org.junit.Assert;
import org.junit.Test;

public class BestTimeToBy_I_Unittest {

	private void assertMaxProfit(int prices[], int expectedMaxProfit) {
		BestTimeToBy_I b = new BestTimeToBy_I();

		int actualMaxProfit = b.maxProfit(prices);

		Assert.assertEquals(expectedMaxProfit, actualMaxProfit);
	}

	@Test
	public void test() {
		int price[] = { 3, 2, 6, 5, 0, 3 };
		int expectedProfit = 4;

		assertMaxProfit(price, expectedProfit);
	}

	@Test
	public void test1() {
		int expectedProfit = 0;
		int[] prices = {};

		assertMaxProfit(prices, expectedProfit);
	}

	@Test
	public void test2() {
		int expectedProfit = 0;
		int[] prices = { 2, 1 };

		assertMaxProfit(prices, expectedProfit);
	}

}

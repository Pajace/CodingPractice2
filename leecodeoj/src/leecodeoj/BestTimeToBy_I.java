package leecodeoj;

public class BestTimeToBy_I {

	public int maxProfit(int[] prices) {

		if (prices.length == 0)
			return 0;

		int minPrice = prices[0];
		int profit = 0;
		int predictProfit = 0;
		for (int i = 0; i < prices.length; i++) {
			if ( prices[i] < minPrice)
				minPrice = prices[i];
			
			predictProfit = prices[i] - minPrice;
			if (predictProfit > profit)
				profit = predictProfit;
		}

		return profit;
	}

}

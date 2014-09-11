package leecodeoj;

public class BestTimeToBy_II {

	public int maxProfit(int[] prices) {

		if (prices.length <= 1)
			return 0;

		int minPrice = prices[0];
		int pridictProfit = 0;
		int totalProfit = 0;
		for (int i = 0; i < prices.length; i++) {
			if (minPrice > prices[i]) // keep tracking for minimal price to buy
				minPrice = prices[i];

			pridictProfit = prices[i] - minPrice;
			if (pridictProfit > 0) { // has profit, sell it
				totalProfit += pridictProfit; 
				minPrice = prices[i]; // keep tracking for minimal price to buy
			}
		}

		return totalProfit;
	}
}

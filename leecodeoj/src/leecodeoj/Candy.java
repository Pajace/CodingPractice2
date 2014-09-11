package leecodeoj;

public class Candy {

	public int calculateMinimunCandies(int[] ratings) {

		if (ratings == null || ratings.length == 0)
			return 0;
		else if (ratings.length == 1)
			return 1;

		int[] candies = new int[ratings.length];
		candies[0] = 1;

		for (int i = 1; i < ratings.length; i++) {
			if (ratings[i - 1] < ratings[i]) {
				candies[i] = candies[i - 1] + 1;
			} else {
				candies[i] = 1;
			}
		}

		for (int i = ratings.length - 1; i > 0; i--) {
		 if (ratings[i] < ratings[i - 1] && candies[i] >= candies[i - 1]) {
				candies[i - 1] = candies[i] + 1;
			}
		}

		int total = 0;
		for (int i = 0; i < candies.length; i++)
			total += candies[i];
		return total;
	}

}

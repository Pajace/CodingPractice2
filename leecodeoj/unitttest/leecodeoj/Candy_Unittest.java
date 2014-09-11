package leecodeoj;

import org.junit.Assert;
import org.junit.Test;


public class Candy_Unittest {

	private void AssertMinimunCandiesYouMustGive(int expected, int[] ratings) {
		Candy candy = new Candy();
		
		int actual = candy.calculateMinimunCandies(ratings);
		
		Assert.assertEquals(expected, actual);
	}
	
	@Test
	public void test() {
		int[] ratings = {3, 2, 1, 4, 3};
		int expected = 9;
		
		AssertMinimunCandiesYouMustGive(expected, ratings);
	}
	
	@Test
	public void test1(){
		int[] ratings = {3, 2, 1, 1, 4, 3, 3};
		int expected = 11;
		
		AssertMinimunCandiesYouMustGive(expected, ratings);
	}
	

	@Test
	public void noElement(){
		int[] ratings = {};
		int expected = 0;
		
		AssertMinimunCandiesYouMustGive(expected, ratings);
	}
	
	@Test
	public void noElement2(){
		int[] ratings = null;
		int expected = 0;
		
		AssertMinimunCandiesYouMustGive(expected, ratings);
	}

	@Test
	public void oneElement(){
		int[] ratings = {100};
		int expected = 1;
		
		AssertMinimunCandiesYouMustGive(expected, ratings);
	}
	
	@Test
	public void twoElementDecrease(){
		int[] ratings = {4, 3};
		int expected = 3;
		
		AssertMinimunCandiesYouMustGive(expected, ratings);
	}
	
	@Test
	public void twoElementIncrease(){
		int[] ratings = {1, 5};
		int expected = 3;
		
		AssertMinimunCandiesYouMustGive(expected, ratings);
	}
		
	@Test
	public void threeElementIncrease(){
		int[] ratings = {1, 2, 3};
		int expected = 6;
		
		AssertMinimunCandiesYouMustGive(expected, ratings);
	}

	@Test
	public void threeElementDecrease(){
		int[] ratings = {30, 25, 13};
		int expected = 6;
		
		AssertMinimunCandiesYouMustGive(expected, ratings);
	}
	
	@Test 
	public void comprehensiveTest1(){
		int[] ratings = {1,2,3,4,5,6,7,8,8,7,7,8,8,5,3,1,9};
		int expected = 54;
		
		AssertMinimunCandiesYouMustGive(expected, ratings);
	}
	
	@Test
	public void comprehensiveTest2(){
		int[] ratings = {1, 2, 2};
		int expected = 4;
		
		AssertMinimunCandiesYouMustGive(expected, ratings);
	}
	
}

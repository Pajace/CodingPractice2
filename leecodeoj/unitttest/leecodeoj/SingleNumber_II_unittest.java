package leecodeoj;

import org.junit.Assert;
import org.junit.Test;

public class SingleNumber_II_unittest {

	@Test
	public void SingleNumber_TestCase1() {
		int[] sourceData = { 1,2,2,2,3,3,3,4,4,4,5,5,5,7,7,7,1,1,9 };		
		int expected = 9;
		
		AssertTheSingleNumber(sourceData, expected);
	}

	private void AssertTheSingleNumber(int[] sourceData, int expected) {
		SingleNumberII singleNumber = new SingleNumberII();
		int actual = singleNumber.findSingleNumber(sourceData);
		
		Assert.assertEquals(expected, actual);
	}


}

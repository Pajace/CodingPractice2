package leecodeoj;

import static org.junit.Assert.*;

import org.junit.Test;

public class SingleNumber_Unittest {

	private void AssertAreEquals(int[] sourceData, int expected) {
		SingleNumber n = new SingleNumber();
		
//		int actual = n.singleNumber(sourceData);
		int actual = n.singleNumber_way1(sourceData);
		
		assertEquals(expected, actual);
	}
	
	@Test
	public void SingleNumber_TestCase1() {
		int[] sourceData = { 1,2,3,4,5,1,2,3,5 };		
		int expectedNumber = 4;
		
		AssertAreEquals(sourceData, expectedNumber);
	}

}

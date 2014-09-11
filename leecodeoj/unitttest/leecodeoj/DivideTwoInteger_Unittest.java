package leecodeoj;

import org.junit.Assert;
import org.junit.Test;

public class DivideTwoInteger_Unittest {

	private void AssertDivideTwoInteger(int dividend, int divisor, int expected) {
		int actual = DivideTwoIntegers.divide3(dividend, divisor);

		Assert.assertEquals(expected, actual);
	}

	@Test
	public void testCase1() {
		int dividend = 8;
		int divisor = 2;
		int expected = 4;

		AssertDivideTwoInteger(dividend, divisor, expected);
	}

	@Test
	public void divisorIs0() {
		int dividend = 10;
		int divisor = 0;
		int expected = 0;

		AssertDivideTwoInteger(dividend, divisor, expected);
	}

	@Test
	public void divisorIsNegative() {
		int dividend = 1;
		int divisor = -1;
		int expected = -1;

		AssertDivideTwoInteger(dividend, divisor, expected);
	}
	
	@Test
	public void divisorIsNegative2() {
		int dividend = -1;
		int divisor = 1;
		int expected = -1;

		AssertDivideTwoInteger(dividend, divisor, expected);
	}

	@Test
	public void divisorDivisorIs1() {
		int dividend = 2147483647;
		int divisor = 1;
		int expected = 2147483647;

		AssertDivideTwoInteger(dividend, divisor, expected);
	}

	@Test
	public void twoBigNegativeNumber() {
		int dividend = -1010369383;
		int divisor = -2147483648;
		int expected = 0;

		AssertDivideTwoInteger(dividend, divisor, expected);
	}

	@Test
	public void TestCase_BigNumberDivideTwo() {
		int dividend = 2147483647;
		int divisor = 2;
		int expected = 1073741823;

		AssertDivideTwoInteger(dividend, divisor, expected);
	}
	
	@Test
	public void TestCase_36Divide7_Got5() {
		int dividend = 36;
		int divisor = 7;
		int expected = 5;

		AssertDivideTwoInteger(dividend, divisor, expected);
	}
	
	@Test
	public void BigNumberDivide2() {
		int dividend = -2147483648;
		int divisor = 2;
		int expected = -1073741824;

		AssertDivideTwoInteger(dividend, divisor, expected);
	}
}

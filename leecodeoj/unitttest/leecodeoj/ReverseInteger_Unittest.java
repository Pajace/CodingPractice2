package leecodeoj;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class ReverseInteger_Unittest {

	private void AssertReverseInteger(int inputNumber, int expected) {
		ReverseInteger r = new ReverseInteger();
		int actual = r.reverse3(inputNumber);
		
		assertEquals(expected, actual);
	}

	@Test
	public void ReverseInteger_reverse_case1() {
		int expected = 321;
		int inputNumber = 123;

		AssertReverseInteger(inputNumber, expected);
	}

	@Test
	public void ReverseInteger_reverse_case2() {
		int expected = -321;
		int inputNumber = -123;

		AssertReverseInteger(inputNumber, expected);
	}

	@Test
	public void ReverseInteger_reverse_case3() {
		int expected = -789456123;
		int inputNumber = -321654987;

		AssertReverseInteger(inputNumber, expected);
	}

	@Test
	public void ReverseInteger_reverse_case4() {
		int expected = 987654321;
		int inputNumber = 1234567890;

		AssertReverseInteger(inputNumber, expected);
	}

}

package leecodeoj;

public class DivideTwoIntegers {

	// public static int divide(int dividend, int divisor) {
	// if (divisor == 0)
	// return 0;
	// else if (divisor == 1)
	// return dividend;
	//
	// long unDividend = dividend;
	// long unDivisor = divisor;
	// unDividend = Math.abs(dividend);
	// unDivisor = Math.abs(divisor);
	//
	// boolean isNegative = false;
	// if (dividend > 0 ^ divisor > 0)
	// isNegative = true;
	//
	// int quotient = 0;
	// while (unDividend >= unDivisor) {
	// unDividend -= unDivisor;
	// quotient++;
	// }
	//
	// if (isNegative)
	// return -quotient;
	//
	// return quotient;
	// }

	public static int divide(int dividend, int divisor) {
		if (divisor == 0)
			return 0;
		else if (divisor == 1)
			return dividend;

		long unDividend = dividend;
		long unDivisor = divisor;
		unDividend = Math.abs(unDividend);
		unDivisor = Math.abs(unDivisor);

		boolean isNegative = false;
		if (dividend > 0 ^ divisor > 0)
			isNegative = true;

		long absDivisor = unDivisor;
		long quotient = 1;
		while (unDividend >= unDivisor) {
			unDivisor = unDivisor << 1;
			quotient = quotient << 1;
		}

		while (unDivisor > unDividend) {
			unDivisor -= absDivisor;
			quotient--;
		}

		if (isNegative)
			return (int) -quotient;

		return (int) quotient;
	}

	public static int divide2(int dividend, int divisor) {
		if (divisor == 0)
			return 0;
		else if (divisor == 1)
			return dividend;

		long unsignedDividend = dividend;
		long unsignedDivisor = divisor;
		unsignedDividend = Math.abs(unsignedDividend);
		unsignedDivisor = Math.abs(unsignedDivisor);

		boolean isNegative = false;
		if (dividend < 0 ^ divisor < 0)
			isNegative = true;

		long absDivisor = unsignedDivisor;
		int step = 0;

		while (unsignedDividend >= unsignedDivisor) {
			unsignedDivisor = unsignedDivisor << 1;
			step++;
		}

		int quotient = 0;
		while (unsignedDividend >= absDivisor) {
			if (unsignedDividend >= unsignedDivisor) {
				unsignedDividend -= unsignedDivisor;
				quotient += 1 << step;
			}
			unsignedDivisor = unsignedDivisor >> 1;
			step--;
		}

		if (isNegative)
			return -quotient;

		return quotient;
	}

	public static int divide3(int dividend, int divisor) {
		if (divisor == 0)
			return 0;
		else if (divisor == 1)
			return dividend;

		long unDividend = dividend;
		long unDivisor = divisor;
		unDividend = Math.abs(unDividend);
		unDivisor = Math.abs(unDivisor);
		long absDivisor = unDivisor;

		boolean isNegative = false;
		if (dividend > 0 ^ divisor > 0)
			isNegative = true;

		long quotient = 1;
		while (unDividend >= unDivisor) {
			unDivisor = unDivisor << 1;
			quotient = quotient << 1;
		}

		while (unDivisor > unDividend) {
			unDivisor = unDivisor >> 1;
			quotient = quotient >>1;
		}
		
		while (unDivisor < unDividend) {
			unDivisor += absDivisor;
			quotient++;
		}

		if(unDivisor!=unDividend)
			quotient--;
		
		if (isNegative)
			return (int) -quotient;

		return (int) quotient;
	}

}

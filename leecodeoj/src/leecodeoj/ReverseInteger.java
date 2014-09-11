package leecodeoj;

import java.util.Stack;

public class ReverseInteger {

	public int reverse(int x) {
		boolean isNegativeInt = x < 0;

		if (isNegativeInt) {
			x *= -1;
		}

		String xString = String.valueOf(x);
		char[] xArray = xString.toCharArray();

		Stack<Character> stack = new Stack<Character>();

		for (int i = 0; i < xArray.length; i++) {
			stack.push(xArray[i]);
		}

		StringBuilder builder = new StringBuilder();
		while (!stack.empty()) {
			builder.append(stack.pop());
		}

		int result = Integer.valueOf(builder.toString());
		if (isNegativeInt)
			result *= -1;

		return result;
	}

	
	public int reverse3(int x) {
		boolean isNegativeInt = x < 0;

		if (isNegativeInt)
			x *= -1;

		int result = 0;

		int tmp = x;
		while (true) {
			int digit = tmp%10;
			result = result * 10 + digit;
			tmp /=10;
			if (tmp == 0)
				break;
		}

		if (isNegativeInt)
			result *= -1;

		return result;
	}

}

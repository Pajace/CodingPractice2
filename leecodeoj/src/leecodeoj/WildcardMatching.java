package leecodeoj;

public class WildcardMatching {

	public boolean isMatch(String text, String pattern) {
		char[] textArray = text.toCharArray();
		char[] patternArray = pattern.toCharArray();
		int textIndex = 0;
		int patternIndex = 0;
		int startIndex = -1;
		int ss = textIndex;

		while (textIndex < textArray.length) {

			boolean isNotPatternEnd = patternIndex < patternArray.length;

			if (isNotPatternEnd
					&& ((patternArray[patternIndex] == '?') || (patternArray[patternIndex] == textArray[textIndex]))) {
				textIndex++;
				patternIndex++;
				continue;
			}
			if (isNotPatternEnd && patternArray[patternIndex] == '*') {
				startIndex = patternIndex++;
				ss = textIndex;
				continue;
			}
			if (startIndex != -1) {
				patternIndex = startIndex + 1;
				textIndex = ++ss;
				continue;
			}

			return false;
		}

		while (patternIndex < patternArray.length
				&& patternArray[patternIndex] == '*')
			patternIndex++;

		return patternIndex == patternArray.length;
	}
}

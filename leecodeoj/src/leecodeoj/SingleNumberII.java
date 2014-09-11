package leecodeoj;

public class SingleNumberII {

	public int findSingleNumber(int[] A) {

		int ones = 0, twos = 0, threes = 0;
	    for (int i = 0; i < A.length; i++) {
	        twos = (twos | (ones & A[i]) );
	        ones = ones ^ A[i];
	        threes = ones & twos;
	        ones &= ~threes;
	        twos &= ~threes;
	    }
	    return ones;
	}

}

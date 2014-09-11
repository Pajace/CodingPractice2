package leecodeoj;

import java.util.Arrays;

public class SingleNumber {

	public SingleNumber() {
	}

	public int singleNumber(int[] A) {

		Arrays.sort(A);

		boolean isFirstHit = true;
		int result = -1;
		for (int i = 0; i < A.length; i++) {
			if (isFirstHit) {
				result = A[i];
				isFirstHit = false;
			} else {
				if (result == A[i])
					isFirstHit = true;
				else
					break;
			}
		}

		return result;
	}
	
	public int singleNumber_way1(int[] A){
		int result = A[0];
		
		for(int i=1; i<A.length; i++){
			result = result ^ A[i];
		}
		return result;
	}
}

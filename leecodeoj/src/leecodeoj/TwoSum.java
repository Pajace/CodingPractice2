package leecodeoj;

public class TwoSum {

	public int[] findTwoSumIndex(int[] numbers, int target) {
        int i = 0;
        int j = 0;
        boolean isFinished = false;
        
        for(i = 0; i< numbers.length; i++) {
            for(j=i+1; j<numbers.length; j++) {
                if ( (numbers[i] + numbers[j]) == target ){
                    isFinished = true;
                    break;
                }
            }
            if (isFinished)
                break;
        }
        
        int[] result = {i+1, j+1};
        return result;
	}

}

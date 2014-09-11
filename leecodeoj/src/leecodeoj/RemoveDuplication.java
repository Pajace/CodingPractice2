package leecodeoj;

public class RemoveDuplication {

	public int getDuplicationFromSortedArray(int[] data) {

		if (data.length == 0)
			return 0;

		int index = 0;
		for (int i = 0; i < data.length; i++) {
			if (data[index] != data[i]) {
				index++;
				data[index] = data[i];
			}
		}
		return index + 1;
	}
}

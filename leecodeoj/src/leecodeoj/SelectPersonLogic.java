package leecodeoj;

import java.util.LinkedList;
import java.util.List;

public class SelectPersonLogic {

	public static int[] Select(int totalPerson, int startNumber, int interval,
			int countOfSelectPerson) {

		List<Integer> personQueue = new LinkedList<Integer>();
		int[] selectedPerson = new int[countOfSelectPerson];

		for (int i = 1; i <= totalPerson; i++)
			personQueue.add(i);

		int selectedIndex = startNumber - 1;
		for (int i = 0; i < countOfSelectPerson; i++) {
			selectedPerson[i] = personQueue.get(selectedIndex);

			personQueue.remove(selectedIndex);
			selectedIndex--;

			selectedIndex += interval;
			selectedIndex %= personQueue.size();
		}

		return selectedPerson;
	}
}

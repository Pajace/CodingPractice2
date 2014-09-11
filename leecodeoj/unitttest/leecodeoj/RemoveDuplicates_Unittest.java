package leecodeoj;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class RemoveDuplicates_Unittest {

	@Test
	public void testcase(){
		int [] data = {};
		int [] expected = {};
		
		AssertRemoveDuplication(data, expected);
	}
	
	@Test
	public void testCase0(){
		int [] data = {1};
		int [] expected = {1};
		
		AssertRemoveDuplication(data, expected);
	}
	
	@Test
	public void testCase1(){
		int [] data = {1, 1};
		int [] expected = {1};
		
		AssertRemoveDuplication(data, expected);
	}
	
	@Test
	public void testCase2(){
		int [] data = {1, 2};
		int [] expected = {1, 2};
		
		AssertRemoveDuplication(data, expected);
	}
	
	@Test
	public void testCase3(){
		int [] data = {1, 1, 1};
		int [] expected = {1};
		
		AssertRemoveDuplication(data, expected);
	}
	
	@Test
	public void testCase4(){
		int [] data = {1, 2, 2};
		int [] expected = {1, 2};
		
		AssertRemoveDuplication(data, expected);
	}
	
	@Test
	public void testCase5(){
		int [] data = {1, 1, 2};
		int [] expected = {1, 2};
		
		AssertRemoveDuplication(data, expected);
	}
	
	@Test
	public void testCase6(){
		int [] data = {1, 2, 3};
		int [] expected = {1, 2, 3};
		
		AssertRemoveDuplication(data, expected);
	}
	
	@Test
	public void testCase7(){
		int [] data = {1, 1, 1, 1};
		int [] expected = {1};
		
		AssertRemoveDuplication(data, expected);
	}
	
	@Test
	public void testCase8(){
		int [] data = {1, 1, 2, 2};
		int [] expected = {1, 2};
		
		AssertRemoveDuplication(data, expected);
	}
	
	@Test
	public void testCase9() {
		int[] data = { 1, 1, 2, 3 };
		int[] expected = { 1, 2, 3 };

		AssertRemoveDuplication(data, expected);
	}
	

	private void AssertRemoveDuplication(int[] data, int[] exptecedArray) { 
		RemoveDuplication r = new RemoveDuplication();
		int actualLength = r.getDuplicationFromSortedArray(data);

		assertEquals(exptecedArray.length, actualLength);

		for(int i=0; i<actualLength; i++)
			assertEquals(data[i], exptecedArray[i]);
	}

}

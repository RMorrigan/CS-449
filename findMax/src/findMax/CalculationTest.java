package findMax;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class CalculationTest {

	@Test
	public void testFindMax() {		
		assertEquals(42, Calculation.findMax(new int[] {19,23,42,}));
		
	}
	
	@Test
	public void testReverseWord() {
		String test = "Dystopian";
		System.out.println(test);
		System.out.println(Calculation.reverseWord(test));
		assertEquals("naipotsyD",Calculation.reverseWord(test));
		
	}
	

}

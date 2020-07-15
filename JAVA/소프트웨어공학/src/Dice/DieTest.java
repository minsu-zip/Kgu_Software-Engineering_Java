package Dice;

import static org.junit.Assert.*;

import org.junit.Test;

public class DieTest {
	@Test
	public void testGetFaceValue() { // fail("Not yet implemented"); 
		Die die = new Die(); die.roll();
		int fv = die.getFaceValue();
		assertTrue(fv >= 1 && fv <= 6);
	}

	@Test
	public void testRoll() { // fail("Not yet implemented"); 
		
		Die die = new Die(); 
		assertEquals(0, die.getFaceValue());

		die.roll();
		assertTrue(die.getFaceValue() != 0);
	}
}
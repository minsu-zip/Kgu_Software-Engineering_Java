package Triangle;

import static org.junit.Assert.*;
import org.junit.Test;

public class TriangleChckerTest {
	TriangleChecker1 checker = new TriangleChecker1();

//	@Test
//	public void test1() {
//		final String type = checker.check(1, 2, 3);
//		assertEquals("SCALENE", type);
//	}

	@Test
	public void testInvalid1() {
		final String type = checker.check(1, 2, 4);
		assertEquals("INVALID", type);
	}

	@Test
	public void testInvalid2() {
		final String type = checker.check(1, 4, 2);
		assertEquals("INVALID", type);
	}

	@Test
	public void testInvalid3() {
		final String type = checker.check(4, 1, 2);
		assertEquals("INVALID", type);
	}

	@Test
	public void testInvalidNeg1() {
		final String type = checker.check(-1, 1, 1);
		assertEquals("INVALID", type);
	}

	@Test  
	public void testInvalidNeg2() {      
		final String type = checker.check(1, -1, 1);      
		assertEquals("INVALID", type);
	}

	@Test
	public void testInvalidNeg3() {
		final String type = checker.check(1, 1, -1);
		assertEquals("INVALID", type);
	}

	@Test
	public void testEquiliteral() {
		final String type = checker.check(1, 1, 1);
		assertEquals("EQUILATERAL", type);
	}

	@Test
	public void testIsoceles1() {
		final String type = checker.check(2, 2, 3);
		assertEquals("ISOSCELES", type);
	}

	@Test
	public void testIsoceles2() {
		final String type = checker.check(2, 3, 2);
		assertEquals("ISOSCELES", type);
	}

	@Test
	public void testIsoceles3() {
		final String type = checker.check(3, 2, 2);
		assertEquals("ISOSCELES", type);
	}

	@Test
	public void testInvalid() {
		final String type = checker.check(3, 1, 1);
		assertEquals("INVALID", type);
	}
}
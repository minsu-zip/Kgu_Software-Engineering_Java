package homework6;
import static org.junit.Assert.*;
import org.junit.Test;

public class randomTest {

	random ran = new random();
	
	@Test
	public void test() {
		assertEquals(true, ran.Dice(5,1));
	}
	@Test
	public void test1() {
		assertEquals(false, ran.Dice(5,0));
	}
	@Test
	public void test2() {
		assertEquals(false, ran.Dice(0,1));
	}
	@Test
	public void test3() {
		assertEquals(false, ran.Dice(0,-1));
	}
	@Test
	public void test4() {
		assertEquals(true, ran.Dice(-1,-1));
	}
}

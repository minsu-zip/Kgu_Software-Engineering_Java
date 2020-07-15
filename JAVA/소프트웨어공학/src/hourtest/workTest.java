package hourtest;
import static org.junit.Assert.*;
import org.junit.Test;

public class workTest {

	work6 ran = new work6();
	
	@Test
	public void test() {
		assertEquals(true, ran.Dice(5,1));
	}
	
	@Test
	public void test1() {
		assertEquals(false, ran.Dice(0,5));
	}
	

	
}

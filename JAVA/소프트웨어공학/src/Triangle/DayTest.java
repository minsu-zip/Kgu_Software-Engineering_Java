package Triangle;
import static org.junit.Assert.*;
import org.junit.Test;

public class DayTest {
	Day day = new Day();
	
	public void testGetYearDay() {
		
	    assertEquals(0, day.getDay(1));
	    assertEquals(365, day.getDay(2));
	}
	
	public void testLeapYear() {
	    assertTrue(day.isLeapYear(0));
	    assertFalse(day.isLeapYear(1));
	    assertTrue(day.isLeapYear(4));
	}
	
	public void testGetMonthDay() {
	    assertEquals(0, day.getMonthDay(1));
	    assertEquals(31, day.getMonthDay(2));
	}
	
	public void testGetTotalDay() {
	    assertEquals(1, day.getTotalDay("00010101"));
	    assertEquals(366, day.getTotalDay("00020101"));
	}
	
	public void testSubDate() {
	    assertEquals(1, day.sub("20061231", "20070101"));
	    assertEquals(31+28+30+31+14, 
	            day.sub("20070101", "20070515"));
	    assertEquals(31+29+30+31+14, 
	            day.sub("20080101", "20080515"));
	}
}

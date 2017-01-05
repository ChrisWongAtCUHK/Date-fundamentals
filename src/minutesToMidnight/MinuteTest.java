package minutesToMidnight;

import static org.junit.Assert.*;

import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

import org.junit.Test;

public class MinuteTest {

	@Test
    public void exampleTest1(){
		Minute m = new Minute();
		Calendar cal = new GregorianCalendar();
		cal.set(Calendar.HOUR_OF_DAY, 12);
		cal.set(Calendar.MINUTE, 0);
		cal.set(Calendar.SECOND, 0);
		cal.set(Calendar.MILLISECOND, 0);
		Date d = cal.getTime();
		assertEquals("720 minutes", m.countMinutes(d));
    }
	
	@Test 
	public void exampleTest2(){
		Minute m = new Minute();
		Calendar cal = new GregorianCalendar();
		cal.set(Calendar.HOUR_OF_DAY, 23);
		cal.set(Calendar.MINUTE, 59);
		cal.set(Calendar.SECOND, 0);
		cal.set(Calendar.MILLISECOND, 0);
		Date d = cal.getTime();
		assertEquals("1 minute", m.countMinutes(d));
	}

}

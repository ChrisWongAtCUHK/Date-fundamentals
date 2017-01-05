package minutesToMidnight;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;


public class Minute {
	public String countMinutes(Date d){
	     //have fun with coding ^.^
		Minute m = new Minute();
		Calendar cal = new GregorianCalendar();
		cal.set(Calendar.HOUR_OF_DAY, 24);
		cal.set(Calendar.MINUTE, 0);
		cal.set(Calendar.SECOND, 0);
		cal.set(Calendar.MILLISECOND, 0);
		Date midnight = cal.getTime();
		long diff = midnight.getTime() - d.getTime();
		long diffMinutes = diff / (60 * 1000); 

		return diffMinutes > 1 ? diffMinutes + " minutes" : diffMinutes + " minute";
	}
}

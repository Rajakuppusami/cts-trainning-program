package CalenderDates;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class Demo {
	public int value;
	public static void main(String[] args) throws ParseException {
		// TODO Auto-generated method stub
		String dateStr = "28-02-2016";
		SimpleDateFormat sdf=new SimpleDateFormat("dd-M-yyyy");
		Date date = sdf.parse(dateStr);
		Calendar calendar = Calendar.getInstance();
		calendar.setTime(date);
		System.out.println(sdf.format(calendar.getTime()));
		calendar.add(calendar.DATE, 1);
		System.out.println("Add one day");
		System.out.println(sdf.format(calendar.getTime()));
		calendar.add(calendar.MONTH, 1);
		System.out.println("Add one month");
		System.out.println(sdf.format(calendar.getTime()));
		calendar.add(calendar.YEAR, 1);
		System.out.println("Add one year");
		System.out.println(sdf.format(calendar.getTime()));
		System.out.println("display the day , month , year");
		System.out.println(calendar.get(calendar.DATE)+", "+calendar.get(calendar.MONTH)+", "+calendar.get(calendar.YEAR));
		System.out.println(calendar.get(calendar.DAY_OF_MONTH));
		System.out.println(calendar.getActualMaximum(calendar.DAY_OF_MONTH));
	}

}

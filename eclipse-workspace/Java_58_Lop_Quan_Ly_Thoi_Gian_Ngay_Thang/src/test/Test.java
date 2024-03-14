package test;


import java.sql.Date;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.concurrent.TimeUnit;

public class Test {
	public static void main(String[] args) {
		
//		currentTimeMillis(): ham lay thoi gian hien tai
		long t1 = System.currentTimeMillis();
		
		for(int i = 0; i < 10; i++)
			System.out.println("TEST");
		
		long t2 = System.currentTimeMillis();
		
		System.out.println("Trước khi chạy for: " + t1);
		System.out.println("Sau khi chạy for: " + t2);
		System.out.println("Thoi gian: " + (t2 - t1) + "mls" );
		System.out.println("Thoi gian: " + (t2 - t1) / 1000 + "s" );

		
//		TimeUnit
		System.out.println("3000 year = " + TimeUnit.DAYS.toSeconds(3000 * 365) +"s");
		System.out.println("25h = " + TimeUnit.HOURS.toSeconds(25) + "s");
		System.out.println("32221s = " + TimeUnit.SECONDS.toHours(32222) + "h");
		
		
//		Date
		Date d = new Date(System.currentTimeMillis());
		System.out.println(d.getDate() + "/" + (d.getMonth() + 1) + "/" + (d.getYear() + 1900));
		
//		Calendar
		Calendar c = Calendar.getInstance();
		System.out.println(c.get(Calendar.DATE) + "-" + (c.get(Calendar.MONTH) + 1)+ "-" + c.get(Calendar.YEAR));
		
		c.add(Calendar.HOUR, 10);
		System.out.println(c.get(Calendar.DATE) + "-" + (c.get(Calendar.MONTH) + 1)+ "-" + c.get(Calendar.YEAR));
		
		c.add(Calendar.DATE, 14);
		System.out.println(c.get(Calendar.DATE) + "-" + (c.get(Calendar.MONTH) + 1)+ "-" + c.get(Calendar.YEAR));

//		DateFormat
		DateFormat df = new SimpleDateFormat();
		System.out.println(df.format(d));
		
		df = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		System.out.println(df.format(d));

		
	}

}

package entities;

import java.util.Date;
import java.text.SimpleDateFormat;

public class DateNow {
	private static Date date = new Date();
	private static SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy");
	
	public static int dateCorrent() {
		String conversonDateString = simpleDateFormat.format(date);
		int conversonDateInt = Integer.parseInt(conversonDateString);
		return conversonDateInt;
	}
}
package entities;

import java.util.Date;
import java.text.SimpleDateFormat;

public class DateNow {
	private Date date = new Date();
	private SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy");
	
	public int dateNow() {
		String conversonDateString = simpleDateFormat.format(date);
		int conversonDateInt = Integer.parseInt(conversonDateString);
		return conversonDateInt;
	}
}
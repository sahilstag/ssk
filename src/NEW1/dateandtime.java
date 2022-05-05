package NEW1;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class dateandtime {
	public static String datetime() {
		
		DateTimeFormatter dt=DateTimeFormatter.ofPattern("yyyy-MM-dd  HH-mm-ss");
		LocalDateTime obj= LocalDateTime.now();
		String d =dt.format(obj);
		//System.out.println(obj);
		return d;
	}

	public static void main(String[] args) {
	String dt=	dateandtime.datetime();
	System.out.println(dt);
	}
}

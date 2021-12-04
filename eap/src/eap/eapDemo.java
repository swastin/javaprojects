package eap;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Date;
import java.util.Locale;

public class eapDemo {

	public static void main(String[] args) throws ParseException {
		 String str = "31/12/2020";

		  DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd-MM-yyyy");

		  LocalDateTime localDate= LocalDate.parse(str, dtf).atStartOfDay();
		  
		  System.out.println(localDate);
	}

}

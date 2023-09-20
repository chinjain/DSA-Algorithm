import java.sql.Timestamp;
import java.text.SimpleDateFormat;
import java.time.Instant;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Date;
import java.util.HashMap;
import java.util.Hashtable;
import java.util.Map;

import javax.naming.Context;

public class DefaultDateTime {

	public static void main(String[] s) {

		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd'T'HH:mm:ss:SS");
		
		String onboardTime = "2023-07-20T19:30:26.93";
		LocalDateTime dateTime = LocalDateTime.parse(onboardTime, DateTimeFormatter.ISO_LOCAL_DATE_TIME);
		
		LocalDateTime newDate = dateTime.minusHours(48);
		String formattedDateAndTime = newDate.atZone(ZoneId.of("Asia/Kolkata")).format(DateTimeFormatter.ofPattern("HH:mm:ss z 'on' MMMM d, yyyy"));
		
		System.err.println(formattedDateAndTime.length());
		
		LocalDateTime dateTime2 = LocalDateTime.now().minusMinutes(15);
		System.out.println(dateTime2);
		
//		ZonedDateTime dateTime = ZonedDateTime.now();
//		System.err.println(dateTime.format(formatter));
//		
//		LocalDateTime localDateTime = LocalDateTime.now();
//		System.err.println("LDT : " + localDateTime);
//		
//		LocalTime localTime = LocalTime.now();
//		System.err.println("LT : " + localTime);
//		
//		Instant instant = Instant.now();
//		System.err.println(instant);
//		
//		ZoneId zoneId = ZoneId.of("Asia/Kolkata");
//		ZonedDateTime zonedDateTime = ZonedDateTime.now(zoneId);
//		
//		System.err.println("Zone Time : " + zonedDateTime.format(formatter));
		
		Timestamp timestamp = new Timestamp(System.currentTimeMillis());
		Instant instant1 = timestamp.toInstant();
		
		
//		
			
		SimpleDateFormat df = new SimpleDateFormat("yyyyMMddhhmmssSSS");
		String uriDate = df.format(new Date());
		
		String uri = "http://resp2/2/Video/esignWebOnboarding/initializations/java.text.SimpleDateFormat@f17b4ca5/37289476738624764923765456293845629873465";
		String [] splitUrl = uri.split("/");
		
		String hashString = splitUrl[splitUrl.length - 1];
		System.err.println("5ac286d0b77373d1397007560fbb877ebaa6e6700b435580b7e02dd2cfeff83c20230601114724164ffyncq".length());
//		String str = "5ac286d0b77373d1397007560fbb877ebaa6e6700b435580b7e02dd2cfeff83c20230601114724164ffyncq".substring(64, 81);
//		System.out.println(str);
		
		String temp = "esignwebonbording-initialization-started-kycuri" + formattedDateAndTime;
		
		System.err.println(temp.length());
	}

}

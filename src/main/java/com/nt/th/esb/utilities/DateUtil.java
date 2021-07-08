package com.nt.th.esb.utilities;

import java.net.InetAddress;
import java.net.UnknownHostException;
import java.security.SecureRandom;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

import org.joda.time.DateTime;
import org.joda.time.DateTimeZone;
import org.joda.time.format.DateTimeFormat;
import org.joda.time.format.DateTimeFormatter;

/**
 * Created by Kritsana J. on 04/03/2564.
 */	
public class DateUtil {
	public static final String defaultDateFormat = "MM-dd-yyyy";
	public static final String defaultDateTimeFormat = "MM-dd-yyyy HH:mm:ss";
	public static final String compassDateFormat = "MM/dd/yyyy";
	public static final String esbDateFormat = "yyyy-MM-dd";
	public static final String clientLogDateFormat = "MM-dd-yyyy HH:mm:ss";
	public static final Locale defaultLocal = Locale.US;
	public static final Locale localeTh = new Locale("th", "TH");
	public static final String DateTimeZone_Bangkok = "Asia/Bangkok";
	public static final String yyyyMMddHHmmssSSS = "yyyyMMddHHmmssSSS";
	
	
	public static DateTime getDateTimeCurrent(){
		DateTime dateTime = new DateTime();
		//2020-09-24T16:02:58.319+07:00
		return dateTime;		
	}
	
	public static String getHostAddress() throws UnknownHostException{

		String hostName = null;
		hostName = InetAddress.getLocalHost().getHostAddress();
	
		return hostName;		
	}
	
	public static String getHostName() throws UnknownHostException{

		String hostName = null;
		hostName = InetAddress.getLocalHost().getHostName();
	
		return hostName;		
	}
	
	public static String genSSID(){
		//yyyyMMddHHmmssSSS + Random 000-999)
		
		String data = null;
		DateTime dateTimeUtc = new DateTime();
		DateTime dt = dateTimeUtc.withZone(DateTimeZone.forID( DateTimeZone_Bangkok ));
		DateTimeFormatter fmt = DateTimeFormat.forPattern(yyyyMMddHHmmssSSS);
		data = fmt.print(dt);

		SecureRandom random = new SecureRandom(); // Sensitive use of Random
		byte bytes[] = new byte[20];
		random.nextBytes(bytes);
		
		return data + Integer.toString(random.nextInt(1000));	
	}
	
	public static Date getCurrentTime() {
		DateTime dateTimeUtc = new DateTime();
		DateTime dateTimeBangkok = dateTimeUtc.withZone(DateTimeZone.forID( DateTimeZone_Bangkok ));
		return dateTimeBangkok.toLocalDateTime().toDate();		
	}
	
	public static Date getCurrentDate() {
		DateTime dateTimeUtc = new DateTime();
		DateTime dateTimeBangkok = dateTimeUtc.withZone(DateTimeZone.forID( DateTimeZone_Bangkok ));
		Date now = dateTimeBangkok.toLocalDateTime().toDate();
		now = parseDate( formatDate( now ) );
		return now;		
	}
	
	public static Date parseDate(String dateStr) {
		return parseDate(dateStr, defaultDateFormat, defaultLocal);
	}
	
		public static Date parseDate(String dateStr, String format, Locale locale) {
		DateFormat df = new SimpleDateFormat(format, locale);
		try {
			return df.parse(dateStr);
		}catch (Exception e) {
			return null;
		}
	}
	
		public static String formatDate(Date dte) {
		return formatDate(dte, defaultDateFormat, defaultLocal);
	}
	
		public static String formatDate(Date dte, String format, Locale locale) {
		DateFormat df = new SimpleDateFormat(format, locale);
		return df.format(dte);
	}
		
}

package chapter03;

import java.text.SimpleDateFormat;
import java.util.Date;

public class DateTest {
	public static void main(String[] args) {
		Date now = new Date();
		SimpleDateFormat sdf = new SimpleDateFormat( "yyyy-MM-dd a hh:mm:ss" );
		System.out.println(sdf.format(now));
		
		printDate(now);
		
		Date d = new Date(1467992992932l );
		printDate(d);
	}
	
	public static void printDate(Date date) {
		System.out.print( (date.getYear() + 1900 ) + "³â "); //1900~
		System.out.print( (date.getMonth() + 1 ) + "¿ù "); //0~
		System.out.print( (date.getDate() ) + "ÀÏ  "); //0~
		System.out.print( (date.getHours() ) + ":"); //0~
		System.out.print( (date.getMinutes() ) + ":"); //0~
		System.out.print( (date.getSeconds() ) ); //0~
		
		System.out.println();
	}
}

package chapter03;

import java.util.Calendar;

public class CalendarTest {

	   public static void main(String[] args){
	      Calendar calendar = Calendar.getInstance();//내부에서 만들어주는것을 팩토리패턴?
	      printDate(calendar);
	      
//	      calendar.set(2017, 0, 1);
//	      printDate(calendar);
	      
	      calendar.set(Calendar.YEAR, 2017);
	      printDate(calendar);
	      
	      //
	      calendar.set(1992, 1, 6);//1992-2-6
	      calendar.add(Calendar.DATE, 10000);
	      printDate(calendar);
	   }
	   
	   public static void printDate(Calendar calendar){
	      final String[] DAYS = {"일", "월", "화", "수", "목", "금", "일"};
	      
	      System.out.print(calendar.get(Calendar.YEAR)+"년 ");
	      System.out.print((calendar.get(Calendar.MONTH)+1)+"월 ");
	      System.out.print(calendar.get(Calendar.DATE)+"일 ");
	      System.out.print(DAYS[calendar.get(Calendar.DAY_OF_WEEK)-1]+"요일 ");//Index 1부터 시작
	      System.out.print((calendar.get(Calendar.AM_PM)==0?"AM":"PM")+" ");
	      System.out.print(calendar.get(Calendar.HOUR)+":");
	      System.out.print(calendar.get(Calendar.MINUTE)+":");
	      System.out.print(calendar.get(Calendar.SECOND));
	      System.out.print("\n");
	   }
	}
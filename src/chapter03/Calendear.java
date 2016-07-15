package chapter03;

import java.util.Calendar;

public class Calendear {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//오늘
		Calendar calendar = Calendar.getInstance();
		printDate(calendar);
		
//		calendar.set(2017,0,1);
//		printDate(calendar);
		
		//2017년 오늘
		calendar.set(Calendar.YEAR,2017);
		printDate(calendar);
		
		//10달 전
		calendar.add(Calendar.MONTH, -10);
		printDate(calendar);
		
		//태어난 날로 부터 10000일 후 (몇일 째 되는 날)
		calendar.set(1994,3,27);	//인덱스가 0부터이므로 하나 작게 입력
		calendar.add(Calendar.DATE, 10000);
		printDate(calendar);
	}
	
	public static void printDate(Calendar calendar){
		final String[] DAYS = {"일","월","화","수","목","금","토"};
		
		System.out.print(calendar.get(Calendar.YEAR)+"년 ");
		System.out.print((calendar.get(Calendar.MONTH)+1)+"월 ");
		System.out.print(calendar.get(Calendar.DATE)+"일 ");
		System.out.print(DAYS[calendar.get(Calendar.DAY_OF_WEEK)-1]+"요일 ");//Index 1부터 시작
		System.out.print((calendar.get(Calendar.AM_PM)==0?"AM":"PM")+" ");
		System.out.print(calendar.get(Calendar.HOUR)+":");
		System.out.print(calendar.get(Calendar.MINUTE)+":");
		System.out.println(calendar.get(Calendar.SECOND));
	
		
	}
}

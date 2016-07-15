package chapter03;

import java.util.Calendar;

public class CalendarTest {

	   public static void main(String[] args){
	      Calendar calendar = Calendar.getInstance();//���ο��� ������ִ°��� ���丮����?
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
	      final String[] DAYS = {"��", "��", "ȭ", "��", "��", "��", "��"};
	      
	      System.out.print(calendar.get(Calendar.YEAR)+"�� ");
	      System.out.print((calendar.get(Calendar.MONTH)+1)+"�� ");
	      System.out.print(calendar.get(Calendar.DATE)+"�� ");
	      System.out.print(DAYS[calendar.get(Calendar.DAY_OF_WEEK)-1]+"���� ");//Index 1���� ����
	      System.out.print((calendar.get(Calendar.AM_PM)==0?"AM":"PM")+" ");
	      System.out.print(calendar.get(Calendar.HOUR)+":");
	      System.out.print(calendar.get(Calendar.MINUTE)+":");
	      System.out.print(calendar.get(Calendar.SECOND));
	      System.out.print("\n");
	   }
	}
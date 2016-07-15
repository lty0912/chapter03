package chapter03;

import java.util.Calendar;

public class Calendear {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//����
		Calendar calendar = Calendar.getInstance();
		printDate(calendar);
		
//		calendar.set(2017,0,1);
//		printDate(calendar);
		
		//2017�� ����
		calendar.set(Calendar.YEAR,2017);
		printDate(calendar);
		
		//10�� ��
		calendar.add(Calendar.MONTH, -10);
		printDate(calendar);
		
		//�¾ ���� ���� 10000�� �� (���� ° �Ǵ� ��)
		calendar.set(1994,3,27);	//�ε����� 0�����̹Ƿ� �ϳ� �۰� �Է�
		calendar.add(Calendar.DATE, 10000);
		printDate(calendar);
	}
	
	public static void printDate(Calendar calendar){
		final String[] DAYS = {"��","��","ȭ","��","��","��","��"};
		
		System.out.print(calendar.get(Calendar.YEAR)+"�� ");
		System.out.print((calendar.get(Calendar.MONTH)+1)+"�� ");
		System.out.print(calendar.get(Calendar.DATE)+"�� ");
		System.out.print(DAYS[calendar.get(Calendar.DAY_OF_WEEK)-1]+"���� ");//Index 1���� ����
		System.out.print((calendar.get(Calendar.AM_PM)==0?"AM":"PM")+" ");
		System.out.print(calendar.get(Calendar.HOUR)+":");
		System.out.print(calendar.get(Calendar.MINUTE)+":");
		System.out.println(calendar.get(Calendar.SECOND));
	
		
	}
}

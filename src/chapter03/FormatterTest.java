package chapter03;

import java.util.Formatter;

public class FormatterTest {

	public static void main(String[] args) {
		String name = "���¿�";
		int score = 100;
		
		System.out.println( String.format("%s, %d", name, score) );
		System.out.println(String.format("�л� %s�� �ڹٽ����� %d�� �޾ҽ��ϴ�.", name, score));
		
		StringBuffer sb = new StringBuffer();
		Formatter fm = new Formatter(sb);
		System.out.println(String.format("�л� %s�� �ڹٽ����� %d�� �޾ҽ��ϴ�.", name, score));

	}

}

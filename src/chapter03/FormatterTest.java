package chapter03;

import java.util.Formatter;

public class FormatterTest {

	public static void main(String[] args) {
		String name = "이태연";
		int score = 100;
		
		System.out.println( String.format("%s, %d", name, score) );
		System.out.println(String.format("학생 %s는 자바시험을 %d점 받았습니다.", name, score));
		
		StringBuffer sb = new StringBuffer();
		Formatter fm = new Formatter(sb);
		System.out.println(String.format("학생 %s는 자바시험을 %d점 받았습니다.", name, score));

	}

}

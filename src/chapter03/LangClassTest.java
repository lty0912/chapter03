package chapter03;

public class LangClassTest {

	public static void main(String[] args) {
		Point p1 = new Point(10,20);
		Point p2 = new Point(50,100);
		Point p3 = p1;
							
		System.out.println(p1.getClass().getName());
		System.out.println(p1.hashCode());
		System.out.println(p1.toString());
		System.out.println(p1);
		
		String s = new String("Hello");
		System.out.println(s.toString()); 
		
		System.out.println(p1 == p2);
		System.out.println(p1 == p3);
		
		Point p4 = new Point(10, 20);
		System.out.println(p1 == p4);
		System.out.println(p1.equals(p4));		
		
		String s1 = new String("hello");
		String s2 = new String("hello");

	}

}

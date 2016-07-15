package chapter03;

public class WrapperClassTest2 {

	public static void main(String[] args) {
		//Boxing
		Integer i = new Integer(10);
		
		//Unboxing
		int j = i.intValue();
		
		System.out.println(i + " , " + j);
	}
}

package chapter03;

public class StringTest4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "aBcAbCabcABC";
		
		System.out.println(str.substring(3));	//객체를 형성하여  return하며 실행 (str이 바뀌지X)
		System.out.println(str.substring(2,5)); //2번째 ~ 4번째
		System.out.println(str.indexOf('A'));
		System.out.println(str.indexOf("abc"));
		System.out.println(str.length());
		System.out.println(str.replace('a', 'R'));
		System.out.println(str.replace("a", "R"));
		System.out.println(str.substring(0, 3));
		System.out.println(str.toUpperCase());
		
		String a = new String(" abcd");
		String b = new String(" ,efg");
		
		a = a.concat(b);	//a가 내부적으로 바뀌는 것이 아니라 새로 형성된 String을 참조
		System.out.println(a);
		
		a = a.trim();
		System.out.println("----"+a+"----");
		
		String[] as = a.split(",");
		for(String s : as){
			System.out.println(s);
		}
	}
}

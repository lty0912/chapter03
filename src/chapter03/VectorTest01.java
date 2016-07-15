package chapter03;

import java.util.Vector;

public class VectorTest01 {
	
	public static void main(String[] args) {
		Vector<String> vector = new Vector<String>();
		
		vector.addElement("둘리");
		vector.addElement("마이콜");
		vector.addElement("도우너");
		vector.addElement("고길동");
		
		vector.removeElement("마이콜");
		
		int size = vector.size();
		
		for(int i=0; i<size; i++) {
			String s = vector.elementAt(i);
			System.out.println(s);
		}
		
	}

}

package chapter03;

import java.util.Vector;

public class VectorTest01 {
	
	public static void main(String[] args) {
		Vector<String> vector = new Vector<String>();
		
		vector.addElement("�Ѹ�");
		vector.addElement("������");
		vector.addElement("�����");
		vector.addElement("��浿");
		
		vector.removeElement("������");
		
		int size = vector.size();
		
		for(int i=0; i<size; i++) {
			String s = vector.elementAt(i);
			System.out.println(s);
		}
		
	}

}

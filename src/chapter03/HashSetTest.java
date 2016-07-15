package chapter03;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class HashSetTest {
	
	public static void main(String[] args) {
		Set<String> set = new HashSet<String>();
		
		set.add("�Ѹ�");
		set.add("������");
		set.add("�����");
		System.out.println(set.size());
		
		set.add("������");
		set.add("�����");
		System.out.println(set.size());
		
		System.out.println(set.contains("������"));
		System.out.println(set.contains("��浿"));
		
		//��ü ��������
		Iterator<String> it = set.iterator();
		while(it.hasNext()) {
			String s = it.next();
			System.out.println(s);
		}
		
		
		
		
		
	}

}

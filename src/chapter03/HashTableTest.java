package chapter03;

import java.util.Hashtable;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class HashTableTest {

	public static void main(String[] args) {

		Map<String, Integer> map = new Hashtable<String, Integer>();

		map.put("�Ѹ�", 100);
		map.put("������", 50);
		map.put("�����", 80);

		System.out.println(map.get("������"));

		// ��ü ��ȸ
		Set<String> set = map.keySet();
		Iterator<String> it = set.iterator();

		while (it.hasNext()) {
			String key = it.next();
			int value = map.get(key);

			System.out.println("key: " + key + ", value=" + value);

		}

	}

}

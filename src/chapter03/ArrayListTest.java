package chapter03;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ArrayListTest {

   public static void main(String[] args) {
      // TODO Auto-generated method stub
      List<String> list = new ArrayList<String>();
      list.add("�Ѹ�");
      list.add("������");
      list.add(2, "�����");
      list.add("��浿");

      list.remove(1);
      
     

      // ��ȸ1
      int count = list.size();

      for (int i = 0; i < count; i++) {
         String s = list.get(i);
         System.out.println(s);
      }

      // ��ȸ2
      Iterator<String> it = list.iterator();
      while (it.hasNext()) {
         String s = it.next();
         System.out.println(s);
      }
      
      // ��ȸ3
      for(String s : list) {
    	  System.out.println(s);
      }
      
      
      
   }

}
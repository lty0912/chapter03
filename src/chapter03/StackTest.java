package chapter03;

import java.util.Stack;

public class StackTest {
	
	public static void main(String[] args) {
		Stack<String> stack = new Stack<String>();
		
		stack.push("�Ѹ�");
		stack.push("�����");
		System.out.println( stack.peek() );
		stack.push("������");
		System.out.println( stack.pop() );
		stack.push("��浿");
		
		while(stack.isEmpty() == false) {
			String s = stack.pop();
			System.out.println(s);
		}
	}

}

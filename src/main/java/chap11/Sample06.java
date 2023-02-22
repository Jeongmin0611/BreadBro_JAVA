package chap11;

import java.util.Stack;

public class Sample06 {
	public static void main(String[] args) {
		var stack = new Stack<String>();
		stack.add("dog");
		stack.add("cat");
		stack.add("lion");
		System.out.printf("총 %d개의 자료가 있습니다. \n\n",stack.size());
		
		while(!stack.isEmpty()) {//스택이 비어있지 않으면
			System.out.println(stack.pop());;
		}
		
		System.out.printf("총 %d개의 자료가 있습니다. \n\n",stack.size());
	}
}

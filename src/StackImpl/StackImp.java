package StackImpl;

import java.util.Stack;

public class StackImp {
	
	public static void main(String[] args) {
		Stack<Integer> stack = new Stack<Integer>();
		stack.push(2);
		stack.push(3);
		System.out.println(stack.peek());
		System.out.println(stack.pop() + "-> pop");
	}

}

package StackImpl;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class DuplicateBrackets {
	
	public static void main(String[] args) {
		Stack<Character> st = new Stack<Character>();
		String s = "(a+b)+(c+d)()";
		
		for(char c : s.toCharArray()) {
			if(c == ')') {
				if(st.peek() == '(') {
					System.out.println(true);
					return;
				}else {
					while(st.peek() != '(' && st.isEmpty()) {
						st.pop();
					}
					st.pop();
				}
			}else {
				st.push(c);
			}
		}
		
		
		System.out.println(false);
		
	}

}

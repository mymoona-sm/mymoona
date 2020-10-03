package test.test.simple;

import java.util.Stack;

public class WordMachine {

	public static void main(String[] args) {
		System.out.println(wordMachine("13 DUP 4 POP 5 DUP + DUP + -"));
		System.out.println(wordMachine("5 6 + -"));
		System.out.println(wordMachine("13 DUP 4 POP 5 DUP + DUP + - POP POP"));
		System.out.println(wordMachine("3 DUP 5 - -"));
	}
	
	public static int wordMachine(String s) {
		final Stack<Integer> st = new Stack<>();
		String[] arr = s.split(" ");
		for(String str : arr) {
			if(str.equals("DUP")) {
				if(st.isEmpty()) return -1;
				st.push(st.peek());
				continue;
			}
			if(str.equals("POP")) {
				if(st.isEmpty()) return -1;
				st.pop();
				continue;
			}
			if(str.equals("+") || str.equals("-")) {
				if(st.size() < 2) return -1;
				
				int a = st.pop();
				int b = st.pop();
				
				if(str.equals("+")) {
					st.push(a+b);
				} else {
					if(a-b < 0) return -1;
					st.push(a-b);
				}
				continue;
			}
			
			st.push(Integer.parseInt(str));
		}
		
		return st.isEmpty() ? -1 : st.peek();
	}

}

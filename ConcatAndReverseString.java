package Schoollevel;

import java.util.Stack;

public class ConcatAndReverseString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String str1 = "Shubh";
		String str2 = "am";
		String str = str1 + str2;
		
		str = reverse(str.toCharArray());
		System.out.println(str);
		

	}
	
	
static String reverse(char[] ch) {
		
		Stack<Character> st = new Stack<>();
		
		for(int i=0; i<ch.length; i++) {
			st.push(ch[i]);
		}
		
		for(int i=0; i<ch.length; i++) {
		ch[i] =	st.peek();
		st.pop();
		}
		
		return String.valueOf(ch);
	}


}

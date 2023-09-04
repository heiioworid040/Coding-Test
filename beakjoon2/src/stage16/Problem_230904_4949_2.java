package stage16;

import java.io.*;
import java.util.*;

public class Problem_230904_4949_2 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		
		// 입력받을 문자열 str
		String str = "";
		while(true) {
			// 문자열 입력받기
			str = br.readLine();

			// 온점 하나가 들어온다면 반복문 종료
			if(str.equals(".")) {
				break;
			}
			
			// 출력 문자열
			sb.append(bracket(str)).append("\n");
		}
		System.out.print(sb);
	}
	
	// 괄호 체크 메서드
	public static String bracket(String str) {
		// 확인할 stack 생성
		Stack<Character> st = new Stack<>();
		boolean result = true;
		
		// 문자열 길이만큼 for문
		for(char c : str.toCharArray()) {
			switch(c) {
				// 여는 괄호라면 stack에 추가 후 break
				case '(' : case '[' :
					st.push(c);
					break;
				
				// 닫는 소괄호일 때 stack이 비어있거나 스택의 요소가 맞는 괄호가 아니라면 break
				case ')' :
					if(st.empty() || st.pop() != '(')
						result = false;
						break;
				// 닫는 대괄호일 때 stack이 비어있거나 스택의 요소가 맞는 괄호가 아니라면 break
				case ']' :
					if(st.empty() || st.pop() != '[')
						result = false;
						break;
			}
		}
		// 균형이 맞지 않는 괄호라면 "no", 맞는 괄호라면 "yes"
		return !st.empty() || !result ? "no" : "yes";
	}
}

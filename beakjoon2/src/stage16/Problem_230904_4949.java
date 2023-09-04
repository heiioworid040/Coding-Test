package stage16;

import java.io.*;
import java.util.*;

public class Problem_230904_4949 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		
		// 입력 받을 문자열 str
		String str = "";
		while(true) {
			// 문자열 입력받기
			str = br.readLine();
			// 확인할 stack 생성
			Stack<Character> st = new Stack<>();
			boolean result = true;
			
			// 온점 하나가 들어온다면 반복문 종료
			if(str.equals(".")) {
				break;
			}
			
			// 문자열 길이만큼 for문
			for(char c : str.toCharArray()) {
				// 여는 괄호라면
				if(c == '(' || c == '[') {
					// stack에 추가
					st.push(c);
				
				// 닫는 괄호라면
				}else if(c == ')' || c == ']') {
					// stack이 비어있다면 for문 종료
					if(st.empty()) {
						result = false;
						break;
					
					// 아니라면
					}else {
						// stack의 값 제거하며 open 변수에 담기
						char open = st.pop();
						// 균형이 맞지 않는 괄호라면 for문 종료
						if((c == ')' && open != '(') || (c == ']' && open != '[')) {
							result = false;
							break;
						}
					}
				}
			}
			
			// 균형이 맞지 않는 괄호라면 "no", 맞는 괄호라면 "yes"
			sb.append(!st.empty() || !result ? "no" : "yes").append("\n");
		}
		System.out.print(sb);
	}
}

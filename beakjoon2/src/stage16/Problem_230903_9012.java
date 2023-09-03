package stage16;

import java.io.*;
import java.util.*;

public class Problem_230903_9012 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		
		// 테스트 데이터의 수 t
		int t = Integer.parseInt(br.readLine());
		
		// 출력할 메시지
		for(int i = 0; i < t; i++) {
			sb.append(stack(br.readLine())).append("\n");
		}
		
		// 출력
		System.out.println(sb);
	}
	
	// VPS 확인 메서드
	public static String stack(String s) {
		// Stack 생성
		Stack<Character> stack = new Stack<>();
		
		// 문자열의 길이만큼
		for(int i = 0; i < s.length(); i++) {
			char bracket = s.charAt(i);
			
			// 여는 괄호라면 스택에 저장
			if(bracket == '(') {
				stack.push('(');
			
			// 닫는 괄호라면
			}else {
				// 스택이 비어있다면 NO 값 리턴
				if(stack.empty()) {
					return "NO";
				// 스택이 비어있지 않다면 스택에서 제거
				}else {
					stack.pop();
				}
			}
		}
		
		// 스택이 비어있다면 NO, 아니라면 YES 리턴
		return !stack.empty() ? "NO" : "YES";
	}
}

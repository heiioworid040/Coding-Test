package stage;

import java.io.*;
import java.util.*;

public class Problem_231206_9935 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		// 문자열
		String str = br.readLine();
		// 스택에 담기
		Stack<Character> st = new Stack<>();
		for(char c : str.toCharArray()) {
			st.push(c);
		}
		
		// 체크할 문자열
		String checkStr = br.readLine();
		int checkStrLength = checkStr.length();
		
		// 남은 문자열
		StringBuilder remainStr = new StringBuilder();
		
		while(!st.isEmpty()) {
			// 문자열 하나씩 꺼내 담기
			remainStr.append(st.pop());
			
			// 꺼낸 문자열의 길이가 체크할 문자열보다 길다면
			if(remainStr.length() >= checkStrLength) {
				boolean isMatch = true;
				// 반복문 돌려 문자열 체크하기
				for(int i = remainStr.length() - 1, j = 0; j < checkStrLength; i--, j++) {
					// 문자열이 다르다면 pass
					if(remainStr.charAt(i) != checkStr.charAt(j)) {
						isMatch = false;
						break;
					}
				}
				
				// 폭발 문자열이라면
				if(isMatch) {
					// 폭발시키기
					remainStr.setLength(remainStr.length() - checkStrLength);
				}
			}
		}
		
		// 출력
		String result = remainStr.reverse().toString();
		System.out.println(result.isEmpty() ? "FRULA" : result);
	}
}

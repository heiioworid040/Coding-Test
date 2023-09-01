package stage16;

import java.io.*;
import java.util.*;

public class Problem_230901_28278 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		
		// 명령의 수 n
		int n = Integer.parseInt(br.readLine());
		
		// 처리할 stack
		Stack<Integer> st = new Stack<>();
		
		// 명령의 수 n만큼 명령처리
		for(int i = 0; i < n; i++) {
			// 각 입력받은 명령
			String s = br.readLine();

			if(s.length() == 1) {
				// 2번 명령
				if(s.equals("2")) {
					// 정수가 있다면 맨 위 정수를 빼면서 출력, 없다면 -1 출력
					sb.append(!st.empty() ? st.pop() : -1);
				
				// 3번 명령
				}else if(s.equals("3")) {
					// 스택 사이즈 출력
					sb.append(st.size());
				
				// 4번 명령
				}else if(s.equals("4")) {
					// 비어있다면 1 출력, 아니라면 0 출력
					sb.append(st.empty() ? 1 : 0);
					
				// 5번 명령
				}else if(s.equals("5")) {
					// 맨 위 정수 출력, 없다면 -1 출력
					sb.append(!st.empty() ? st.peek() : -1);
				}
				// 줄바꿈
				sb.append("\n");
				
			// 1번 명령
			}else {
				String[] num = s.split(" ");
				// 입력받은 정수 X를 스택에 넣음
				st.push(Integer.parseInt(num[1]));
			}
		}
		
		System.out.println(sb);
	}
}

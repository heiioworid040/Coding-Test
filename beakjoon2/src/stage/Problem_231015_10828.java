package stage;

import java.io.*;
import java.util.*;

public class Problem_231015_10828 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		
		// 명령의 수
		int n = Integer.parseInt(br.readLine());
		
		// 정수를 저장하는 스택
		Stack<Integer> st = new Stack<>();
		
		// 명령의 수만큼 반복
		for(int i = 0; i < n; i++) {
			// 주어진 명령
			String str = br.readLine();
			
			// push 명령
			if(str.contains("push")) {
				// 공백을 기준으로 자르기
				String[] push = str.split(" ");
				// push 뒤에 오는 정수를 스택에 넣음
				st.push(Integer.parseInt(push[1]));
			}else {
				// size 명령
				if(str.equals("size")) {
					// 스택에 들어있는 정수의 개수 출력
					sb.append(st.size());
					
				// empty 명령
				}else if(str.equals("empty")) {
					// 비어있다면 1 아니라면 0 출력
					sb.append(st.empty() ? 1 : 0);
					
				}else {
					// 비어있다면
					if(st.empty()) {
						sb.append("-1");
						
					// pop 명령
					}else if(str.equals("pop")) {
						// 가장 위에 있는 정수를 빼내고, 출력
						sb.append(st.pop());
						
					// top 명령
					}else if(str.equals("top")) {
						// 가장 위에 있는 정수 출력
						sb.append(st.peek());
					}
				}
			}
		}
		// 출력
		System.out.println(sb);
	}
}

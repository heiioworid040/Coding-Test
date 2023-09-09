package stage16;

import java.io.*;
import java.util.*;

public class Problem_230909_28279_3 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		
		// 명령의 수 n
		int n = Integer.parseInt(br.readLine());
		
		// 명령을 처리할 Deque
		Deque<Integer> d = new LinkedList<>();
		
		// 명령을 처리하는 for문
		for(int i = 0; i < n; i++) {
			// 입력받은 명령
			String cmd = br.readLine();
			char command = cmd.charAt(0);
			
			switch (command) {
				// 1번 또는 2번 명령
				case '1' : case '2' :
					// 명령 뒤에 오는 정수 x
					int x = Integer.parseInt(cmd.split(" ")[1]);
					
					// 1번 명령
					if(command == '1') {
						// 정수 x를 덱의 앞에 넣기
						d.offerFirst(x);
						
					// 2번 명령
					}else {
						// 정수 x를 덱의 뒤에 넣기
						d.offerLast(x);
					}
					break;
				
				// 3번 명령
				case '3' :
					// 맨 앞의 정수를 빼고 출력
					sb.append(d.isEmpty() ? -1 : d.pollFirst()).append("\n");
					break;
				
				// 4번 명령
				case '4' :
					// 맨 뒤의 정수를 빼고 출력
					sb.append(d.isEmpty() ? -1 : d.pollLast()).append("\n");
					break;
					
				// 5번 명령
				case '5' :
					// 덱에 들어있는 정수의 개수 출력
					sb.append(d.size()).append("\n");
					break;
					
				// 6번 명령
				case '6' :
					// 덱이 비어있다면 1, 아니라면 0 출력
					sb.append(d.isEmpty() ? 1 : 0).append("\n");
					break;
					
				// 7번 명령
				case '7' :
					// 맨 앞의 정수 출력
					sb.append(d.isEmpty() ? -1 : d.peekFirst()).append("\n");
					break;
				
				// 8번 명령
				case '8' :
					// 맨 뒤의 정수 출력
					sb.append(d.isEmpty() ? -1 : d.peekLast()).append("\n");
					break;
			}
		}
		System.out.println(sb);
	}
}

package stage16;

import java.io.*;
import java.util.*;

public class Problem_230909_28279_2 {
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
			
			// 1번 또는 2번 명령
			if(cmd.charAt(0) == '1' || cmd.charAt(0) == '2') {
				StringTokenizer st = new StringTokenizer(cmd);
				cmd = st.nextToken();
				// 명령 뒤에 오는 정수 x
				int x = Integer.parseInt(st.nextToken());
				
				// 1번 명령
				if(cmd.equals("1")) {
					// 정수 x를 덱의 앞에 넣기
					d.offerFirst(x);
					
				// 2번 명령
				}else if(cmd.equals("2")) {
					// 정수 x를 덱의 뒤에 넣기
					d.offerLast(x);
				}
			
			}else {
				// 덱이 없을 때 출력되어야 할 -1을 기본값으로
				int num = -1;
				
				// 5번 명령
				if(cmd.equals("5")) {
					// 덱에 들어있는 정수의 개수
					num = d.size();
				
				// 6번 명령
				}else if(cmd.equals("6")) {
					// 덱이 비어있다면 1, 아니라면 0
					num = d.isEmpty() ? 1 : 0;
				
				}else {
					// 덱이 비어있지 않을 때
					if(!d.isEmpty()) {
						
						// 3번 명령
						if(cmd.equals("3")) {
							// 맨 앞의 정수를 빼고 출력
							num = d.pollFirst();
						
						// 4번 명령
						}else if(cmd.equals("4")) {
							// 맨 뒤의 정수를 빼고 출력
							num = d.pollLast();
						
						// 7번 명령
						}else if(cmd.equals("7")) {
							// 맨 앞의 정수 출력
							num = d.peekFirst();
						
						// 8번 명령
						}else if(cmd.equals("8")) {
							// 맨 뒤의 정수 출력
							num = d.peekLast();
						}
					}
				}
				sb.append(num).append("\n");
			}
		}
		System.out.println(sb);
	}
}

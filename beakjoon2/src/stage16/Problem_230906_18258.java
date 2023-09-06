package stage16;

import java.io.*;
import java.util.*;

public class Problem_230906_18258 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		
		// 명령의 수 n
		int n = Integer.parseInt(br.readLine());
		// 마지막 정수를 저장할 변수 last
		int last = 0;
		
		// 명령을 처리할 Queue
		Queue<Integer> q = new LinkedList<>();
		
		// 명령을 처리하는 for문
		for(int i = 0; i < n; i++) {
			// 입력받은 명령
			String input = br.readLine();
			
			// push 명령
			if(input.contains("push")) {
				// push 뒤에 오는 정수
				last = Integer.parseInt(input.split(" ")[1]);
				// 큐에 넣기
				q.offer(last);
			
			}else  {
				// size 명령
				if(input.equals("size")) {
					// 큐에 들어있는 정수의 개수
					sb.append(q.size()).append("\n");
				
				// empty 명령
				}else if(input.equals("empty")) {
					// 비어있으면 1, 아니면 0
					sb.append(q.isEmpty() ? 1 : 0).append("\n");
					
				// 큐가 비어있다면
				}else if(q.isEmpty()) {
					// -1
					sb.append(-1).append("\n");
					
				// pop 명령
				}else if(input.equals("pop")) {
					// 가장 앞에 있는 정수를 빼고 그 수 출력
					sb.append(q.poll()).append("\n");
					
				// front 명령
				}else if(input.equals("front")) {
					// 가장 앞에 있는 정수 출력
					sb.append(q.peek()).append("\n");
					
				// back 명령
				}else if(input.equals("back")) {
					// 가장 뒤에 있는 정수 출력
                    sb.append(last).append("\n");
				}
			}
		}
		System.out.println(sb);
	}
}

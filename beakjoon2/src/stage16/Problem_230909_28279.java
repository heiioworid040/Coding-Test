package stage16;

import java.io.*;
import java.util.*;

public class Problem_230909_28279 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		
		// 명령의 수 n
		int n = Integer.parseInt(br.readLine());
		// 명령이 1이나 2일 때 정수 x의 값
		int x = 0;
		
		// 명령을 처리할 덱
		Deque<Integer> d = new LinkedList<>();
		
		// 명령의 수만큼 for문
		for(int i = 0; i < n; i++) {
			// 명령 변수 cmd
			String cmd = br.readLine();
			
			// 명령이 1로 시작한다면
			if(String.valueOf(cmd).startsWith("1")) {
				// 1 뒤에 오는 정수 값 덱의 앞에 저장
				x = Integer.parseInt(cmd.split(" ")[1]);
				d.offerFirst(x);
			
			// 명령이 2로 시작한다면
			}else if(cmd.startsWith("2")) {
				// 2 뒤에 오는 정수 값 덱의 뒤에 저장
				x = Integer.parseInt(String.valueOf(cmd).split(" ")[1]);
				d.offerLast(x);
				
			// 아니라면
			}else {
				// 정수 출력을 위한 변수 num
				int num = -1;
				
				// 명령을 처리할 switch (비효율적인 것 같아 수정할 예정)
				switch (cmd) {
				
				// 명령이 3이라면
				case "3" :
					// 덱이 비어있지 않다면
					if(!d.isEmpty()) {
						// 맨 앞의 정수를 빼고 출력
						num = d.pollFirst();
					}
					break;
					
				// 명령이 4라면
				case "4" :
					// 덱이 비어있지 않다면
					if(!d.isEmpty()) {
						// 맨 뒤의 정수를 빼고 출력
						num = d.pollLast();
					}
					break;
					
				// 명령이 5라면
				case "5" :
					// 덱에 들어있는 정수의 개수 출력
					num = d.size();
					break;
					
				// 명령이 6라면
				case "6" :
					// 덱이 비어있다면 1, 아니라면 0
					num = d.isEmpty() ? 1 : 0;
					break;
					
				// 명령이 7라면
				case "7" :
					// 덱이 비어있지 않다면
					if(!d.isEmpty()) {
						// 맨 앞의 정수를 출력
						num = d.peekFirst();
					}
					break;
				
				// 명령이 8라면
				case "8" :
					// 덱이 비어있지 않다면
					if(!d.isEmpty()) {
						// 맨 뒤의 정수 출력
						num = d.peekLast();
					}
					break;
				}
				sb.append(num).append("\n");
			}
		}
		System.out.println(sb);
	}
}
// 다시 풀기
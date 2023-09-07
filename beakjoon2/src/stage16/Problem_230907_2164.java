package stage16;

import java.io.*;
import java.util.*;

public class Problem_230907_2164 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		// 카드의 개수
		int n = Integer.parseInt(br.readLine());
		
		// 카드를 담을 stack
		Queue<Integer> q = new LinkedList<>();
		
		// 카드의 수만큼 stack에 추가
		for(int i = 1; i <= n; i++) {
			q.offer(i);
		}
		
		// 한 장의 카드가 남을 때까지
		while(q.size() > 1) {
			// 제일 위에 있는 카드 제거
			q.poll();
			// 제일 위에 있는 카드를 제일 아래로 옮기기
			q.offer(q.poll());
		}
		
		// 마지막으로 남은 카드 출력
		System.out.println(q.peek());
	}
}

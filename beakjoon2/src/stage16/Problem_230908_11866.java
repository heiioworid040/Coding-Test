package stage16;

import java.io.*;
import java.util.*;

public class Problem_230908_11866 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		StringBuilder sb = new StringBuilder();
		
		// 사람의 수 n
		int n = Integer.parseInt(st.nextToken());
		
		// 제거할 순서 k
		int k = Integer.parseInt(st.nextToken());
		
		// Queue에 n명의 사람들 저장
		Queue<Integer> q = new LinkedList<>();
		for(int i = 1; i <= n; i++) {
			q.offer(i);
		}
		
		// 문자열 시작
		if(q.size() == n) sb.append("<");
		
		// 모든 사람이 제거될 때까지
		while(!q.isEmpty()) {
			// k - 1번째 사람을 제거하며 다시 Queue에 저장
			for(int i = 1; i < k; i++) {
				q.offer(q.poll());
			}
			// k번째 사람은 제거하며 출력
			sb.append(q.poll());
			
			// 사람이 존재하면 띄어쓰기 추가
			if(!q.isEmpty()) {
				sb.append(", ");
			}
		}
		
		// 문자열 종료
		if(q.isEmpty()) sb.append(">");
		
		// 출력
		System.out.println(sb);
	}
}

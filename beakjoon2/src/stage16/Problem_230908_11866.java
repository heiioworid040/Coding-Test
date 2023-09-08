package stage16;

import java.io.*;
import java.util.*;

public class Problem_230908_11866 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		StringBuilder sb = new StringBuilder();
		
		int n = Integer.parseInt(st.nextToken());
		int k = Integer.parseInt(st.nextToken());
		
		Queue<Integer> q = new LinkedList<>();
		for(int i = 1; i <= n; i++) {
			q.offer(i);
		}
		
		if(q.size() == n) sb.append("<");
		while(!q.isEmpty()) {
			for(int i = 1; i < k; i++) {
				q.offer(q.poll());
			}
			sb.append(q.poll());
			
			if(!q.isEmpty()) {
				sb.append(", ");
			}
		}
		if(q.isEmpty()) sb.append(">");
		System.out.println(sb);
	}
}

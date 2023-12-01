package stage;

import java.io.*;
import java.util.*;

public class Problem_231201_11286 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		
		// 연산의 개수
		int numberOfCal = Integer.parseInt(br.readLine());
		
		// 우선순위 큐 (절대값이 가장 작은 순서로)
		PriorityQueue<Integer> minHeap = new PriorityQueue<>((a, b) -> {
			if(Math.abs(a) == Math.abs(b)) {
				return Integer.compare(a, b);
			}
			return Integer.compare(Math.abs(a), Math.abs(b));
		});
		
		while(numberOfCal-- > 0) {
			int x = Integer.parseInt(br.readLine());
			if(x != 0) {
				minHeap.add(x);
			}else {
				sb.append(minHeap.isEmpty() ? 0 : minHeap.poll()).append("\n");
			}
		}
		System.out.println(sb);
	}
}

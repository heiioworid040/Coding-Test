package stage;

import java.io.*;
import java.util.*;

public class Problem_231026_11006 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		
		// 테스트 케이스의 수
		int t = Integer.parseInt(br.readLine());
		
		for(int i = 0; i < t; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			// 모든 닭의 다리 수의 합
			int sum = Integer.parseInt(st.nextToken());
			// 닭의 수
			int count = Integer.parseInt(st.nextToken());
			
			// 다리가 두 개인 닭의 수
			int two = sum - count;
			// 다리가 하나인 닭의 수
			int one = count - two;
			sb.append(one).append(" ").append(two).append("\n");
		}
		// 출력
		System.out.println(sb);
	}
}

package stage24;

import java.io.*;
import java.util.*;

public class Problem_230929_11659 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		StringBuilder sb = new StringBuilder();
		
		// 수의 개수
		int n = Integer.parseInt(st.nextToken());
		// 합을 구해야 하는 횟수
		int m = Integer.parseInt(st.nextToken());
		
		// 누적합을 담을 배열
		int[] list = new int[n + 1];
		st = new StringTokenizer(br.readLine());
		for(int x = 1; x < list.length; x++) {
			// 누적합 추가
			list[x] = list[x - 1] + Integer.parseInt(st.nextToken());
		}
		
		for(int x = 0; x < m; x++) {
			st = new StringTokenizer(br.readLine());
			
			// i번째 수부터 j번째 수까지의 합
			int i = Integer.parseInt(st.nextToken()) - 1;
			int j = Integer.parseInt(st.nextToken());
			
			// 누적합 구하기
			sb.append(list[j] - list[i]).append("\n");
		}
		
		// 출력
		System.out.println(sb);
	}
}

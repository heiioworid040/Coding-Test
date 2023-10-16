package stage;

import java.io.*;
import java.util.*;

public class Problem_231016_11441 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		
		// 수의 개수
		int n = Integer.parseInt(br.readLine());
		// 누적 합 배열
		int[] num = new int[n];
		
		// 누적 합 저장
		StringTokenizer st = new StringTokenizer(br.readLine());
		for(int i = 0; i < n; i++) {
			num[i] = Integer.parseInt(st.nextToken());
			if(i > 0) {
				num[i] += num[i - 1];
			}
		}
		
		// 구간의 개수
		int m = Integer.parseInt(br.readLine());
		while(m != 0) {
			st = new StringTokenizer(br.readLine());
			// i부터 j까지의 합
			int i = Integer.parseInt(st.nextToken()) - 1;
			int j = Integer.parseInt(st.nextToken()) - 1;
			
			int sum = 0;
			// 구간의 시작이 처음이라면 j번째 값
			if(i == 0) {
				sum = num[j];
			
			// 아니라면
			}else {
				// 구간을 계산
				sum = num[j] - num[i - 1];
			}
			sb.append(sum).append("\n");
			
			m--;
		}
		
		// 출력
		System.out.println(sb);
	}
}

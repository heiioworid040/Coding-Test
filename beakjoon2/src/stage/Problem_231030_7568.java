package stage;

import java.io.*;
import java.util.*;

public class Problem_231030_7568 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		// 전체 사람의 수
		int n = Integer.parseInt(br.readLine());
		// 등수
		int[] rank = new int[n];
		// 각 사람의 몸무게와 키
		int[][] people = new int[n][2];
		
		for(int i = 0; i < n; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			// 몸무게 입력 받기
			people[i][0] = Integer.parseInt(st.nextToken());
			// 키 입력 받기
			people[i][1] = Integer.parseInt(st.nextToken());
			// 등수 1로 초기화
			rank[i] = 1;
		}
		
		for(int i = 0; i < n; i++) {
			for(int j = 0; j < n; j++) {
				// i보다 덩치가 크면
				if(i != j && people[i][0] < people[j][0] && people[i][1] < people[j][1]) {
					// i의 등수 증가
					rank[i]++;
				}
			}
		}
		StringBuilder sb = new StringBuilder();
		for(int num : rank) {
			sb.append(num).append(" ");
		}
		// 출력
		System.out.println(sb);
	}
}

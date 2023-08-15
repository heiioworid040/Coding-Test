package stage13;

import java.io.*;
import java.util.*;

public class Problem_11651_230815 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		StringTokenizer st;

		// 점의 개수 n
		int n = Integer.parseInt(br.readLine());

		// 좌표 배열 생성
		int[][] list = new int[n][2];
		for(int i = 0; i < n; i++) {
			st = new StringTokenizer(br.readLine());
			for(int j = 0; j < 2; j++) {
				list[i][j] = Integer.parseInt(st.nextToken());
			}
		}
		
		// 좌표 정렬
		Arrays.sort(list, (o1, o2) -> {
			if(o1[1] == o2[1]) {
				return o1[0] - o2[0];
			}
			return o1[1] - o2[1];
		});
		
		// 좌표 출력
		for(int i = 0; i < n; i++) {
			sb.append(list[i][0]).append(" ").append(list[i][1]).append("\n");
		}
		System.out.println(sb);
	}
}
package stage13;

import java.io.*;
import java.util.*;

public class Problem_25305_230811 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		// 응시자 수 n
		int n = Integer.parseInt(st.nextToken());
		// 수상자 수 n
		int k = Integer.parseInt(st.nextToken());
		
		// 점수 배열
		int[] score = new int[n];
		st = new StringTokenizer(br.readLine());
		for(int i = 0; i < score.length; i++) {
			score[i] = Integer.parseInt(st.nextToken());
		}
		
		// 점수 배열 정렬
		Arrays.sort(score);
		
		// 커트라인 점수 출력
		System.out.println(score[n - k]);
	}
}
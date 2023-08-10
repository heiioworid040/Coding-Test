package stage13;

import java.io.*;
import java.util.*;

public class Problem_2587_230810 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		// 점수 배열 초기화
		int[] score = new int[5];
		for(int i = 0; i < 5; i++) {
			score[i] = Integer.parseInt(br.readLine());
		}
		
		// 평균 출력
		int avg = Arrays.stream(score).sum() / score.length;
		System.out.println(avg);
		
		// 중앙값 출력
		Arrays.sort(score);
		System.out.println(score[2]);
	}
}
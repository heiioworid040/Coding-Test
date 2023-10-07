package stage;

import java.io.*;
import java.util.*;

public class Problem_231007_2798 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		// 카드의 개수
		int n = Integer.parseInt(st.nextToken());
		// 커트라인 점수
		int m = Integer.parseInt(st.nextToken());
		
		// 카드 배열
		int[] num = new int[n];
		st = new StringTokenizer(br.readLine());
		
		// 숫자 입력받기
		for(int i = 0; i < n; i++) {
			num[i] = Integer.parseInt(st.nextToken());
		}
		
		// m을 넘지 않으면서 m에 최대한 가까운 숫자
		int max = 0;
		
		// 브루트포스 알고리즘
		for(int i = 0; i < n - 2; i++) {
			for(int j = i + 1; j < n - 1; j++) {
				for(int k = j + 1; k < n; k++) {
					// 카드 3장의 합
					int sum = num[i] + num[j] + num[k];
					// 합이 max 보다 크거나, m 이하라면
					if(max < sum && sum <= m) {
						// max에 저장
						max = sum;
					}
				}
			}
		}
		// 출력
		System.out.println(max);
	}
}

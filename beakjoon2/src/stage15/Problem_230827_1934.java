package stage15;

import java.io.*;
import java.util.*;

public class Problem_230827_1934 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		
		// 테스트 케이스의 개수 t
		int t = Integer.parseInt(br.readLine());
		
		// t개만큼 a와 b의 최소공배수 구하기
		StringTokenizer st;
		for(int i = 0; i < t; i++) {
			st = new StringTokenizer(br.readLine());
			int a = Integer.parseInt(st.nextToken());
			int b = Integer.parseInt(st.nextToken());
			
			// a와 b의 최대공약수 구하기
			int num = Math.min(a, b);
			for(int j = num; j >= 1; j--) {
				if(a % j == 0 && b % j == 0) {
					num = j;
					break;
				}
			}
			// 최소공배수를 계산하여 저장
			sb.append(num * (a / num) * (b / num)).append("\n");
		}
		
		// 출력
		System.out.println(sb);
	}
}

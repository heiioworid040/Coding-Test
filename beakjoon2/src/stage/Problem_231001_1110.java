package stage;

import java.io.*;

public class Problem_231001_1110 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		// 주어지는 정수 (0~99)
		int n = Integer.parseInt(br.readLine());
		
		// 사이클 길이
		int cnt = 0;
		// n의 copy
		String num = "-1";
		
		// 반복문
		while(n != Integer.parseInt(num)) {
			// 사이클 증가
			cnt++;
			
			// 처음이라면 num을 n값과 동일하게
			if(cnt == 1) {
				num = String.valueOf(n);
			}
			
			// 첫번째 자릿수
			int a = 0;
			// 두번째 자릿수
			int b = 0;
			
			// 9보다 크다면
			if(num.length() > 1) {
				// 첫번째 자릿수를 주어진 수의 왼쪽 자리 수
				a = num.charAt(0) - '0';
			}
			// 두번째 자릿수를 주어진 수의 오른쪽 자리 수
			b = num.charAt(num.length() - 1) - '0';
			// 두 수를 덧셈
			String result = String.valueOf(a + b);
			
			// 주어진 수의 오른쪽 자리 수와 result의 오른쪽 자리 수를 이어 붙임
			num = b + String.valueOf(result.charAt(result.length() - 1));
		}
		
		// 사이클 길이 출력
		System.out.println(cnt);
	}
}

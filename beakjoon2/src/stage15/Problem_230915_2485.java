package stage15;

import java.io.*;

public class Problem_230915_2485 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		// 심어져 있는 가로수의 수
		int n = Integer.parseInt(br.readLine());
		
		// 심어져 있는 가로수 위치를 담은 배열
		int[] num = new int[n];
		for(int i = 0; i < n; i++) {
			num[i] = Integer.parseInt(br.readLine());
		}
		
		// 초기 gcd 값 설정
		int gcd = num[1] - num[0];
		// gcd 계산
		for(int i = 2; i < n; i++) {
			int gap = num[i] - num[i - 1];
			gcd = gcd(gcd, gap);
		}
		
		// 새로 심어야 하는 가로수의 개수
		int cnt = 0;
		for(int i = 1; i < n; i++) {
			// 가로수 사이의 간격을 계산하여 기준 간격으로 나누기
			cnt += ((num[i] - num[i - 1]) / gcd - 1);
		}
		
		// 출력
		System.out.println(cnt);
	}
	
	// 최대공약수 구하는 메서드
	static int gcd(int a, int b) {
		if(a % b == 0) {
			return b;
		}else {
			return gcd(b, a % b);
		}
	}
}

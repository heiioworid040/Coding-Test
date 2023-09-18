package stage15;

import java.io.*;

public class Problem_230918_4948 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		
		while(true) {
			// 테스트 케이스 n
			int n = Integer.parseInt(br.readLine());
			
			// 입력의 마지막에는 0이 주어진다
			if(n == 0) break;
			
			// 소수의 개수 cnt
			int cnt = 0;
			
			// n보다 크고, 2n보다 작거나 같은 소수의 개수 구하기
			for(int i = n + 1; i <= 2 * n; i++) {
				if(isPrime(i)) cnt++;
			}
			
			// 출력
			sb.append(cnt).append("\n");
		}
		
		System.out.println(sb);
	}
	
	// 소수 판별식
	public static boolean isPrime(long num) {
		// 0이나 1이라면 소수가 아님
		if(num <= 1) {
			return false;
		
		// 2거나 3이라면 소수가 맞음
		}else if(num <= 3) {
			return true;
		
		// 2의 배수나 3의 배수라면 소수가 아님
		}else if(num % 2 == 0 || num % 3 == 0) {
			return false;
		}
		
		// 5부터 시작하여 6씩 증가할 때
		for(long i = 5; i * i <= num; i += 6) {
			// 5의 배수나 (5 + 2)의 배수는 소수가 아님
			if(num % i == 0 || num % (i + 2) == 0) {
				return false;
			}
		}
		
		// 위 조건에 속하지 않는다면 소수가 맞음
		return true;
	}
}

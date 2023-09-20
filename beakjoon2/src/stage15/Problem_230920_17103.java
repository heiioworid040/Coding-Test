package stage15;

import java.io.*;
import java.util.*;

public class Problem_230920_17103 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		// 테스트 케이스 개수
		int t = Integer.parseInt(br.readLine());
		
		// 테스트 케이스만큼 for문
		for(int i = 0; i < t; i++) {
			// 주어지는 짝수
			int n = Integer.parseInt(br.readLine());
			
			// n의 소수 배열
			boolean[] isPrime = isPrime(n);
			
			// 골드바흐 파티션의 수
			int answer = 0;
			
			// 두 소수의 순서만 다른 것은 같은 파티션임
			for(int j = 2; j <= n / 2; j++) {
				// 두 소수의 합이라면 변수 카운트++
				if(isPrime[j] && isPrime[n - j]) {
					answer++;
				}
			}
			// 출력
			System.out.println(answer);
		}
		
	}
	
	// 소수 배열 메서드
	public static boolean[] isPrime(int n) {
		// 배열 생성
		boolean[] isPrime = new boolean[n + 1];
		
		// 값을 모두 true로 채움
		Arrays.fill(isPrime, true);
		
		// 0과 1은 소수가 아님
		isPrime[0] = isPrime[1] = false;
		
		// 소수가 아닌 경우 모두 false로
		for(int i = 2; i * i <= n; i++) {
			if(isPrime[i]) {
				for(int j = i * i; j <= n; j += i) {
					isPrime[j] = false;
				}
			}
		}
		
		// 배열 반환
		return isPrime;
	}
}

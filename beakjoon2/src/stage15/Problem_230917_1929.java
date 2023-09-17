package stage15;

import java.io.*;
import java.util.*;

public class Problem_230917_1929 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		StringBuilder sb = new StringBuilder();
		
		// m 이상 n 이하의 모든 소수 출력
		int m = Integer.parseInt(st.nextToken());
		int n = Integer.parseInt(st.nextToken());
		
		// 소수가 맞다면 출력
		for(int i = m; i <= n; i++) {
			if(isPrime(i)) {
				sb.append(i).append("\n");
			}
		}
		System.out.println(sb);
	}
	
	// 소수 판별식
	public static boolean isPrime(long num) {
		// 0이나 1이라면 소수가 아님
		if(num <= 1) {
			return false;
		
		// 2나 3이라면 소수가 맞음
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

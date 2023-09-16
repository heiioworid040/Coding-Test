package stage15;

import java.io.*;

public class Problem_230916_4134 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		
		// 테스트 케이스의 개수
		long n = Long.parseLong(br.readLine());
		
		// 테스트 케이스의 개수만큼 for문
		for(long i = 0; i < n; i++) {
			// 주어진 정수보다 같거나 큰 소수 찾기
			long num = Long.parseLong(br.readLine());
			sb.append(findPrime(num)).append("\n");
		}
		
		// 출력
		System.out.println(sb);
	}
	
	// 같거나 큰 소수를 찾는 메서드
	public static long findPrime(long num) {
		long i = num;
		while(true) {
			// 소수인 정수 리턴
			if(isPrime(i)) return i;
			i++;
		}
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

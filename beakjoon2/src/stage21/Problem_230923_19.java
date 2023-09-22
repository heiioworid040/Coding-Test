package stage21;

import java.io.*;

// 학습을 위해 for문 대신 재귀 함수 사용
public class Problem_230923_19 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		// 주어지는 정수
		int n = Integer.parseInt(br.readLine());
		
		// n의 팩토리얼 출력
		System.out.println(factorial(n));
	}
	
	// 팩토리얼 메서드
	public static long factorial(int n) {
		// n이 0이거나 1이라면 1 반환
		if(n == 0 || n == 1) {
			return 1;
			
		// 아니라면
		}else {
			// 재귀
			return n * factorial(n - 1);
		}
	}
}

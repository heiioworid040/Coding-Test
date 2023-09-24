package stage21;

import java.io.*;

//학습을 위해 for문 대신 재귀 함수 사용
public class Problem_230924_10870 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		// 주어지는 수
		int n = Integer.parseInt(br.readLine());
		System.out.println(fibonacci(n));
	}
	
	// n번째 피보나치 수 찾는 재귀
	public static int fibonacci(int n) {
		// n이 0, 1이라면
		if(n <= 1) {
			return n;
		// 아니라면
		}else {
			return fibonacci(n - 1) + fibonacci(n - 2);
		}
	}
}

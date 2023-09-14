package stage19;

import java.io.*;

public class Problem_230914_10872 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		// 정수 n
		int n = Integer.parseInt(br.readLine());
		
		// 팩토리얼 값을 저장할 변수 result
		int result = 1;
		
		// n의 수보다 작거나 같은 모든 양의 정수의 곱
		for(int i = 1; i <= n; i++) {
			result *= i;
		}
		
		// 출력
		System.out.println(result);
	}
}

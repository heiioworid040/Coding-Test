package stage;

import java.io.*;
import java.util.*;

public class Problem_231004_2475 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		// 합을 저장할 변수
		int sum = 0;
		
		// 5자리의 고유번호를 처리하기
		for(int i = 0; i < 5; i++) {
			// 입력받은 고유번호
			int n = Integer.parseInt(st.nextToken());
			// 제곱한 수를 덧셈
			sum += Math.pow(n, 2);
		}
		
		// 10으로 나눈 나머지의 값이 검증수
		int result = sum % 10;
		
		// 출력
		System.out.println(result);
	}
}

package stage;

import java.io.*;

public class Problem_231002_2558 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		// 덧셈을 저장할 변수
		int sum = 0;
		
		// A와 B를 입력받아 더하기
		for(int i = 0; i < 2; i++) {
			sum += Integer.parseInt(br.readLine());
		}
		
		// 출력
		System.out.println(sum);
	}
}

package stage;

import java.io.*;

public class Problem_231006_10039 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		// 인원수
		int num = 5;
		
		// 점수의 합
		int total = 0;
		
		for(int i = 0; i < num; i++) {
			// 점수 입력 받기
			int score = Integer.parseInt(br.readLine());
			// 40 미만이라면 40점
			total += score < 40 ? 40 : score;
		}
		
		// 평균 출력
		System.out.println(total / num);
	}
}

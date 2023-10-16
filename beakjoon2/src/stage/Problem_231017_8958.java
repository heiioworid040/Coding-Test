package stage;

import java.io.*;

public class Problem_231017_8958 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		
		// 문제의 개수
		int n = Integer.parseInt(br.readLine());
		
		for(int i = 0; i < n; i++) {
			// 점수
			int score = 0;
			// 연속된 정답의 개수
			int count = 0;
			
			// 문제 결과
			String result = br.readLine();
			
			// 한 문자씩
			for(char ch: result.toCharArray()) {
				// 정답이라면
				if(ch == 'O') {
					// 연속된 정답의 개수 증가
					count++;
					// 점수 계산
					score += count;
					
				// 오답이라면
				}else {
					//연속된 정답의 개수 수정
					count = 0;
				}
			}
			sb.append(score).append("\n");
		}
		
		// 출력
		System.out.println(sb);
	}
}

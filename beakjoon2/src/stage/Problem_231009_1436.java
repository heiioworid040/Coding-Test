package stage;

import java.io.*;

public class Problem_231009_1436 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		// 주어진 수
		int n = Integer.parseInt(br.readLine());
		
		// 666이 연속으로 들어가는 수의 횟수
		int cnt = 0;
		
		for(int i = 666; i < Integer.MAX_VALUE; i++) {
			// 666이 연속으로 들어간다면 횟수 증가
			if(String.valueOf(i).contains("666")) {
				cnt++;
			}
			// 주어진 수에 해당하면
			if(cnt == n) {
				// 출력 후 종료
				System.out.println(i);
				break;
			}
		}
	}
}

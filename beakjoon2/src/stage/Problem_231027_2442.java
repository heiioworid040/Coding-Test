package stage;

import java.io.*;

public class Problem_231027_2442 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		
		// 별을 몇 줄 찍을지
		int n = Integer.parseInt(br.readLine());
		
		for(int i = 1; i <= n; i++) {
			// 대칭 맞추기
			for(int j = 0; j < n - i; j++) {
				sb.append(" ");
			}
			// 별 찍기
			for(int j = 1; j <= 2 * i - 1; j++) {
				sb.append("*");
			}
			// 다음 줄
			sb.append("\n");
		}
		// 출력
		System.out.println(sb);
	}
}

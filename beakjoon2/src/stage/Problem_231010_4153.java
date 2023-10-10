package stage;

import java.io.*;
import java.util.*;

public class Problem_231010_4153 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		StringTokenizer st;
		
		while(true) {
			// 세 변의 길이 입력 받기
			st = new StringTokenizer(br.readLine());
			int a = Integer.parseInt(st.nextToken());
			int b = Integer.parseInt(st.nextToken());
			int c = Integer.parseInt(st.nextToken());
			
			// 0 0 0이 입력되면 종료
			if(a + b + c == 0) {
				break;
			}
			
			// 각 변의 길이의 제곱하여 더한 값
			double sum = Math.pow(a, 2) + Math.pow(b, 2) + Math.pow(c, 2);
			// 빗변의 제곱
			double max = Math.pow(Math.max(a, Math.max(b, c)), 2);
			
			// 빗변의 제곱이 각 변의 길이를 제곱하여 더한 값의 반이라면
			if(max == sum / 2) {
				// 직각 삼각형이 맞음
				sb.append("right\n");
			}else {
				// 직각 삼각형이 아님
				sb.append("wrong\n");
			}
		}
		// 출력
		System.out.println(sb);
	}
}

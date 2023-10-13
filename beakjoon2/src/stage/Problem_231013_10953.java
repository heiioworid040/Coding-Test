package stage;

import java.io.*;
import java.util.*;

public class Problem_231013_10953 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		
		// 테스트 케이스의 수
		int t = Integer.parseInt(br.readLine());
		
		for(int i = 0; i < t; i++) {
			// 콤마 구분
			StringTokenizer st = new StringTokenizer(br.readLine(), ",");
			// a 입력 받기
			int a = Integer.parseInt(st.nextToken());
			// b 입력 받기
			int b = Integer.parseInt(st.nextToken());
			
			// a + b 계산
			sb.append(a + b).append("\n");
		}
		// 출력
		System.out.println(sb);
	}
}

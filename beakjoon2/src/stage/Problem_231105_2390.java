package stage;

import java.io.*;
import java.util.*;

public class Problem_231105_2390 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		
		// 등(1)의 개수로 구분하는 윷짝의 정보 배열
		String[] result = { "D", "C", "B", "A", "E" };
		
		for(int i = 0; i < 3; i++) {
			int sum = 0;
			StringTokenizer st = new StringTokenizer(br.readLine());
			for(int j = 0; j < 4; j++) {
				sum += Integer.parseInt(st.nextToken());
			}
			// 윷짝의 상태
			sb.append(result[sum]).append("\n");
		}
		// 출력
		System.out.println(sb);
	}
}

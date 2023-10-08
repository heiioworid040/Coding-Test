package stage;

import java.io.*;
import java.util.*;

public class Problem_231008_19532 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		
		// a, b, c, d, e, f의 값 배열
		int[] num = new int[6];
		StringTokenizer st = new StringTokenizer(br.readLine());
		// 입력받기
		for(int i = 0 ; i < 6; i++) {
			num[i] = Integer.parseInt(st.nextToken());
		}
		
		// 브루트포스 알고리즘을 활용한 연립방정식 계산
		for(int x = -999; x < 1000; x++) {
			for(int y = -999; y < 1000; y++) {
				// 두 식이 만족하는 경우
				if(num[0] * x + num[1] * y == num[2] && num[3] * x + num[4] * y == num[5]) {
					// 출력
					sb.append(x).append(" ").append(y);
					System.out.println(sb);
					// 종료
					return;
				}
			}
		}
	}
}

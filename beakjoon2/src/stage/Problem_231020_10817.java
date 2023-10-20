package stage;

import java.io.*;
import java.util.*;

public class Problem_231020_10817 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		// 세 정수 배열
		int[] list = new int[3];
		
		// 정수 입력받기
		for(int i = 0; i < 3; i++) {
			list[i] = Integer.parseInt(st.nextToken());
		}
		// 정렬
		Arrays.sort(list);
		
		// 두 번째로 큰 정수 출력
		System.out.println(list[1]);
	}
}

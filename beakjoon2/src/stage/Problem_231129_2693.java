package stage;

import java.io.*;
import java.util.*;

public class Problem_231129_2693 {
	private static final int LENGTH = 10;
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		
		int TestCases = Integer.parseInt(br.readLine());
		
		while(TestCases-- > 0) {
			int[] numbers = getInputData(br);
			// 오름차순 정렬
			Arrays.sort(numbers);
			// 3번째로 큰 값
			sb.append(numbers[LENGTH - 3]).append("\n");
		}
		
		System.out.println(sb);
	}

	// 배열 데이터 입력 처리 메서드
	public static int[] getInputData(BufferedReader br) throws IOException {
		StringTokenizer st = new StringTokenizer(br.readLine());
		int[] numbers = new int[LENGTH];
		
		for(int i = 0; i < LENGTH; i++) {
			numbers[i] = Integer.parseInt(st.nextToken());
		}
		
		return numbers;
	}
}

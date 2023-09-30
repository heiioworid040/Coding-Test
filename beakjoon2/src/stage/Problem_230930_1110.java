package stage;

import java.io.*;

public class Problem_230930_1110 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		
		// 세 개의 자연수 곱셈값
		int mul = 1;
		// 세 개의 자연수를 입력받아 곱셈 계산
		for(int i = 0; i < 3; i++) {
			mul *= Integer.parseInt(br.readLine());
		}
		
		// 0부터 9까지의 숫자가 몇 번 쓰였는지 저장
		int[] result = new int[10];
		
		// 곱셈값을 문자열로 변환
		String mulStr = String.valueOf(mul);
		
		// 문자열 길이만큼 for문
		for(int i = 0; i < mulStr.length(); i++) {
			// 해당 문자의 값++
			int ch = mulStr.charAt(i) - '0';
			result[(int)ch]++;
		}
		
		// 숫자 배열의 개수
		for(int n : result) {
			sb.append(n).append("\n");
		}
		
		// 출력
		System.out.println(sb);
	}
}

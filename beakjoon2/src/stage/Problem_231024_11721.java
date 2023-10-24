package stage;

import java.io.*;

public class Problem_231024_11721 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		
		// 소문자로만 이루어진 단어
		String str = br.readLine();
		// 단어의 길이
		int length = str.length();
		
		for(int i = 0, j = 1; i < str.length(); i+=10, j++) {
			// 10개 미만의 글자라면
			if(length < 10) {
				// 남은 글자 모두 출력
				sb.append(str.substring(i));
				
			}else {
				// 열 개씩 끊기
				sb.append(str.substring(i, j * 10));
				// 길이 감소
				length -= 10;
			}
			// 줄 바꿈
			sb.append("\n");
		}
		// 출력
		System.out.println(sb);
	}
}

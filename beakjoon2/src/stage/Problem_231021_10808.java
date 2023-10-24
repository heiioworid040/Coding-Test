package stage;

import java.io.*;

public class Problem_231021_10808 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		
		// 소문자로만 이루어진 단어
		String word = br.readLine();
		
		// 알파벳 배열
		int[] alp = new int[26];
		
		// 각 알파벳의 개수 계산
		for(char c : word.toCharArray()) {
			alp[c - 97]++;
		}
		
		// 알파벳 출력
		for(int i : alp) {
			sb.append(i).append(" ");
		}
		System.out.println(sb);
	}
}

package stage;

import java.io.*;

public class Problem_231202_2902 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		
		String s;
		while((s = br.readLine()) != null) {
			int[] counts = countCharacters(s);
			
			for(int n : counts) {
				sb.append(n).append(" ");
			}
			sb.append("\n");
		}
		System.out.println(sb);
	}
	
	// 문자열을 분석하여 개수를 반환하는 메서드(소문자 대문자 숫자 공백 순)
	public static int[] countCharacters(String s) {
		int[] counts = new int[4];
		for(char c : s.toCharArray()) {
			// 소문자
			if('a' <= c && c <= 'z') {
				counts[0]++;
			// 대문자
			}else if('A' <= c && c <= 'Z') {
				counts[1]++;
			// 숫자
			}else if('0' <= c && c <= '9') {
				counts[2]++;
			// 공백
			}else if(c == ' ') {
				counts[3]++;
			}
		}
		return counts;
	}
}

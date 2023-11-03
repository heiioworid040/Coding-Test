package stage;

import java.io.*;

public class Problem_231103_1259 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		
		while(true) {
			// 입력 받기
			String num = br.readLine();
			// 0이 나오면 종료
			if(num.equals("0")) break;
			// 팰린드롬수라면 yes, 아니라면 no
			sb.append(isPalindrome(num) ? "yes" : "no").append("\n");
		}
		// 출력
		System.out.println(sb);
	}
	
	// 팰린드롬 여부 반환
	public static boolean isPalindrome(String num) {
		int length = num.length();
		for(int i = 0; i < length / 2; i++) {
			if(num.charAt(i) != num.charAt(length - 1 - i)) {
				return false;
			}
		}
		return true;
	}
}

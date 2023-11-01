package stage;

import java.io.*;

public class Problem_231101_3062 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		
		// 테스트 케이스의 수
		int n = Integer.parseInt(br.readLine());
		
		for(int i = 0; i < n; i++) {
			// 원래 수
			String num = br.readLine();
			
			// 원래 수와 뒤집은 수 덧셈
			String sum = String.valueOf(reverseNumber(num) + Integer.parseInt(num));
			
			// 좌우대칭이라면
			if(isPalindrome(sum)) {
				sb.append("YES").append("\n");
			}else {
				sb.append("NO").append("\n");
			}
		}
		// 출력
		System.out.println(sb);
	}
	
	// 뒤집은 수를 반환하는 메서드
	public static int reverseNumber(String num) {
		int reversed = 0;
		for(int j = num.length() - 1; j >= 0; j--) {
			reversed += Integer.parseInt(num.charAt(j) + "") * (int)Math.pow(10, j);
		}
		
		return reversed;
	}
	
	// 팰린드롬 여부를 반환하는 메서드
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

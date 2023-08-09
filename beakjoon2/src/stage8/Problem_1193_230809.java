package stage8;

import java.io.*;

public class Problem_1193_230809 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int X = Integer.parseInt(br.readLine());
		
		// 대각선 몇 번째 줄에 위치하는지 찾기
		int line = 1;
		while(X > line) {
			X -= line;
			line++;
		}
		
		// 분자, 분모 정의
		int numerator, denominator;
		
		// 줄의 번호가 홀수라면
		if(line % 2 == 1) {
			numerator = line - X + 1;
			denominator = X;
			
		// 줄의 번호가 짝수라면
		}else {
			numerator = X;
			denominator = line - X + 1;
		}
		
		System.out.println(numerator + "/" + denominator);
	}
}
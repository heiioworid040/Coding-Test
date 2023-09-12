package stage19;

import java.io.*;

public class Problem_230912_15439 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		// 색상 개수 i 
		int i = Integer.parseInt(br.readLine());
		
		// 상의와 하의가 서로 다른 색상의 조합 계산 후 출력
		System.out.println(i * i - i);
	}
}

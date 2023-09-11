package stage15;

import java.io.*;

public class Problem_230911_13909 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		// 창문과 사람의 수 n
		int n = Integer.parseInt(br.readLine());
		
		// 열린 창문의 개수
		int count = 0;
		
		// 제곱수
		for(int i = 1; i * i <= n; i++) {
			count++;
		}
		
		//출력
		System.out.println(count);
	}
}

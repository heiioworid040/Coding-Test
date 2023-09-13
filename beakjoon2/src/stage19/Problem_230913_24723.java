package stage19;

import java.io.*;

public class Problem_230913_24723 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		// 녹색거탑의 높이 n
		int n = Integer.parseInt(br.readLine());
		
		// 녹색거탑의 정상에서 바닥으로 내려오는 경우의 수 출력
		System.out.println((int)Math.pow(2, n));
	}
}

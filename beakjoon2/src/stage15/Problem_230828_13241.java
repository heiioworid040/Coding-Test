package stage15;

import java.io.*;
import java.util.*;

public class Problem_230828_13241 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		// 한 줄에 주어지는 두 정수 a, b
		long a = Integer.parseInt(st.nextToken());
		long b = Integer.parseInt(st.nextToken());
		
		// 최대공약수
		long gcd = euclidean(a, b);
		
		// 최소공배수 계산하여 출력
		System.out.println(a * b / gcd);
	}
	
	// 유클리드 호제법으로 최대공약수 구하기
	static long euclidean(long a, long b) {
		if(a % b == 0) {
			return b;
		}else {
			return euclidean(b, a % b);
		}
	}
}

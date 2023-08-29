package stage15;

import java.io.*;
import java.util.*;

public class Problem_230829_1735 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		StringTokenizer st;
		
		// 주어지는 두 분수
		int[][] numList = new int[2][2];
		
		// 값 입력 받기
		for(int i = 0; i < 2; i++) {
			st = new StringTokenizer(br.readLine());
			
			for(int j = 0; j < 2; j++) {
				numList[i][j] = Integer.parseInt(st.nextToken());
			}
		}
		
		// 두 분모의 최소공배수 구하기
		int lcm = lcm(numList[0][1], numList[1][1]);
		
		// 두 분수의 분자 덧셈 
		int numerator = 0;
		for(int i = 0; i < numList.length; i++) {
			numerator += lcm / numList[i][1] * numList[i][0];
		}
		
		// 분모와 분자의 최소공배수 구하기
		int gcd = gcd(lcm, numerator);
		
		// 기약분수 출력
		sb.append(numerator / gcd).append(" ").append(lcm / gcd);
		System.out.println(sb);
	}
	
	// 최대공약수
	static int gcd(int a, int b) {
		int min = Math.min(a, b);
		int max = Math.max(a, b);
		
		while(min != 0) {
			int tmp = min;
			min = max % min;
			max = tmp;
		}
		
		return max;
	}
	
	// 최소공배수
	static int lcm(int a, int b) {
		return a * b / gcd(a, b);
	}
}

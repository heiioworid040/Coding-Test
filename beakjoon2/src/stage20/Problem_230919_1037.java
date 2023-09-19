package stage20;

import java.io.*;
import java.util.*;

public class Problem_230919_1037 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		// 약수의 개수
		int t = Integer.parseInt(br.readLine());
		
		// 최댓값
		int max = Integer.MIN_VALUE;
		// 최솟값
		int min = Integer.MAX_VALUE;
		
		StringTokenizer st = new StringTokenizer(br.readLine());
		// 약수의 개수만큼 for문
		for(int i = 0; i < t; i++) {
			// 약수
			int n = Integer.parseInt(st.nextToken());
			
			// 최댓값과 최솟값 구하기
			if(max < n) max = n;
			if(min > n) min = n;
		}
		
		// 양수 구하기
		System.out.println(max * min);
	}
}

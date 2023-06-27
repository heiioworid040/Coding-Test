package stage10;

import java.io.*;
import java.util.*;

public class Problem_9063_230627 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		int n = Integer.parseInt(br.readLine());
		int[] x = new int[n];
		int[] y = new int[n];
		
		for(int i = 0; i < n; i++) {
			st = new StringTokenizer(br.readLine());
			x[i] = Integer.parseInt(st.nextToken());
			y[i] = Integer.parseInt(st.nextToken());
		}
		
		//최댓값과 최솟값을 구하기 위해 배열 정렬
		Arrays.sort(x);
		Arrays.sort(y);
		
		//최댓값 - 최솟값
		int resultX = x[n-1] - x[0];
		int resultY = y[n-1] - y[0];
		
		//넓이 계산
		System.out.println(resultX * resultY);
	}
}
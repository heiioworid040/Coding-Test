package stage;

import java.io.*;
import java.util.*;

public class Problem_231011_1026 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		// 배열의 길이
		int n = Integer.parseInt(br.readLine());
		
		// 정수 배열 a, b 정의
		int[] a = new int[n];
		int[] b= new int[n];
		
		StringTokenizer stA = new StringTokenizer(br.readLine());
		StringTokenizer stB = new StringTokenizer(br.readLine());
		
		// 정수 입력 받기
		for(int i = 0; i < n; i++) {
			a[i] = Integer.parseInt(stA.nextToken());
			b[i] = Integer.parseInt(stB.nextToken());
		}
		
		// a의 수를 오름차순 정렬 (b는 재배열하면 안 되는 것이 규칙)
		Arrays.sort(a);
		
		// 합계
		int sum = 0;
		
		// 최댓값의 index
		int maxIndex = 0;
		
		// a의 길이만큼 반복
		for(int i = 0; i < n; i++) {
			// 최댓값 변수를 -1로 초기화
			int max = -1;
			
			// b의 길이만큼 반복
			for(int j = 0; j < n; j++) {
				// 저장되어있는 최댓값보다 크다면
				if(max < b[j]) {
					// 최댓값 저장
					max = b[j];
					// 최댓값 index 저장
					maxIndex = j;
				}
			}
			// 처리된 값은 다시 처리되지 않도록 변경
			b[maxIndex] = -1;
			// 최솟값 덧셈
			sum += a[i] * max;
		}
		
		// 출력
		System.out.println(sum);
	}
}

// 그리디 알고리즘을 사용하지 않는 경우 (20줄 이후~)
// Arrays.sort(b);
// int sum = 0;
// for(int i = 0; i < n; i++) {
// 	 sum += a[i] * b[n - 1 - i];
// }

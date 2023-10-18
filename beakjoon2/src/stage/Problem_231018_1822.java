package stage;

import java.io.*;
import java.util.*;

public class Problem_231018_1822 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		// 차집합 구하기
		TreeSet<Integer> result = new TreeSet<>();

		// 집합 a 원소의 개수
		int a = Integer.parseInt(st.nextToken());
		// 집합 b 원소의 개수
		int b = Integer.parseInt(st.nextToken());
		
		// a와 b의 차집합 구하기
		for(int i = 0; i < 2; i++) {
			st = new StringTokenizer(br.readLine());
			
			if(i == 0) {
				for(int j = 0; j < a; j++) {
					// a의 원소를 추가
					result.add(Integer.parseInt(st.nextToken()));
				}
				
			}else {
				for(int j = 0; j < b; j++) {
					// b의 원소를 제거
					result.remove(Integer.parseInt(st.nextToken()));
				}
			}
		}
		
		// 차집합의 길이
		sb.append(result.size()).append("\n");
		
		// 차집합의 원소
		for(int n : result) {
			sb.append(n).append(" ");
		}
		
		// 출력
		System.out.println(sb.toString().trim());
	}
}

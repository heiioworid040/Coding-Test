package stage14;

import java.io.*;
import java.util.*;

public class Problem_10816_230822 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		StringTokenizer st;
		
		// 상근이가 가지고 있는 숫자 카드 개수
		int n = Integer.parseInt(br.readLine());
		
		// 카드의 숫자와 개수의 정보를 저장
		Map<String, Integer> map = new HashMap<>();
		st = new StringTokenizer(br.readLine());
		for(int i = 0; i < n; i++) {
			String num = st.nextToken();
			map.put(num, map.getOrDefault(num, 0) + 1);
		}
		
		// 계산할 숫자 카드의 개수
		int m = Integer.parseInt(br.readLine());
		
		// 숫자 카드 개수 계산하기
		st = new StringTokenizer(br.readLine());
		for(int i = 0 ; i < m; i++) {
			String num = st.nextToken();
			sb.append(map.getOrDefault(num, 0)).append(" ");
		}
		
		// 출력
		System.out.println(sb);
	}
}

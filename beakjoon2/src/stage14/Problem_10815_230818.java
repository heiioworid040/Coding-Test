package stage14;

import java.io.*;
import java.util.*;

public class Problem_10815_230818 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		
		// 상근이의 숫자 카드
		int n = Integer.parseInt(br.readLine());
		Set<Integer> sg = new HashSet<>(n);
		
		StringTokenizer st = new StringTokenizer(br.readLine());
		for(int i = 0; i < n; i++) {
			sg.add(Integer.parseInt(st.nextToken()));
		}
		
		// 가지고 있는 숫자 카드인지 구해야 할 m개의 정수
		int m = Integer.parseInt(br.readLine());
		boolean[] list = new boolean[m];
		
		st = new StringTokenizer(br.readLine());
		for(int i = 0; i < m; i++) {
			int num = Integer.parseInt(st.nextToken());
			if(sg.contains(num)) {
				list[i] = true;
			}
		}
		
		// 숫자 카드 출력
		for(boolean i : list) {
			sb.append(i ? 1 : 0).append(" ");
		}
		
		System.out.println(sb);
	}
}

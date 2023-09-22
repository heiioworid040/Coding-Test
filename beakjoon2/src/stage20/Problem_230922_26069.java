package stage20;

import java.io.*;
import java.util.*;

public class Problem_230922_26069 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		
		// 만난 기록의 수
		int n = Integer.parseInt(br.readLine());
		
		// 춤을 추는 사람 모음집
		Set<String> dance = new TreeSet<>();
		// 총총이 추가
		dance.add("ChongChong");
		
		// 기록의 수만큼 for문
		for(int i = 0 ; i < n; i++) {
			// 사람 a, b 입력받기
			st = new StringTokenizer(br.readLine());
			String a = st.nextToken();
			String b = st.nextToken();
			
			// a, b 중 한 명이 춤을 추고 있는 사람이라면
			if(dance.contains(a) || dance.contains(b)) {
				// 추가
				dance.add(a);
				dance.add(b);
			}
		}
		
		// 인원수 출력
		System.out.println(dance.size());
	}
}

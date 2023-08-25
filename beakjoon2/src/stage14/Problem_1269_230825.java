package stage14;

import java.io.*;
import java.util.*;

public class Problem_1269_230825 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		// 원소 배열 (A와 B의 개수)
		int[] ele = {Integer.parseInt(st.nextToken()), Integer.parseInt(st.nextToken())};
		
		// 대칭 차집합을 계산할 set
		Set<Integer> list = new HashSet<>();
		
		// 집합의 개수만큼 for문
		for(int i = 0; i < ele.length; i++) {
			st = new StringTokenizer(br.readLine());
			
			// 각 원소의 개수만큼 for문
			for(int j = 0; j < ele[i]; j++) {
				// 원소 num
				int num = Integer.parseInt(st.nextToken());
				
				// 이미 있는 원소라면 제거
				if(list.contains(num)) {
					list.remove(num);
				
				// 없는 원소라면 추가
				}else {
					list.add(num);
				}
			}
		}
		
		// 대칭 차집합의 원소의 개수 출력
		System.out.println(list.size());
	}
}

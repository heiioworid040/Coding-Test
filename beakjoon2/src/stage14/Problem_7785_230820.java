package stage14;

import java.io.*;
import java.util.*;

public class Problem_7785_230820 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		StringTokenizer st;

		// 출입 기록의 수 n
		int n = Integer.parseInt(br.readLine());
		
		// 출근 기록 저장
		TreeSet<String> list = new TreeSet<>(Comparator.reverseOrder());
		for(int i = 0; i < n; i++) {
			st = new StringTokenizer(br.readLine());
			String name = st.nextToken();
			String recode = st.nextToken();
			
			// 퇴근 시 기록 제거
			if(recode.equals("enter")) {
				list.add(name);
			}else {
				list.remove(name);
			}
		}
		
		// 현재 회사에 있는 사람의 이름 출력
		for(String num : list) {
			sb.append(num).append("\n");
		}
		
		System.out.println(sb);
	}
}

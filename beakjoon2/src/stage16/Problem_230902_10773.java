package stage16;

import java.io.*;
import java.util.*;

public class Problem_230902_10773 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		// 주어질 정수의 개수 k
		int k = Integer.parseInt(br.readLine());
		
		// 계산을 위한 stack
		Stack<Integer> st = new Stack<>();
		
		// 정수를 받아 적기
		for(int i = 0; i < k; i++) {
			// 주어지는 정수 n
			int n = Integer.parseInt(br.readLine());
			
			// 정수 추가
			if(n != 0) {
				st.push(n);
			// 0을 부르면 최근 수 제거
			}else {
				st.pop();
			}
		}
		
		// 합 계산
		int result = 0;
		while(!st.empty()) {
			result += st.pop();
		}
		
		// 출력
		System.out.println(result);
	}
}

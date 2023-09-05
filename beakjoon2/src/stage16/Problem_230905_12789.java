package stage16;

import java.io.*;
import java.util.*;

public class Problem_230905_12789 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		// 줄 서있는 학생들의 수 n
		int n = Integer.parseInt(br.readLine());
		
		// 간식 받는 공간
		Stack<Integer> snack = new Stack<>(){{push(0);}};
		// 대기 공간
		Stack<Integer> waiting = new Stack<>();
		
		// 모든 학생들의 번호표 순서 입력받기
		StringTokenizer st = new StringTokenizer(br.readLine());
		for(int i = 0; i < n; i++) {
			// 학생 번호표
			int people = Integer.parseInt(st.nextToken());
			
			// 마지막으로 간식 받은 학생이 이전 번호라면
			if(snack.peek() == people -1) {
				// 간식 받기
				snack.push(people);
			// 아니라면
			}else {
				// 대기 줄
				waiting.push(people);
			}
			
			// 대기 줄에 사람이 있을 때
			while(!waiting.empty()) {
				// 마지막으로 간식을 받은 학생이 대기 줄에 있는 학생의 이전 번호라면
				if(snack.peek() == waiting.peek() - 1) {
					// 간식 받기
					snack.push(waiting.pop());
				
				// 아니라면 다음 학생 받기
				}else {
					break;
				}
			}
		}
		
		// 모든 학생이 간식을 받았다면
		if(waiting.empty()) {
			System.out.println("Nice");
		
		// 아니라면
		}else {
			System.out.println("Sad");
		}
	}
}

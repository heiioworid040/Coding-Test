package stage10;

import java.io.*;
import java.util.*;

public class Problem_5073_230629 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		StringBuilder sb = new StringBuilder();
		Integer[] t = new Integer[3];
		
		while(true) {
			st = new StringTokenizer(br.readLine());
			
			//세 변의 길이 입력받기
			for(int i = 0; i < 3; i++) {
			t[i] = Integer.parseInt(st.nextToken());
			}
			
			//0 0 0이 나오면 종료
			if(t[0] == 0 && t[1] == 0 && t[2] == 0) break;
			
			//배열 정렬
			Arrays.sort(t);
			
			//삼각형의 조건을 만족하지 못하는 경우
			if(t[2] >= (t[0] + t[1])) {
				sb.append("Invalid"+"\n");
			
			//삼각형의 조건을 만족하는 경우
			}else {
				//배열 중복 제거
				Set<Integer> set = new HashSet<>(Arrays.asList(t));
				Integer[] tri = set.toArray(new Integer[0]);
				int len = tri.length;
				
				//세 변의 길이가 모두 같은 경우
				if(len == 1) {
					sb.append("Equilateral"+"\n");
				
				//두 변의 길이만 같은 경우
				}else if(len == 2) {
					sb.append("Isosceles"+"\n");
				
				//세 변의 길이가 모두 다른 경우
				}else {
					sb.append("Scalene"+"\n");
				}
			}
		}
		
		System.out.println(sb);
	}
}
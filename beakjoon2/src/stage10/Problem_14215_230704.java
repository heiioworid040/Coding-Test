package stage10;

import java.io.*;
import java.util.*;

public class Problem_14215_230704 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		StringBuilder sb = new StringBuilder();
		
		//세 막대 입력받기
		int[] t = new int[3];
		for(int i = 0; i < 3; i++) {
			t[i] = Integer.parseInt(st.nextToken());
		}
		
		//배열 정렬
		Arrays.sort(t);
		
		//빗변을 제외한 길이의 합이 빗변보다 크다면
		if(t[0] + t[1] > t[2]) {
			//삼각형 둘레 구하기
			sb.append(t[0] + t[1] + t[2]);
		
		}else {
			sb.append((t[0] + t[1]) * 2 -1);
		}
		
		System.out.println(sb);
	}
}
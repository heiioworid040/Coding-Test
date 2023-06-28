package stage10;

import java.io.*;
import java.util.*;

public class Problem_10101_230628 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		Integer[] t = new Integer[3];
		int sum = 0;
		
		//세 각 입력받고 합 구하기
		for(int i = 0; i < 3; i++) {
			t[i] = Integer.parseInt(br.readLine());
			sum += t[i];
		}
		
		//삼각형이라면
		if(sum == 180) {
			//배열 중복 제거
			Set<Integer> set =  new HashSet<>(Arrays.asList(t));
			Integer[] tri = set.toArray(new Integer[0]);
			
			//등변삼각형
			if(tri.length == 1) {
				sb.append("Equilateral");
			
			//이등변삼각형
			}else if(tri.length == 2) {
				sb.append("Isosceles");
			
			//부등변삼각형
			}else {
				sb.append("Scalene");
			}
		
		//삼각형이 아니라면
		}else {
			sb.append("Error");
		}
		
		System.out.println(sb);
	}
}
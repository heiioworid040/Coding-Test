package stage13;

import java.io.*;
import java.util.*;

public class Problem_1427_230813 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		
		// 정렬할 수 n
		String n = br.readLine();
		
		// 정렬을 위한 숫자배열 생성
		int[] list = new int[n.length()];
		for(int i = 0; i < list.length; i++) {
			list[i] = n.charAt(i) - '0';
		}
		
		// 오름차순 정렬
		Arrays.sort(list);
		
		// 출력할 숫자 담기
		for(int i = 0; i < list.length; i++) {
			sb.append(list[i]);
		}
		
		// 내림차순으로 출력
		System.out.println(sb.reverse());
	}
}
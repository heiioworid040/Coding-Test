package stage14;

import java.io.*;
import java.util.*;

public class Problem_11478_230824 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		// 문자열 s
		String s = br.readLine();
		// 문자열의 길이
		int len = s.length();
		
		// 부분 문자열 저장
		Set<String> set = new HashSet<>();
		for(int i = 0; i < len; i++) {
			for(int j = len; j > 0 + i; j--) {
				set.add(s.substring(i, j));
			}
		}
		
		// 중복 제거된 부분 문자열의 개수 출력
		System.out.println(set.size());
	}
}

package stage13;

import java.io.*;
import java.util.*;

public class Problem_1181_230816 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();

		// 단어의 개수 n
		int n = Integer.parseInt(br.readLine());

		// 단어 배열 생성
		String[] list = new String[n];
		for(int i = 0; i < n; i++) {
			list[i] = br.readLine();
		}
		
		// 단어 중복 제거
        Set<String> listDistinct = new HashSet<>(Arrays.asList(list));
        String[] newList = listDistinct.toArray(new String[0]);
		
		// 단어 배열 정렬
		Arrays.sort(newList, (s1, s2) -> {
			if(s1.length() != s2.length()) {
				return Integer.compare(s1.length(), s2.length());
			}
			return s1.compareTo(s2);
		});
		
		// 단어 출력
		for(String str : newList) {
			sb.append(str).append("\n");
		}
		System.out.println(sb);
	}
}
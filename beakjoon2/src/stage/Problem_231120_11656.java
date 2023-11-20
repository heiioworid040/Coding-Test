package stage;

import java.io.*;
import java.util.*;

public class Problem_231120_11656 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		
		String word = br.readLine();
		String[] suffixes = getSortedSuffixes(word);
		
		for(String s : suffixes) {
			sb.append(s).append("\n");
		}
		
		System.out.println(sb);
	}
	
	// 문자열의 모든 접미사를 사전순으로 정렬하여 반환
	public static String[] getSortedSuffixes(String word) {
		int length = word.length();
		String[] suffixes = new String[length];
		
		for(int i = 0; i < length; i++) {
			suffixes[i] = word.substring(i);
		}
		
		Arrays.sort(suffixes);
		
		return suffixes;
	}
}

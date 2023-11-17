package stage;

import java.io.*;

public class Problem_231117_2744 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String word = br.readLine();
		String changeWord = reverseCase(word);
		System.out.println(changeWord);
    }
	
	// 대문자->소문자, 소문자->대문자 변환 메서드
	public static String reverseCase(String word) {
		StringBuilder changeWord = new StringBuilder(word.length());
		for(int i = 0; i < word.length(); i++) {
			char c = word.charAt(i);
			if('a' <= c && 'z' >= c) {
				changeWord.append(Character.toUpperCase(c));
			}else {
				changeWord.append(Character.toLowerCase(c));
			}
		}
		return changeWord.toString();
	}
}

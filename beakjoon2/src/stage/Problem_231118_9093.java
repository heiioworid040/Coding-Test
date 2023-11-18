package stage;

import java.io.*;
import java.util.*;

public class Problem_231118_9093 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sentenceResult = new StringBuilder();
		
		int sentenceCount = Integer.parseInt(br.readLine());
		
		while(sentenceCount-- > 0) {
			reverseSentence(br, sentenceResult);
			sentenceResult.append("\n");
		}
		System.out.println(sentenceResult);
	}
	
	// 단어를 모두 뒤집는 메서드
	public static StringBuilder reverseSentence(BufferedReader br, StringBuilder sentenceResult) throws IOException {
		StringTokenizer st = new StringTokenizer(br.readLine());
		while(st.hasMoreTokens()) {
			StringBuilder word = new StringBuilder(st.nextToken());
			sentenceResult.append(word.reverse()).append(" ");
		}
		return sentenceResult;
	}
}

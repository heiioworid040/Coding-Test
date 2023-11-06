package stage;

import java.io.*;

public class Problem_231106_25640 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		// 본인의 MBTI 유형
		String mbti = br.readLine();
		// 친구들의 수
		int n = Integer.parseInt(br.readLine());
		
		// MBTI 유형이 같은 사람의 수
		int count = 0;
		
		for(int i = 0; i < n; i++) {
			// 같다면 카운트 증가
			if(mbti.equals(br.readLine())) count++;
		}
		
		// 출력
		System.out.println(count);
	}
}

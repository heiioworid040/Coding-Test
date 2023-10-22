package stage;

import java.io.*;
import java.util.StringTokenizer;

public class Problem_231022_2455 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		// 정차역의 개수
		int trainCount = 4;
		// 사람 수
		int peopleCount = 0;
		// 가장 많을 때의 사람 수
		int peopleMax = 0;
		
		// 정차역의 개수만큼
		for(int i = 0; i < trainCount; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			// 내린 사람 수
			int out = Integer.parseInt(st.nextToken());
			// 탄 사람 수
			int in = Integer.parseInt(st.nextToken());
			// 사람 수 계산
			peopleCount += (in - out);
			
			// 가장 많은 사람 수 구하기
			if(peopleCount > peopleMax) {
				peopleMax = peopleCount;
			}
		}
		
		// 출력
		System.out.println(peopleMax);
	}
}

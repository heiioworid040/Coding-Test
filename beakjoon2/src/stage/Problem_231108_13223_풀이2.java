package stage;

import java.io.*;
import java.util.*;

public class Problem_231108_13223_풀이2 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		// 시간 배열
		int[][] time = new int[2][3];
		
		for(int i = 0; i < time.length; i++) {
			// ":" 을 구분자로 문자열 자르기
			StringTokenizer st = new StringTokenizer(br.readLine(), ":");
			
			for(int j = 0; j < time[0].length; j++) {
				// 시간 저장
				time[i][j] = Integer.parseInt(st.nextToken());
			}
		}
		
		// 결과 시간 배열
		int[] resultTime = new int[3];
		
		for(int i = 0; i < 3; i++) {
			// 소금 투하 시각 - 현재 시각
			resultTime[i] = time[1][i] - time[0][i];
		}
		
		for(int i = 2; i >= 0; i--) {
			// HOURS
			if(i == 0) {
				// 음수거나 0과 같다면
				if(resultTime[i] <= 0) {
					resultTime[i] += 24;
				}
			
			// MINUTES, SECONDS
			}else {
				// 음수라면
				if(resultTime[i] < 0) {
					resultTime[i] += 60;
					resultTime[i - 1]--;
				}
			}
		}
		
		// 출력
		System.out.printf("%02d:%02d:%02d", resultTime[0], resultTime[1], resultTime[2]);
	}
}

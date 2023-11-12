package stage;

import java.io.*;
import java.util.*;

public class Problem_231112_11399 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		// 사람 수
		int personNum = Integer.parseInt(br.readLine());
		// 사람별 인출 시간 배열
		int[] withdrawalTime = getInputData(br, personNum);
		// 각 사람이 돈을 인축하는데 필요한 시간의 합
		int totalTime = calculateTotalTime(withdrawalTime);
		
		// 출력
		System.out.println(totalTime);
	}
	
	// 배열에 데이터 넣는 메서드 (각 사람이 돈을 인출하는데 걸리는 시간, 최솟값을 구하기 위해 오름차순 정렬)
	public static int[] getInputData(BufferedReader br, int personNum) throws IOException {
		int[] withdrawalTime = new int[personNum];
		
		StringTokenizer st = new StringTokenizer(br.readLine());
		for(int i = 0; i < withdrawalTime.length; i++) {
			withdrawalTime[i] = Integer.parseInt(st.nextToken());
		}
		
		Arrays.sort(withdrawalTime);
		return withdrawalTime;
	}
	
	// 돈을 인출하는데 필요한 시간의 합의 최솟값을 구하는 메서드
	public static int calculateTotalTime(int[] withdrawalTime) {
		int sumTime = 0;
		int totalTime = 0;
		
		for(int n : withdrawalTime) {
			sumTime += n;
			totalTime += sumTime;
		}
		
		return totalTime;
	}
}

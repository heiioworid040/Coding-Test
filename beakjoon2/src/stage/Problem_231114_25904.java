package stage;

import java.io.*;
import java.util.*;

public class Problem_231114_25904 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		// 게임에 참여하는 사람 수
		int peopleCount = Integer.parseInt(st.nextToken());
		// 처음으로 낼 목소리의 높이
		int voice = Integer.parseInt(st.nextToken());
		
		// 각자가 낼 수 있는 목소리 높이의 상한선 배열
		int[] peopleVoice = getInputData(br, peopleCount);
		
		// 벌칙자
		int result = findLoser(voice, peopleVoice);
		
		// 출력
		System.out.println(result);
	}
	
	// 배열에 데이터를 넣는 메서드
	public static int[] getInputData(BufferedReader br, int peopleCount) throws IOException {
		StringTokenizer st = new StringTokenizer(br.readLine());
		int[] peopleVoice = new int[peopleCount];
		for(int i = 0; i < peopleVoice.length; i++) {
			peopleVoice[i] = Integer.parseInt(st.nextToken());
		}
		return peopleVoice;
	}
	
	// 벌칙자를 찾는 메서드
	public static int findLoser(int voice, int[] peopleVoice) {
		int i = 0;
		while(true) {
			// i의 수가 배열의 길이를 넘어가면 0으로 초기화
			if(i == peopleVoice.length) i = 0;
			
			// 자신이 낼 수 있는 목소리의 상한선이 더 높을 경우
			if(peopleVoice[i] >= voice) {
				// 소리의 높이 증가
				voice++;
				// 다음 번호로
				i++;
				
			}else {
				// 벌칙자 번호 반환
				return ++i;
			}
		}
	}
}

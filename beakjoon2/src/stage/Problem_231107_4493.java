package stage;

import java.io.*;
import java.util.*;

public class Problem_231107_4493 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		
		// 테스트 케이스의 수
		int t = Integer.parseInt(br.readLine());
		
		for(int i = 0; i < t; i++) {
			// 가위 바위 보를 한 횟수
			int n = Integer.parseInt(br.readLine());
			// 점수
			int[] score = new int[3];
			
			for(int j = 0; j < n; j++) {
				StringTokenizer st = new StringTokenizer(br.readLine());
				String player1 = st.nextToken();
				String player2 = st.nextToken();
				// 점수 증가
				score[winner(player1, player2)]++;
				
				if(j == n - 1) {
					// 이긴 게임의 수가 같다면
					if(score[0] == score[1]) {
						sb.append("TIE\n");
					// 아니라면
					}else {
						sb.append(score[0] > score[1] ? "Player 1\n" : "Player 2\n");
					}
				}
			}
		}
		// 출력
		System.out.println(sb);
	}
	
	// 가위 바위 보의 승자를 반환하는 메서드
	public static int winner(String player1, String player2) {
		// 무승부라면
		if(player1.equals(player2)) {
			return 2;
		
		// 1번이 R(바위)을 낸다면
		}else if(player1.equals("R")) {
			if(player2.equals("S")) {
				return 0;
			}else {
				return 1;
			}
		
		// 1번이 S(가위)를 낸다면
		}else if(player1.equals("S")) {
			if(player2.equals("R")) {
				return 1;
			}else {
				return 0;
			}
			
		// 1번이 P(보)를 낸다면
		}else {
			if(player2.equals("R")) {
				return 0;
			}else {
				return 1;
			}
		}
	}
}

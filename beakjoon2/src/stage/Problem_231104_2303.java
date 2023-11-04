package stage;

import java.io.*;
import java.util.*;

public class Problem_231104_2303 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		// 사람의 수
		int n = Integer.parseInt(br.readLine());
		
		// 가장 큰 값
		int maxData = 0;
		// 가장 큰 값의 인덱스
		int maxIndex = 0;
		
		for(int i = 0; i < n; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			
			// 다섯 장의 카드 배열
			int[] cards = new int[5];
			for(int j = 0; j < cards.length; j++) {
				// 카드
				cards[j] = Integer.parseInt(st.nextToken());
			}
			
			// 가장 큰 수
			int max = 0;
			for(int x = 0; x < cards.length; x++) {
				for(int y = x + 1; y < cards.length; y++) {
					for(int z = y + 1; z < cards.length; z++) {
						// 세 장의 카드를 더한 일의 자리 수 저장
						int lastDigit = (cards[x] + cards[y] + cards[z]) % 10;
						// 큰 수 저장
						max = Math.max(max, lastDigit);
						if(max == 9 || max >= maxData) continue;
					}
				}
			}
			// 가장 큰 값과 비교
			if(maxData <= max) {
				maxData = max;
				maxIndex = i + 1;
			}
		}
		// 이긴 사람의 번호 출력
		System.out.println(maxIndex);
	}
}

package stage;

import java.io.*;
import java.util.*;

public class Problem_231204_1715 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		// 카드 묶음의 수
		int cardCount = Integer.parseInt(br.readLine());
		
		// 우선순위 큐 (카드 묶음을 저장할 큐)
		PriorityQueue<Integer> card = new PriorityQueue<>((a, b) -> a.compareTo(b));
		while(cardCount-- > 0) {
			int cardNum = Integer.parseInt(br.readLine());
			card.add(cardNum);
		}
		
		// 최소 비교 수
		int count = minCount(card);
		System.out.println(count);
	}
	
	// 최소한 몇 번의 비교가 필요한지 반환하는 메서드
	public static int minCount(PriorityQueue<Integer> card) {
		int count = 0;
		while(card.size() > 1) {
			int sum = card.poll() + card.poll();
			count += sum;
			card.add(sum);
		}
		return count;
	}
}

package stage;

import java.io.*;
import java.util.*;

public class Problem_231127_11652 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int numberOfCards = Integer.parseInt(br.readLine());
		Map<Long, Integer> card = new TreeMap<>();
		
		long maxNum = Long.MIN_VALUE;
		
		while(numberOfCards-- > 0) {
			long num = Long.parseLong(br.readLine());
			card.put(num, card.getOrDefault(num, 0) + 1);
			
			// 가장 많이 가지고 있는 정수의 개수
			if(card.get(num) > maxNum) {
				maxNum = card.get(num);
			}
		}
		
		for(long key : card.keySet()) {
			if(card.get(key) == maxNum) {
				System.out.println(key);
				
				// TreeMap의 정렬을 이용해 한 번 출력 후 종료
				break;
			}
		}
	}
}

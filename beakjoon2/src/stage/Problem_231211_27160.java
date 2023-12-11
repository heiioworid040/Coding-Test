package stage;

import java.io.*;
import java.util.*;

public class Problem_231211_27160 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		// 카드의 개수
		int cardNum = Integer.parseInt(br.readLine());
		// 과일의 이름과 과일의 개수 map
		Map<String, Integer> fruit = new HashMap<>();
		
		while(cardNum-- > 0) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			String fruitName = st.nextToken();
			int fruitCount = Integer.parseInt(st.nextToken());
			
			fruit.put(fruitName, fruit.getOrDefault(fruitName, 0) + fruitCount);
		}
		
		// 과일의 개수가 5개인 데이터의 존재 여부
		boolean hasFiveNums = fruit.containsValue(5);
		System.out.println(hasFiveNums ? "YES" : "NO");
	}
}

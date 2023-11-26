package stage;

import java.io.*;
import java.util.*;

public class Problem_231126_1302 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int numberOfBooks = Integer.parseInt(br.readLine());
		
		Map<String, Integer> sellBook = mapPutData(br, numberOfBooks);
		String bestSeller = findBestSeller(sellBook);
		
		// 출력
		System.out.println(bestSeller);
	}
	
	// 하루 동안 팔린 책의 데이터 입력
	public static Map mapPutData(BufferedReader br, int sellBookCount) throws IOException {
		Map<String, Integer> sellBook = new HashMap<>();
		while(sellBookCount-- > 0) {
			String bookName = br.readLine();
			sellBook.put(bookName, sellBook.getOrDefault(bookName, 0) + 1);
		}
		return sellBook;
	}
	
	// 가장 많이 팔린 책의 제목을 반환
	public static String findBestSeller(Map<String, Integer> sellBook) {
		List<String> sortedKeys = new ArrayList<>(sellBook.keySet());
		sortedKeys.sort((e1, e2) -> {
			int salesDifference = sellBook.get(e2) - sellBook.get(e1);
			return salesDifference == 0 ? e1.compareTo(e2) : salesDifference;
		});
		
		return sortedKeys.get(0);
	}
}
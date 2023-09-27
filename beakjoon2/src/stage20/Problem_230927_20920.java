package stage20;

import java.io.*;
import java.util.*;
import java.util.Map.Entry;

public class Problem_230927_20920 {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		// 지문에 나오는 단어의 개수
		int n = Integer.parseInt(st.nextToken());
		
		// 외울 단어의 길이 기준
		int m = Integer.parseInt(st.nextToken());

		// 외울 단어 입력받을 배열
		List<String> words = new ArrayList<>();
		for(int i = 0; i < n; i++) {
			String word = br.readLine();
			// 단어의 길이가 m 이상이라면
			if(word.length() >= m) {
				words.add(word);
			}
		}
		
		// 맵 생성 후 키, 값 넣기
		Map<String, Integer> wordMap = new HashMap<>();
		for(String word : words) {
			wordMap.put(word, wordMap.getOrDefault(word, 0) + 1);
		}
		
		// 정렬
		List<Map.Entry<String, Integer>> entryList = new ArrayList<>(wordMap.entrySet());
		Collections.sort(entryList, (a, b) -> {
			int value = b.getValue().compareTo(a.getValue());
			// 나온 개수가 같다면
			if(value == 0) {
				int diff = b.getKey().length() - a.getKey().length();
				// 단어의 길이가 같다면
				if(diff == 0) {
					// 3. 사전 순 오름차순
					return a.getKey().compareTo(b.getKey());
				}
				// 2. 단어의 길이 내림차순
				return diff;
			}
			// 1. 자주 나온 단어 내림차순
			return value;
		});
		
		// 배열 읽기
		for(Entry<String, Integer> s : entryList) {
			sb.append(s.getKey()).append("\n");
		}
		
		// 출력
		System.out.println(sb);
	}
}

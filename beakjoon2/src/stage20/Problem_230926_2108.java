package stage20;

import java.io.*;
import java.util.*;

public class Problem_230926_2108 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		
		// 수의 개수 (홀수)
		int n = Integer.parseInt(br.readLine());
		
		// 덧셈
		double sum = 0.0;
		
		// 입력받은 수 배열
		int[] intList = new int[n];
		
		// 수 입력받고, 모든 수의 합 구하기
		for(int i = 0; i < n; i++) {
			intList[i] = Integer.parseInt(br.readLine());
			sum += intList[i];
		}
		
		// 1. 산술평균
		sb.append(Math.round(sum / n)).append("\n");
		
		// 숫자 배열 정렬
		Arrays.sort(intList);
		
		// 2. 중앙값
		sb.append(intList[n/2]).append("\n");
		
		// 맵 생성 후 키, 값 넣기
		Map<Integer, Integer> map = new HashMap<>();
		for(int num : intList) {
			map.put(num, map.getOrDefault(num, 0) + 1);
		}
		
		// 3. 최빈값
		if(n == 1) {
			// n이 1이라면 하나 뿐인 숫자가 최빈값
			sb.append(intList[0]).append("\n");
		}else {
			// ArrayList 생성 후 map entry 넣기
			List<Map.Entry<Integer, Integer>> entryList = new ArrayList<>(map.entrySet());
			
			// 정렬 (value 내림차순, value 같다면 key 오름차순)
			Collections.sort(entryList, (a, b) -> {
				int value = b.getValue().compareTo(a.getValue());
				if(value == 0) {
					return a.getKey().compareTo(b.getKey());
				}
				return value;
			});
			
			// 첫번째와 두번째의 값이 같다면 (=최빈값이 여러 개라면)
			if(entryList.get(0).getValue() == entryList.get(1).getValue()) {
				// 두 번째로 작은 값
				sb.append(entryList.get(1).getKey()).append("\n");
				
			// 아니라면
			}else {
				// 첫 번째 값
				sb.append(entryList.get(0).getKey()).append("\n");
			}
		}
		
		// 4. 범위 (최대값 - 최솟값)
		sb.append(Math.abs(intList[n - 1] - intList[0]));
		
		// 출력
		System.out.println(sb);

	}
}

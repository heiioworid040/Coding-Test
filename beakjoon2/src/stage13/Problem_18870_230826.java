package stage13;

import java.io.*;
import java.util.*;

public class Problem_18870_230826 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		
		// 좌표의 개수 n
		int n = Integer.parseInt(br.readLine());
		
		// 좌표 배열
		StringTokenizer st = new StringTokenizer(br.readLine());
		int[] list = new int[n];
		
		// 좌표 입력받기
		for(int i = 0; i < n; i++) {
			list[i] = Integer.parseInt(st.nextToken());
		}
		
		// 좌표를 복사하여 오름차순 정렬
		int[] sortedList = Arrays.copyOf(list, n);
		Arrays.sort(sortedList);
		
		// 압축을 위한 map 생성
		Map<Integer, Integer> map = new HashMap<>();
		
		// 오름차순으로 값 저장
		int idx = 0;
		for(int num : sortedList) {
			if(!map.containsKey(num)) {
				map.put(num, idx++);
			}
		}
		
		// 입력받은 좌표 순으로 값 출력
		for(int num : list) {
			sb.append(map.get(num)).append(" ");
		}
		
		
		System.out.println(sb);
	}
}

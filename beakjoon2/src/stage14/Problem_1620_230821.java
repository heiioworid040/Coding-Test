package stage14;

import java.io.*;
import java.util.*;

public class Problem_1620_230821 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		StringBuilder sb = new StringBuilder();
		
		// 포켓몬의 개수 n
		int n = Integer.parseInt(st.nextToken());
		
		// 맞춰야 하는 문제의 개수 m
		int m = Integer.parseInt(st.nextToken());
		
		// 포켓몬의 이름을 숫자로 바꿀 map
		Map<String, Integer> nameToNumber = new HashMap<>(n);
		
		// 숫자를 포켓몬의 이름으로 바꿀 배열
		String[] numberToName = new String[n];
		
		// 포켓몬 입력 받기
		for(int i = 0; i < n; i++) {
			String name = br.readLine();
			nameToNumber.put(name, i + 1);
			numberToName[i] = name;
		}
		
		// 맞춰야 할 문제
		for(int i = 0; i < m; i++) {
			String input = br.readLine();
			
			// 입력받은게 문자라면
			if(nameToNumber.containsKey(input)) {
				sb.append(nameToNumber.get(input)).append("\n");
			
			// 입력받은게 숫자라면
			}else {
				sb.append(numberToName[Integer.parseInt(input) - 1]).append("\n");
			}
		}
		
		System.out.println(sb);
	}
}
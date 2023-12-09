package stage;

import java.io.*;
import java.util.*;

public class Problem_231209_11004 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		// 수의 개수
		int totalCount = Integer.parseInt(st.nextToken());
		// 찾을 수의 인덱스
		int targetIndex = Integer.parseInt(st.nextToken()) - 1;
		
		int[] numbers = new int[totalCount];
		
		st = new StringTokenizer(br.readLine());
		while(totalCount-- > 0) {
			numbers[totalCount] = Integer.parseInt(st.nextToken());
		}
		
		Arrays.sort(numbers);
		
		System.out.println(numbers[targetIndex]);
	}
}

package stage;

import java.io.*;
import java.util.*;

public class Problem_231115_1920 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		
		// 배열 길이
		int length = Integer.parseInt(br.readLine());
		// 존재 여부 확인할 배열
		int[] sortedArray = getInputData(br, length);
		// 정렬
		Arrays.sort(sortedArray);

		// 입력받을 정수의 개수
		length = Integer.parseInt(br.readLine());
		
		StringTokenizer st = new StringTokenizer(br.readLine());
		while(length-- > 0) {
			// 정수 입력받기
			int numberToCheck = Integer.parseInt(st.nextToken());
			// 배열에 없는 수라면
			if(Arrays.binarySearch(sortedArray, numberToCheck) < 0) {
				sb.append("0\n");
			// 배열에 있는 수라면
			}else {
				sb.append("1\n");
			}
		}
		// 출력
		System.out.println(sb);
	}
	
	// 배열에 데이터를 넣는 메서드
	public static int[] getInputData(BufferedReader br, int length) throws IOException {
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int[] list = new int[length];
		for(int i = 0; i < length; i++) {
			list[i] = Integer.parseInt(st.nextToken());
		}
		
		return list;
	}
	
}

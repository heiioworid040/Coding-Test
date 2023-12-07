package stage;

import java.io.*;
import java.util.*;

public class Problem_231209_11047 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		// 동전 종류의 개수
		int coinTypes = Integer.parseInt(st.nextToken());
		// 동전 가치의 합계
		int totalAmount = Integer.parseInt(st.nextToken());
		
		// 동전의 가치 배열
		int[] coinValues = new int[coinTypes];
		for(int i = 0; i < coinTypes; i++) {
			int coinValue = Integer.parseInt(br.readLine());
			// 동전의 가치가 합계보다 크다면 계산하지 않음
			if(coinValue > totalAmount) continue;
			coinValues[i] = coinValue;
		}
		
		// 필요한 동전 개수
		int count = 0;
		while(totalAmount > 0) {
			// 동전의 가치가 0이라면 계산하지 않음
			if(coinValues[--coinTypes] == 0) continue;
			int ac = coinValues[coinTypes];
			count += totalAmount / ac;
			totalAmount %= ac;
		}
		
		// 출력
		System.out.println(count);
	}
}

package stage;

import java.io.*;
import java.util.*;

public class Problem_231025_5032 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		// 가지고 있는 빈 병의 수
		int bottle = Integer.parseInt(st.nextToken()) + Integer.parseInt(st.nextToken());
		// 새 병으로 바꾸는데 필요한 빈 병의 수
		int count = Integer.parseInt(st.nextToken());
		
		// 마실 수 있는 음료의 수
		int drink = 0;
		
		// 병을 바꿀 수 있다면 반복
		while(bottle >= count) {
			// 마신 음료 계산
			drink += bottle / count;
			// 빈 병의 수 계산
			bottle = bottle / count + bottle % count;
		}
		
		// 출력
		System.out.println(drink);
	}
}

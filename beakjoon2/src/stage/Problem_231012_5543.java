package stage;

import java.io.*;

public class Problem_231012_5543 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		// 버거의 종류
		final int BUGER_COUNT = 3;
		// 음료의 종류
		final int DRINK_COUNT = 2;
		
		// 버거의 가격(최대 2000)
		int burger = 2000;
		// 음료의 가격(최대 2000)
		int drink = 2000;
		
		// 버거와 음료의 종류만큼
		for(int i = 0; i < BUGER_COUNT + DRINK_COUNT; i++) {
			// 가격 입력 받기
			int price = Integer.parseInt(br.readLine());
			
			// 버거의 종류 먼저 입력받음
			if(i < BUGER_COUNT) {
				// 저렴한 가격 저장
				burger = Math.min(burger, price);
				
			// 음료의 종류
			}else {
				// 저렴한 가격 저장
				drink = Math.min(drink, price);
			}
		}
		
		// 세트 할인 50원을 뺀 가격 출력
		System.out.println(burger + drink - 50);
	}
}

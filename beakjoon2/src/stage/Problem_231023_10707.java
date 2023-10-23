package stage;

import java.io.*;

public class Problem_231023_10707 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		// X사의 가격 (1리터당 가격 입력받음)
		int xPrice = Integer.parseInt(br.readLine());
		// Y사의 가격 (기본요금 입력 받음)
		int yPrice = Integer.parseInt(br.readLine());
		// Y사의 기본요금이 되는 사용량
		int yBasic = Integer.parseInt(br.readLine());
		// Y사의 1리터 당 추가요금
		int yAdd = Integer.parseInt(br.readLine());
		// 한 달간 사용한 수도의 양
		int amount = Integer.parseInt(br.readLine());
		
		// X사의 총 가격 계산
		xPrice *= amount;
		
		// 기본요금 기준의 사용량이 적다면
		if(yBasic < amount) {
			// 사용량에서 기준 사용량 뺄셈
			amount -= yBasic;
			// 추가요금 계산
			amount *= yAdd;
			// Y사의 총 가격 계산
			yPrice += amount;
		}
		
		// 최소 금액 출력
		System.out.println(xPrice < yPrice ? xPrice : yPrice);
	}
}

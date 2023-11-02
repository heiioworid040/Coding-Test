package stage;

import java.io.*;

public class Problem_231102_1475 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String roomNum = br.readLine();
		
		// 플라스틱 숫자 배열 생성 (0번부터 8번까지)
		int[] set = new int[9];
		
		for(int i = 0; i < roomNum.length(); i++) {
			int digit = roomNum.charAt(i) - '0';
			// 6번과 9번은 뒤집어서 이용 가능
			if(digit == 9) digit = 6;
			// 개수 증가
			set[digit]++;
		}
		
		// 6번과 9번을 하나의 세트로 보기 위한 처리
		set[6] = (set[6] + 1) / 2;
		
		// 세트 개수 계산
		int max = 0;
		for(int n : set) {
			max = Math.max(max, n);
		}
		
		// 출력
		System.out.println(max);
	}
}

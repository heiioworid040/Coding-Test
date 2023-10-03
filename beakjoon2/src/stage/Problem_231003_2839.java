package stage;

import java.io.*;

public class Problem_231003_2839 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		// 배달해야 하는 설탕 봉지의 개수
		int n = Integer.parseInt(br.readLine());
		
		// 배달하는 봉지의 최소 개수
		int count = 0;
		
		while(n != 0) {
			// 정확하게 n킬로그램을 만들 수 없다면 -1 출력
			if(n < 3) {
				count = -1;
				break;
			}
			
			// 5로 나누어지는 수라면
			if(n % 5 == 0) {
				// 5 감소
				n -= 5;
				// 봉지 개수 증가
				count++;
				
			// 아니라면
			}else {
				// 3 감소
				n -= 3;
				// 봉지 개수 증가
				count++;
			}
		}
		
		// 출력
		System.out.println(count);
	}
}

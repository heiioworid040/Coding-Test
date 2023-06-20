package stage9;

import java.io.*;

public class Problem_2581_230620 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		int n = Integer.parseInt(br.readLine());
		int m = Integer.parseInt(br.readLine());
		
		int sum = 0;
		int min = 0;
		
		for(int i = n; i <= m; i++) {
			//소수 체크
			int prime=0;
			for(int j = 1; j <= m; j++) {
				if(i%j==0) {
					prime++;
				}
			}
			
			//소수 개수 카운트
			if(prime==2) {
				//최솟값 저장
				if(sum == 0) {
					min = i;
				}
				sum += i;
			}
		}
		
		//출력
		if(min == 0) {
			sb.append(-1);
		}else {
			sb.append(sum + "\n" + min);
		}
		System.out.println(sb);
		
		/* TODO 코드 수정하기 (속도) */
	}
}
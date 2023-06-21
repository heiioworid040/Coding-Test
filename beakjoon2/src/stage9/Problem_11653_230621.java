package stage9;

import java.io.*;

public class Problem_11653_230621 {
	public static void main(String[] args) throws IOException {
		/**
		 * 정수 N이 주어졌을 때, 소인수분해하는 프로그램을 작성하시오.
		 * 첫째 줄에 정수 N (1 ≤ N ≤ 10,000,000)이 주어진다.
		 * N의 소인수분해 결과를 한 줄에 하나씩 오름차순으로 출력한다. N이 1인 경우 아무것도 출력하지 않는다.
		 * */
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		StringBuilder sb = new StringBuilder();
		
		//N이 1인 경우 아무것도 출력하지 않으니 i는 2부터 시작해서 n까지
		for(int i = 2; i <= n; i++) {
			//소수라면 반복
			while(n % i == 0) {
				n /= i;
				sb.append(i+"\n");
			}
		}
		System.out.print(sb);
	}
}
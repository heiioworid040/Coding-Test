package stage;

import java.io.*;
import java.util.*;

public class Problem_231019_10156 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		// 과자 한 개의 가격
		int k = Integer.parseInt(st.nextToken());
		// 구매할 과자의 개수
		k *= Integer.parseInt(st.nextToken());
		// 현재 가진 돈
		k -= Integer.parseInt(st.nextToken());
		
		// 돈이 모자르다면 받아야 하는 돈을, 아니라면 0을 출력
		System.out.println(k > 0 ? Math.abs(k) : 0);
	}
}

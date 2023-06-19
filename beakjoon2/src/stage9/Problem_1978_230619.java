package stage9;

import java.io.*;
import java.util.*;

public class Problem_1978_230619 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		StringTokenizer st = new StringTokenizer(br.readLine());
		int count = 0;
		
		for(int i = 0; i < n; i++) {
			int m = Integer.parseInt(st.nextToken());
			
			//소수 체크
			int prime=0;
			for(int j = 1; j <= m; j++) {
				if(m%j==0) {
					prime++;
				}
			}
			//소수 개수 카운트
			if(prime==2) {
				count++;
			}
		}
		System.out.println(count);
	}
}
package stage;

import java.io.*;
import java.util.*;

public class Problem_231128_10821 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine(), ",");
		
		int count = 0;
		while(st.hasMoreTokens()) {
			String num = st.nextToken();
			count++;
		}
		
		// 간단하게 st의 토큰 수(st.countTokens())를 출력해도 됨
		System.out.println(count);
	}
}

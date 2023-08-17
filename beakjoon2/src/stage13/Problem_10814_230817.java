package stage13;

import java.io.*;
import java.util.*;

public class Problem_10814_230817 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		StringTokenizer st;
		
		int n = Integer.parseInt(br.readLine());
		
		String[][] list = new String[n][2];
		for(int i = 0; i < list.length; i++) {
			st = new StringTokenizer(br.readLine());
			list[i][0] = st.nextToken();
			list[i][1] = st.nextToken();
		}
		
		Arrays.sort(list, (s1, s2) -> {
			if(s1[0] == s2[0]) {
				return Integer.compare(s1[1].length(), s2[1].length());
			}
			return Integer.parseInt(s1[0]) - Integer.parseInt(s2[0]);
		});
		
		for(int i = 0; i < list.length; i++) {
			sb.append(list[i][0]).append(" ").append(list[i][1]).append("\n");
		}
		
		System.out.println(sb);
	}
}

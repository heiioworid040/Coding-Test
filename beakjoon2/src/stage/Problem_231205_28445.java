package stage;

import java.io.*;
import java.util.*;

public class Problem_231205_28445 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		Set<String> color = new TreeSet<>();
		for(int i = 0; i < 2; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			color.add(st.nextToken());
			color.add(st.nextToken());
		}
		
		StringBuilder sb = new StringBuilder();
		for(String bodyColor : color) {
			for(String tailColor : color) {
				sb.append(bodyColor).append(" ").append(tailColor).append("\n");
			}
		}
		System.out.println(sb);
	}
}

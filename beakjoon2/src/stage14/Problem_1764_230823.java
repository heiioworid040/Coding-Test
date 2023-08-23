package stage14;

import java.io.*;
import java.util.*;

public class Problem_1764_230823 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		StringBuilder sb = new StringBuilder();
		
		int n = Integer.parseInt(st.nextToken());
		int m = Integer.parseInt(st.nextToken());
		
		Set<String> nSet = new TreeSet<>();
		Set<String> list = new TreeSet<>();
		for(int i = 0; i < n + m; i++) {
			String name = br.readLine();
			
			if(nSet.contains(name)) {
				list.add(name);
			}else {
				nSet.add(name);
			}
		}
		
		sb.append(list.size()).append("\n");
		for(String str : list) {
			sb.append(str).append("\n");
		}
		
		System.out.println(sb);
	}
}

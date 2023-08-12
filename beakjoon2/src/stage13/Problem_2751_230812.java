package stage13;

import java.io.*;
import java.util.*;

public class Problem_2751_230812 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int n = Integer.parseInt(br.readLine());
		int[] list = new int[n];
		for(int i = 0; i < n; i++) {
			list[i] = Integer.parseInt(br.readLine());
		}
		
		Arrays.sort(list);
		
		StringBuilder sb = new StringBuilder();
		for(int num : list) {
			sb.append(num).append("\n");
		}
		
		bw.write(sb.toString());
		bw.flush();
		
		br.close();
		bw.close();
	}
}
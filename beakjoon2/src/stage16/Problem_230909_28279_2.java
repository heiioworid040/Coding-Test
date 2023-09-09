package stage16;

import java.io.*;
import java.util.*;

public class Problem_230909_28279_2 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		
		int n = Integer.parseInt(br.readLine());
		int x = 0;
		
		Deque<Integer> d = new LinkedList<>();
		for(int i = 0; i < n; i++) {
			String cmd = br.readLine();
			if(String.valueOf(cmd).startsWith("1")) {
				x = Integer.parseInt(cmd.split(" ")[1]);
				d.offerFirst(x);
			}else if(cmd.startsWith("2")) {
				x = Integer.parseInt(String.valueOf(cmd).split(" ")[1]);
				d.offerLast(x);
			}else {
				int num = -1;
				if(cmd.equals("3")) {
					num = d.pollFirst();
				}else if(cmd.equals("4")) {
					num = d.pollLast();
				}else if(cmd.equals("5")) {
					num = d.size();
				}else if(cmd.equals("6")) {
					num = d.isEmpty() ? 1 : 0;
				}else if(cmd.equals("7")) {
					num = d.peekFirst();
				}else if(cmd.equals("8")) {
					num = d.peekLast();
				}
				sb.append(num).append("\n");
			}
		}
		System.out.println(sb);
	}
}

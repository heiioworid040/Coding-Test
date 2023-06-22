package stage10;

import java.io.*;
import java.util.*;

public class Probelm_1085_230622 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int x = Integer.parseInt(st.nextToken());
		int y = Integer.parseInt(st.nextToken());
		int w = Integer.parseInt(st.nextToken());
		int h = Integer.parseInt(st.nextToken());
		
		int min = Math.min(w-x, h-y);
		
		if(x < min)	min = x;
		if(y < min) min = y;

		System.out.println(min);
	}
}
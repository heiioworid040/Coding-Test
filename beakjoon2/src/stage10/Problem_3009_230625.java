package stage10;

import java.io.*;
import java.util.*;

public class Problem_3009_230625 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		int[] x = new int[3];
		int[] y = new int[3];
		
		for(int i = 0; i < 3; i++) {
			st = new StringTokenizer(br.readLine());
			x[i] = Integer.parseInt(st.nextToken());
			y[i] = Integer.parseInt(st.nextToken());
		}
		
		int resultX = (x[0] == x[1]) ? x[2] : (x[0] == x[2]) ? x[1] : x[0];
		int resultY = (y[0] == y[1]) ? y[2] : (y[0] == y[2]) ? y[1] : y[0];
		
		System.out.println(resultX+" "+resultY);
	}
}
/*
BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
Map<Integer, Integer> x = new HashMap<>();  //x 좌표를 저장하는 맵
Map<Integer, Integer> y = new HashMap<>();  //y 좌표를 저장하는 맵
StringBuilder sb = new StringBuilder();
for (int i = 1; i <= 3; i++) {
	StringTokenizer st = new StringTokenizer(br.readLine());
	int a = Integer.parseInt(st.nextToken());
	int b = Integer.parseInt(st.nextToken());
	x.put(a, x.getOrDefault(a, 0) + 1);
	y.put(b, y.getOrDefault(b, 0) + 1);
}
// x 맵에 한 번만 나온 x 좌표를 출력
for (int i : x.keySet()) {
	if (x.get(i) == 1) sb.append(i + " ");
}
//y 맵에 한 번만 나온 y 좌표를 출력
for (int i : y.keySet()) {
	if (y.get(i) == 1) sb.append(i);
}
System.out.print(sb);
*/
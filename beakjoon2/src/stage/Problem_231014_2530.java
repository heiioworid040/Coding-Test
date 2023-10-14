package stage;

import java.io.*;
import java.time.LocalTime;
import java.util.*;

public class Problem_231014_2530 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		// 현재 시각을 시분초 배열로
		int[] time = new int[3];
		
		// 현재 시각 입력 받기
		for(int i = 0; i < time.length; i++) {
			time[i] = Integer.parseInt(st.nextToken());
		}
		
		// 시간 조절
		LocalTime l = LocalTime.of(time[0], time[1], time[2]);
		
		// 입력받은 시간을 더함
		l = l.plusSeconds(Integer.parseInt(br.readLine()));
		
		// 출력
		System.out.println(l.getHour() + " " + l.getMinute() + " " + (l.getSecond() == 0 ? 0 : l.getSecond()));
	}
}

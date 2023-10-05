package stage;

import java.io.*;
import java.util.*;

public class Problem_231005_1924 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int month = Integer.parseInt(st.nextToken()) - 1;
		int day = Integer.parseInt(st.nextToken());
		
		// 2007년 month월 day일
		Date date = new Date(107, month, day);
		
		// 요일을 대문자로 출력
		System.out.println(date.toString().substring(0, 3).toUpperCase());
	}
}

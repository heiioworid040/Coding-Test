package stage;

import java.io.*;
import java.time.*;
import java.time.format.*;

public class Problem_231108_13223_풀이1 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		// 시간 형식
		DateTimeFormatter format = DateTimeFormatter.ofPattern("HH:mm:ss");
		
		// 현재 시각
		LocalTime nowTime = LocalTime.parse(br.readLine(), format);
		// 소금 투하 시각
		LocalTime saltTime = LocalTime.parse(br.readLine(), format);
		
		// 소금 투하 시각 - 현재 시각
		LocalTime resultTime = saltTime.minusHours(nowTime.getHour())
								.minusMinutes(nowTime.getMinute())
								.minusSeconds(nowTime.getSecond());
		
		// 두 시각이 같다면
		if(resultTime.equals(LocalTime.MIDNIGHT)) {
			System.out.println("24:00:00");
		}else {
			// 결과 시간 출력
			System.out.println(resultTime.format(format));
		}
	}
}

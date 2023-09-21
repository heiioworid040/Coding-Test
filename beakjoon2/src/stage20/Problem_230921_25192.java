package stage20;

import java.io.*;
import java.util.*;

public class Problem_230921_25192 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		// 채팅을 입력한 유저의 닉네임을 담을 set
		Set<String> set = new HashSet<>();
		
		// 곰곰티콘이 사용된 횟수
		int answer = 0;
		
		// 채팅방의 기록 수
		int n = Integer.parseInt(br.readLine());
		
		for(int i = 0; i < n; i++) {
			String str = br.readLine();
			
			// 새로운 사람이 입장하면 set 리셋
			if(str.equals("ENTER")) {
				set.clear();
				
			// 채팅을 입력하지 않은 사람이라면
			}else if(!set.contains(str)) {
				// 횟수 추가
				answer++;
				// set에 담기
				set.add(str);
			}
		}
		
		// 출력
		System.out.println(answer);
	}
}

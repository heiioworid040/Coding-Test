package stage21;

import java.io.*;

public class Problem_230928_25501 {
	// recursion 함수 호출 횟수
	static int cnt;
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		
		// 테스트케이스의 개수
		int t = Integer.parseInt(br.readLine());
		
		for(int i = 0; i < t; i++) {
			// 함수 호출 횟수를 저장할 변수 초기화
			cnt = 0;
			// 문자열 입력받기
			String s = br.readLine();
			// 팰린드롬 여부와 메서드 호출 횟수
			sb.append(isPalindrome(s)).append(" ").append(cnt).append("\n");
		}
		
		// 출력
		System.out.println(sb);
	}
	
	// 팰린드롬 판별 재귀함수
	public static int recursion(String s, int l, int r){
		// 메서드 호출 횟수 증가
		cnt++;
		// 0 >= 글자수
        if(l >= r) return 1;
        // 첫 글자 != 마지막 글자
        else if(s.charAt(l) != s.charAt(r)) return 0;
        // 반복하여 체크
        else return recursion(s, l+1, r-1);
    }
	
	// 팰린드롬 여부 확인 메서드
    public static int isPalindrome(String s){
        return recursion(s, 0, s.length()-1);
    }
}

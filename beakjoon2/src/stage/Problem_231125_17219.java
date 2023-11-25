package stage;

import java.io.*;
import java.util.*;

public class Problem_231125_17219 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int siteInfoCount = Integer.parseInt(st.nextToken());
		int findSiteCount = Integer.parseInt(st.nextToken());
		
		// 입력된 사이트 정보를 저장하는 맵
		Map<String, String> siteInfo = new HashMap<>();
		
		// 사이트 정보 입력 부분
		while(siteInfoCount-- > 0) {
			st = new StringTokenizer(br.readLine());
			String site = st.nextToken();
			String password = st.nextToken();
			siteInfo.put(site, password);
		}
		
		// 해당 사이트 주소의 비밀번호 찾기
		while(findSiteCount-- > 0) {
			String findSite = br.readLine();
			if(siteInfo.containsKey(findSite)) {
				// 출력
				System.out.println(siteInfo.get(findSite));
			}
		}
	}
}

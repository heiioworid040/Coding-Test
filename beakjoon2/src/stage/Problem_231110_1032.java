package stage;

import java.io.*;

public class Problem_231110_1032 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		// 파일 개수
		int fileCount = Integer.parseInt(br.readLine());
		
		// 파일 이름
		char[] fileName = br.readLine().toCharArray();

		for(int i = 1; i < fileCount; i++) {
			char[] fileNameCompare = br.readLine().toCharArray();

			// 파일 이름 비교
			for(int j = 0; j < fileName.length; j++) {
				if(fileName[j] != '?') {
					if(fileName[j] != fileNameCompare[j]) {
						fileName[j] = '?';
					}
				}
			}
		}

		// 출력
		System.out.println(new String(fileName));
	}
}

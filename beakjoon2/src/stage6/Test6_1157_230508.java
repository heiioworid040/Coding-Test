package stage6;

import java.io.*;

public class Test6_1157_230508 {
	public static void main(String[] args) throws IOException {
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		String word=br.readLine().toUpperCase();
		int[] count=new int[26];
		int max=0;
		char answer=0;
		
		for(int i=0;i<word.length();i++) {
			count[word.charAt(i)-'A']++;
		}
		
		for(int i=0;i<count.length;i++) {
			if(max<count[i]) {
				max=count[i];
				answer=(char)(i+'A');
			}else if(max==count[i]) {
				answer='?';
			}
		}
		System.out.println(answer);
		br.close();
	}
}
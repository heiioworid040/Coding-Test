package stage6;

import java.io.*;

public class Test5_10988_230503 {
	public static void main(String[] args) throws IOException {
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		String word=br.readLine();
		int o=1;
		
		for(int i=0;i<word.length()/2;i++) {
			if(word.charAt(i)!=word.charAt(word.length()-1-i)) {
				o=0;
			}
		}

		System.out.println(o);
		
		br.close();
	}
}
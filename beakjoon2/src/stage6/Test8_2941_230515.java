package stage6;

import java.io.*;

public class Test8_2941_230515 {
	public static void main(String[] args) throws IOException {
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		String list[]= {"c=","c-", "dz=", "d-", "lj", "nj", "s=", "z="};
		
		String word=br.readLine();
		
		for(int i=0;i<list.length;i++) {
			if(word.contains(list[i])) {
				word=word.replace(list[i], "_");
			}
			System.out.println(word);
		}
		System.out.println(word.length());
		br.close();
	}
}
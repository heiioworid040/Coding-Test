package stage5;

import java.io.*;

public class Test10_5622_20230425 {

	public static void main(String[] args) throws IOException {
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		String word=br.readLine();
		int[] c=new int[word.length()];
		int time=0;
		
		for(int i=0;i<c.length;i++) {
			c[i]=word.charAt(i);
			if(c[i]<'D') {
				time+=3;
			}else if(c[i]<'G') {
				time+=4;
			}else if(c[i]<'J') {
				time+=5;
			}else if(c[i]<'M') {
				time+=6;
			}else if(c[i]<'P') {
				time+=7;
			}else if(c[i]<'T') {
				time+=8;
			}else if(c[i]<'W') {
				time+=9;
			}else {
				time+=10;
			}
		}
		
		System.out.println(time);
	}
}
//BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
//char[] word=br.readLine().toCharArray();
//String[] alp=new String[] {"ABC", "DEF", "GHI", "JKL", "MNO", "PQRS", "TUV", "WXYZ"};
//int time=0;
//
//for(int i=0;i<word.length;i++) {
//	for(int j=0;j<alp.length;j++) {
//		if(alp[j].indexOf(word[i])!=-1) {
//			time+=(j+3);
//		}
//	}
//}
//System.out.println(time);
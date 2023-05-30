package stage8;

import java.io.*;
import java.util.*;

public class Problem_11005_230530 {
	public static void main(String[] args) throws IOException {
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st=new StringTokenizer(br.readLine());
		
		int N=Integer.parseInt(st.nextToken());      			//주어진 수 N
		int B=Integer.parseInt(st.nextToken());  			    //B진법
		
		String result=Integer.toString(N, B).toUpperCase();		//계산
		
		System.out.println(result);							    //결과 출력
		br.close();
	}
}
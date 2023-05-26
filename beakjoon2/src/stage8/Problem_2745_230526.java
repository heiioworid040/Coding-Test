package stage8;

import java.io.*;
import java.util.*;

public class Problem_2745_230526 {
	public static void main(String[] args) throws IOException {
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st=new StringTokenizer(br.readLine());
		
		String brN=st.nextToken();                     //주어진 수 N
		int brB=Integer.parseInt(st.nextToken());      //B진법
		
		int result=0;                                  //출력 값 저장할 변수

		for(int i=0;i<brN.length();i++) {
			char ch=brN.charAt(i);
			int digit;
			
			if(ch>='A') {                              //알파벳이라면
				digit=ch-55;                           //ch-'A'+10
			}else {
				digit=ch-'0';                          //아니라면 그대로 저장
			}
			result=result*brB+digit;                   //10진법 변환
		}
		
		System.out.println(result);                    //결과 출력
		br.close();
	}
}
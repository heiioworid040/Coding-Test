package stage7;

import java.io.*;

public class Problem_10798_230523 {
	public static void main(String[] args) throws IOException {
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		char[][] ch=new char[15][5];                      //칠판에 붙은 글자 배열
		
		for(int i=0;i<5;i++) {                            //for문 5줄만큼 돌리기
			String st=br.readLine();                      //한줄에 입력받은 글자들
			for(int j=0;j<st.length();j++) {              //for문 글자 크기만큼 돌리기
				ch[j][i]=st.charAt(j);                    //배열에 글자 넣기
			}
		}
		
		for(int j=0;j<15;j++) {
			for(int i=0;i<5;i++) {
				if(ch[j][i]!=0) {                         //공백 제외
					System.out.print(ch[j][i]);           //출력
				}
			}
		}
		br.close();
	}
}
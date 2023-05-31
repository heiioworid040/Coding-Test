package stage8;

import java.io.*;

public class Problem_2903_230601 {
	public static void main(String[] args) throws IOException {
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		int n=Integer.parseInt(br.readLine());    //주어진 수 N
		int m=2;                                  //초기 상태 점 4개 (2*2)
		
		for(int i=0;i<n;i++) {
			m=m*2-1;                              //규칙 앞 숫자*2-1
		}
		
		System.out.println(m*m);                  //점 개수 계산
        br.close();
	}
}

//0 2*2
//1 3*3 (앞 숫자*2-1)
//2 5*5
//3 9*9
//4 17*17
//5 33*33
//6 65*65
//7 129*129
//8 257*257
package stage7;

import java.io.*;
import java.util.*;

public class Problem_2738_230521 {
	public static void main(String[] args) throws IOException {
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw=new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer st=new StringTokenizer(br.readLine());
		
		int n=Integer.parseInt(st.nextToken());                      //행의 개수 n
		int m=Integer.parseInt(st.nextToken());                      //열의 개수 m
		int[][] sum=new int[n][m];                                   //행렬 A와 B를 더한 행렬
		
		for(int k=0;k<2;k++) {                                       //두 행렬 A와 B를 더하기 위해 for문 2번 돌리기
			for(int i=0;i<n;i++) {
				st=new StringTokenizer(br.readLine());
				for(int j=0;j<m;j++) {
					sum[i][j]+=Integer.parseInt(st.nextToken());     //누적 값 더하기
				}
			}
		}

		for(int i=0;i<n;i++) {
			for(int j=0;j<m;j++) {
				bw.write(sum[i][j]+" ");							 //sum 출력
			}
			bw.write("\n");                                          //줄 바꿈
		}
		br.close();
		bw.flush();
		bw.close();
	}
}

//BufferedReader와 BufferedWriter를 생성하여 입출력에 사용한다.

//StringTokenizer를 사용해 n과 m을 입력받는다.

//n행 m열 크기의 int형 이차원 배열(sum)을 생성한다.

//이중 for문을 사용하여 2번 반복하며 다음을 수행한다.

//이차원 배열의 각 요소에 입력받은 숫자를 누적하여 더한다.

//이차원 배열의 결과를 출력합니다.

//BufferedReader와 BufferedWriter를 닫는다.
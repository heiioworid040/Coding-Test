package stage7;

import java.io.*;
import java.util.*;

public class Problem_2566_230522 {
	public static void main(String[] args) throws IOException {
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw=new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer st;
		
		int[][] list=new int[9][9];                                                   //9*9 2차원 배열
		int[] max=new int[3];                                                         //최댓값과 행렬의 위치를 담을 배열
		
		for(int i=0;i<9;i++) {
			st=new StringTokenizer(br.readLine());
			for(int j=0;j<9;j++) {
				list[i][j]=Integer.parseInt(st.nextToken());                          //배열에 값 담기
				if(list[i][j]>max[0]) {                                               //최댓값보다 값이 크다면
					max[0]=list[i][j];                                                //최댓값
					max[1]=i;                                                         //행의 위치
					max[2]=j;                                                         //열의 위치
				}
			}
		}
		bw.write(max[0]+"\n"+(max[1]+1)+" "+(max[2]+1));                              //출력
		bw.flush();
		br.close();
		bw.close();
	}
}
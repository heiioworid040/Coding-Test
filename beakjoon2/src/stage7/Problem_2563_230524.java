package stage7;

import java.io.*;
import java.util.*;

public class Problem_2563_230524 {
	public static void main(String[] args) throws IOException {
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		int n=Integer.parseInt(br.readLine());        //색종이 개수
		int[][] white=new int[100][100];              //흰색 도화지
		int result=0;                                 //결과값
		
		for(int i=0;i<n;i++) {
			st=new StringTokenizer(br.readLine());
			int x=Integer.parseInt(st.nextToken());   //왼쪽 변 사이의 거리
			int y=Integer.parseInt(st.nextToken());   //아래쪽 변 사이의 거리
			for(int j=x;j<x+10;j++) {                 //검은색 도화지만큼 표시 (x값)
				for(int k=y;k<y+10;k++) {             //검은색 도화지만큼 표시 (y값)
					if(white[j][k]==0) {              //이미 표시된 경우 제외
					white[j][k]=1;                    //표시
					result++;                         //결과값 1씩 증가
					}
				}
			}
		}
		System.out.println(result);                   //넓이 출력
		br.close();
	}
}
//검은색 도화지의 계산해서 구하지 않고
//흰색 도화지에 검은색 도화지만큼 표시해서 결과값 출력
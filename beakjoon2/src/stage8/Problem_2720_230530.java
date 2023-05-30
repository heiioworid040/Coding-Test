package stage8;

import java.io.*;

public class Problem_2720_230530 {
	public static void main(String[] args) throws IOException {
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb=new StringBuilder();
		
		int t=Integer.parseInt(br.readLine());       //테스트 케이스 개수 T
		int[] list={25, 10, 5, 1};                   //쿼터 다임 니켈 페니
		
		for(int i=0;i<t;i++) {                       //T만큼 for문 돌리기
			int c=Integer.parseInt(br.readLine());   //거스름돈 C
			for(int j=0;j<list.length;j++) {         //for문 돌려 큰 동전부터 계산
				sb.append(c/list[j]+" ");            //거스름돈/동전
				c=c%list[j];                         //C에 나머지값 저장
			}
			sb.append("\n");
		}
		System.out.println(sb);                      //출력
		br.close();
	}
}
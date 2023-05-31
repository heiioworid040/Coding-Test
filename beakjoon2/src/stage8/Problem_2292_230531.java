package stage8;

import java.io.*;

public class Problem_2292_230531 {
	public static void main(String[] args) throws IOException {
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		int n=Integer.parseInt(br.readLine());  //주어진 숫자 N
		
		int count=1;                            //지나가는 방 개수
		int range=1;                            //n과의 비교 값 (방의 범위)
		int step=6;                             //방의 개수 (6씩 증가)
		
		while(n>range) {
			count++;                            //방 개수 1 증가
			range+=step;                        //방의 개수만큼 증가
			step+=6;                            //방의 개수 증가
		}
		System.out.println(count);              //출력
		br.close();
	}
}
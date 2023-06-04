package stage8;

import java.io.*;
import java.util.*;

public class Problem_2869_230604 {
	public static void main(String[] args) throws IOException {
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st=new StringTokenizer(br.readLine());
		int a=Integer.parseInt(st.nextToken());   //낮에 올라가는 높이
		int b=Integer.parseInt(st.nextToken());   //밤에 내려오는 높이
		int v=Integer.parseInt(st.nextToken());   //올라가야 할 높이

		int day=(v-b-1)/(a-b)+1;                  //아래 해설
		System.out.println(day);                  //출력
		br.close();
	}
}

// (올라가야 할 높이)/(올라가는 높이)=(걸리는 일수)
// (마지막 날을 제외한 높이)/(하루에 올라가는 높이)+1=(걸리는 일수)
// (마지막 날을 제외한 높이)=((전체 높이)-(내려오는 높이)-(하루에 올라가는 높이))
// (하루에 올라가는 높이)=((낮에 올라가는 높이)-(밤에 내려오는 높이))
// +1의 이유 : 마지막 날도 올라가기 때문에 포함해야 하기 때문
package stage5;

import java.io.*;
import java.util.*;

public class Test7_20230421 {
	public static void main(String[] args) throws IOException {
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb=new StringBuilder();
		int t=Integer.parseInt(br.readLine());
		
		for(int i=0;i<t;i++) {
			StringTokenizer st=new StringTokenizer(br.readLine()," ");
			int r=Integer.parseInt(st.nextToken());
			String s=st.nextToken();
			
			for(int j=0;j<s.length();j++) {
				for(int k=0;k<r;k++) {
					sb.append(s.charAt(j));
				}
			}
			sb.append('\n');
		}
		System.out.println(sb);
		br.close();
	}
}
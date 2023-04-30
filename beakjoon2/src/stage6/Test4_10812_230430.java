package stage6;

import java.io.*;
import java.util.*;

public class Test4_10812_230430 {
	public static void main(String[] args) throws IOException {
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb=new StringBuilder();
		StringTokenizer st=new StringTokenizer(br.readLine());
		
		int n=Integer.parseInt(st.nextToken());
		int m=Integer.parseInt(st.nextToken());
		
		int[] b=new int[n+1];
		int[] b2=new int[n+1];
		for(int x=0;x<n+1;x++) {
			b[x]=x;
			b2[x]=x;
		}
		
		for(int x=0;x<m;x++) {
			st=new StringTokenizer(br.readLine());
			int i=Integer.parseInt(st.nextToken());
			int j=Integer.parseInt(st.nextToken());
			int k=Integer.parseInt(st.nextToken());
			int i2=i;
			
			for(int y=0;y<j-i+1;y++) {
				if(k+y<=j) {
					b2[y+i]=b[k+y];
				}else {
					b2[y+i]=b[i2];
					i2++;
				}
			}
			for(int y=1;y<=n;y++) {
				b[y]=b2[y];
			}
		}
		
		for(int x=1;x<=n;x++) {
			sb.append(b[x]+" ");
		}
		System.out.println(sb);
		br.close();
	}
}
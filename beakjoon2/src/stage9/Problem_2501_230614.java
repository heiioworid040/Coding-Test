package stage9;

import java.io.*;
import java.util.*;

public class Problem_2501_230614 {
	public static void main(String[] args) throws IOException {
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st=new StringTokenizer(br.readLine());
		int n=Integer.valueOf(st.nextToken());
		int k=Integer.valueOf(st.nextToken());
		int count=0;
		int result=0;
		
		for(int i=n;i>0;i--) {
			if(n%i==0) {
				count++;
				if(count==k) {
					result=n/i;
					break;
				}
			}
		}
		System.out.println(result);
	}
}
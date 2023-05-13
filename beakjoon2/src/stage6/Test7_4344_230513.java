package stage6;

import java.io.*;
import java.util.*;

public class Test7_4344_230513 {
	public static void main(String[]args) throws IOException {
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st=null;
		int c=Integer.parseInt(br.readLine());
		int n=0;
		
		for(int i=0;i<c;i++) {
			st=new StringTokenizer(br.readLine());
			n=Integer.parseInt(st.nextToken());
			double sum=0;
			int[] scoreList=new int[n];
			
			for(int j=0;j<n;j++) {
				scoreList[j]=Integer.parseInt(st.nextToken());
				sum+=scoreList[j];
			}
			
			double avg=sum/n;
			double count=0;
			
			for(int j=0;j<n;j++) {
				if(scoreList[j]>avg) {
					count++;
				}
			}
			System.out.printf("%.3f%%\n", count/n*100);
		}
		br.close();
	}
}
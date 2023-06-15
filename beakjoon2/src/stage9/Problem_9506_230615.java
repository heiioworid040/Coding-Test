package stage9;

import java.io.*;

public class Problem_9506_230615 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		int n=0;
		
		while(true) {
        	n = Integer.valueOf(br.readLine());
            if(n==-1) break;
            
            int sum=0;
			for(int i=n;i>1;i--) {
				if(n%i==0) {
					if(i==2) {
						sb.append(n/i);
					}else {
						sb.append(n/i).append(" + ");
					}
					sum+=n/i;
				}
			}
			if(sum==n) {
				sb.insert(0, n + " = ");
				System.out.println(sb.toString());
			}else {
				System.out.println(n+" is NOT perfect.");
			}
			sb.setLength(0);
		}
	}
}
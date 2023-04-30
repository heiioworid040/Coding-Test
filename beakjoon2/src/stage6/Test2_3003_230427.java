package stage6;

import java.io.*;
import java.util.*;

public class Test2_3003_230427 {
	public static void main(String[] args) throws IOException {
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st=new StringTokenizer(br.readLine()," ");
		
		int[] chess=new int[]{1, 1, 2, 2, 2, 8};
		for(int i=0;i<chess.length;i++) {
			int dong=chess[i]-Integer.parseInt(st.nextToken());
			System.out.print(dong+" ");
		}
		br.close();
	}
}
package stage5;

import java.io.*;
import java.util.*;

public class Test9_2908_20230422 {
	public static void main(String[] args) throws IOException {
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st=new StringTokenizer(br.readLine());
		
		String a=st.nextToken();
		String b=st.nextToken();
		
		String a2 = "";
		String b2 = "";
		
		char[] aList=new char[3];
		char[] bList=new char[3];
		for(int i=0;i<aList.length;i++) {
			aList[i]=a.charAt(aList.length-(1+i));
			bList[i]=b.charAt(aList.length-(1+i));
		}
		
		for(int i=0;i<aList.length;i++) {
			a2+=""+aList[i];
			b2+=""+bList[i];
		}
		
		if(Integer.parseInt(a2)>Integer.parseInt(b2)) {
			System.out.println(a2);
		}else {
			System.out.println(b2);
		}
		br.close();
	}
}
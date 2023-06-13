package stage8;

import java.io.*;
import java.util.*;
import java.math.*;

public class Problem_10757_230613 {
	public static void main(String[] args) throws IOException {
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st=new StringTokenizer(br.readLine());
		BigInteger a=new BigInteger(st.nextToken());
		BigInteger b=new BigInteger(st.nextToken());
		System.out.println(a.add(b));
	}
}

//int (4 byte) : -2,147,483,648 ~ 2,147,483,647 (약 21억)
//long (8 byte) : -9,223,372,036,854,775,808 ~ 9,223,372,036,854,775,807 (약 992경)
//BigInteger (70 byte ~) : 무한 (Infinity)
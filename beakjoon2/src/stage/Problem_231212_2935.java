package stage;

import java.io.*;
import java.math.*;

public class Problem_231212_2935 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		// 최대 100자리의 수를 입력받는 a
		BigInteger a = new BigInteger(br.readLine());
		// 연산자
		char operator = br.readLine().charAt(0);
		// 최대 100자리의 수를 입력받는 b
		BigInteger b = new BigInteger(br.readLine());
		
		if(operator == '+') {
			System.out.println(a.add(b));
		}else if(operator == '*') {
			System.out.println(a.multiply(b));
		}
	}
}

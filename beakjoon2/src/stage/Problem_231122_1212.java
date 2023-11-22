package stage;

import java.io.*;

public class Problem_231122_1212 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		
		String octalNumber = br.readLine();
		
        for(int i = 0; i < octalNumber.length(); i++){
            int digit = octalNumber.charAt(i) - '0';
            String digitBinary = Integer.toBinaryString(digit);
            
            if(digitBinary.length() == 2 && i != 0){
                sb.append("0" + digitBinary);
            } else if(digitBinary.length() == 1 && i != 0){
                sb.append("00" + digitBinary);
            } else {
            	sb.append(digitBinary);
            }
        }
		System.out.println(sb);
	}
}

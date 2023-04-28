package stage6;

import java.io.*;

public class Test8_2444_230429 {
	public static void main(String[] args) throws IOException {
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		int n=Integer.parseInt(br.readLine());
		
        for(int i = 1; i <= n; i++) {
            for(int j = 0; j < n - i; j++) {
                System.out.print(" ");
            }
            for(int j = 0; j < 2 * i - 1; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        for(int i = n - 1; i >= 1; i--) {
            for(int j = 0; j < n - i; j++) {
                System.out.print(" ");
            }
            for(int j = 0; j < 2 * i - 1; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
	}
}
//StringBuilder sb = new StringBuilder();
//for (int i = n - 1; i >= 0; i--) {
//    for (int j = 0; j < i; j++) {
//        sb.append(" ");
//    }
//    for (int j = 0; j < n - i; j++) {
//        sb.append("*");
//    }
//    for (int j = 1; j < n - i; j++) {
//        sb.append("*");
//    }
//    sb.append("\n");
//}
//for (int i = 1; i < n; i++) {
//    for (int j = 0; j < i; j++) {
//        sb.append(" ");
//    }
//    for (int j = 0; j < n - i; j++) {
//        sb.append("*");
//    }
//    for (int j = 1; j < n - i; j++) {
//        sb.append("*");
//    }
//    sb.append("\n");
//}
//System.out.print(sb.toString());
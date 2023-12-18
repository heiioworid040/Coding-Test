import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int N = Integer.parseInt(br.readLine());
        String[] serial = new String[N];

        for(int i = 0; i < N; i++) {
            serial[i] = br.readLine();
        }

        Arrays.sort(serial, (o1, o2) -> {
            if(o1.length() != o2.length()) {
                return Integer.compare(o1.length(), o2.length());
            }else {
                int o1Sum = 0;
                int o2Sum = 0;

                for(int i = 0; i < o1.length(); i++) {
                    if(Character.isDigit(o1.charAt(i))) o1Sum += (o1.charAt(i) - '0');
                }
                for(int i = 0; i < o2.length(); i++) {
                    if(Character.isDigit(o2.charAt(i))) o2Sum += (o2.charAt(i) - '0');
                }

                if(o1Sum != o2Sum) {
                    return Integer.compare(o1Sum, o2Sum);
                }else {
                    return o1.compareTo(o2);
                }
            }
        });

        StringBuilder sb = new StringBuilder();
        for(String s : serial) {
            sb.append(s).append("\n");
        }
        bw.write(sb.toString());
        bw.close();
    }
}

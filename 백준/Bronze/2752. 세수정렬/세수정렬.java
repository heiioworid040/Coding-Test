import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int[] num = new int[3];
        for (int i = 0; i < 3; i++) {
            num[i] = Integer.parseInt(st.nextToken());
        }

        Arrays.sort(num);

        StringBuilder sb = new StringBuilder();
        for (int i : num) {
            sb.append(i).append(" ");
        }
        System.out.print(sb.toString().trim());
    }
}

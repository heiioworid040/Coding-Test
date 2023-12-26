import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder sb = new StringBuilder();

        int M = Integer.parseInt(br.readLine());
        HashMap<Integer, Integer> map = new HashMap<>();

        while (M-- > 0) {
            StringTokenizer st = new StringTokenizer(br.readLine());

            if (st.nextToken().equals("1")) {
                int x = Integer.parseInt(st.nextToken());
                int w = Integer.parseInt(st.nextToken());

                map.put(w, x);
            } else {
                int w = Integer.parseInt(st.nextToken());
                sb.append(map.get(w)).append("\n");
            }
        }
        bw.write(sb.toString().trim());
        bw.close();
    }
}

import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int t = Integer.parseInt(br.readLine());

        while (t-- > 0) {
            int n = Integer.parseInt(br.readLine());

            HashMap<String, Integer> map = new HashMap<>();
            for (int i = 0; i < n; i++) {
                StringTokenizer st = new StringTokenizer(br.readLine());
                st.nextToken();
                String kind = st.nextToken();

                map.put(kind, map.getOrDefault(kind, 1) + 1);
            }

            int result = 1;
            for (int cnt : map.values()) {
                result *= cnt;
            }
            bw.write(result - 1 + "\n");
        }
        bw.close();
    }
}

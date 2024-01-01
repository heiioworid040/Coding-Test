import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());
        int[][] times = new int[N][2];

        for (int i = 0; i < N; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            times[i][0] = Integer.parseInt(st.nextToken());
            times[i][1] = Integer.parseInt(st.nextToken());
        }

        Arrays.sort(times, (o1, o2) -> o2[1] - o1[1]);

        int result = times[0][1] - times[0][0];

        for (int i = 1; i < N; i++) {
            if (times[i][1] < result) {
                result = times[i][1];
            }
            result -= times[i][0];
        }
        System.out.println(result > 0 ? result : -1);
    }
}

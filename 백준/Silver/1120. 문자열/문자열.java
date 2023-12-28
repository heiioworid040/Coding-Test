import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        String A = st.nextToken();
        String B = st.nextToken();

        int countMin = A.length();

        for (int i = 0; i <= B.length() - A.length(); i++) {
            int count = countDiff(A, B.substring(i, i + A.length()));
            countMin = Math.min(count, countMin);
        }
        System.out.println(countMin);
    }

    public static int countDiff(String A, String B) {
        int count = 0;
        for (int i = 0; i < A.length(); i++) {
            if (A.charAt(i) != B.charAt(i)) {
                count++;
            }
        }
        return count;
    }
}

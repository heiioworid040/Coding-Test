import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());

        int minSetPrice = 1000;
        int minUnitPrice = 1000;

        int result = 0;

        while (M-- > 0) {
            st = new StringTokenizer(br.readLine());
            int setPrice = Integer.parseInt(st.nextToken());
            int unitPrice = Integer.parseInt(st.nextToken());

            minSetPrice = Math.min(setPrice, minSetPrice);
            minUnitPrice = Math.min(unitPrice, minUnitPrice);
        }

        if (minUnitPrice * 6 <= minSetPrice) {
            result = minUnitPrice * N;
        } else {
            result = (N / 6) * minSetPrice;
            if (N % 6 * minUnitPrice <= minSetPrice) {
                result += (N % 6) * minUnitPrice;
            } else {
                result += minSetPrice;
            }
        }

        System.out.println(result);
    }
}

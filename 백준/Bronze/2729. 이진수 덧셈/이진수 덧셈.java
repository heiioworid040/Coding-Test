import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int T = Integer.parseInt(br.readLine());

        while (T-- > 0) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            String a = st.nextToken();
            String b = st.nextToken();
            System.out.println(binaryPlus(a, b));
        }
    }

    public static String binaryPlus(String a, String b) {
        StringBuilder sb = new StringBuilder();
        int carry = 0;

        int maxLength = Math.max(a.length(), b.length());
        a = String.format("%" + maxLength + "s", a).replace(' ', '0');
        b = String.format("%" + maxLength + "s", b).replace(' ', '0');

        for (int i = maxLength - 1; i >= 0; i--) {
            int sum = (a.charAt(i) - '0') + (b.charAt(i) - '0') + carry;
            sb.insert(0, sum % 2);
            carry = sum / 2;
        }

        if (carry > 0) {
            sb.insert(0, carry);
        }

        while (sb.length() > 1 && sb.charAt(0) == '0') {
            sb.deleteCharAt(0);
        }

        return sb.toString();
    }
}

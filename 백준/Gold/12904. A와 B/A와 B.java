import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringBuilder S = new StringBuilder(br.readLine());
        StringBuilder T = new StringBuilder(br.readLine());

        boolean result = canTransform(S, T);
        System.out.println(result ? 1 : 0);
    }

    public static boolean canTransform(StringBuilder S, StringBuilder T) {
        while (S.length() != T.length()) {
            int lastChar = T.length() - 1;
            if(T.charAt(lastChar) == 'B') {
                T.reverse();
                lastChar = 0;
            }
            T.deleteCharAt(lastChar);
        }
        return S.toString().equals(T.toString()) ? true : false;
    }
}

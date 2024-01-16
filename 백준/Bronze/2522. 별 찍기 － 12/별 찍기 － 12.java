import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());

        StringBuilder sb = new StringBuilder();
        for (int i = 1; i <= 2 * N - 1; i++) {
            int space = Math.abs(N - i);
            int star = N - space;

            sb.append(" ".repeat(space));
            sb.append("*".repeat(star));
            sb.append("\n");
        }
        System.out.println(sb);
    }
}

import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());

        for (int i = 1; i <= N; i++) {
            int space = i - 1;
            int star = 2 * (N - i) + 1;

            printLine(space, star);
        }

        for (int i = N - 1; i >= 1; i--) {
            int space = i - 1;
            int star = 2 * (N - i) + 1;

            printLine(space, star);
        }
    }

    public static void printLine(int space, int star) {
        StringBuilder line = new StringBuilder();

        line.append(" ".repeat(space));
        line.append("*".repeat(star));
        line.append("\n");

        System.out.print(line);
    }
}

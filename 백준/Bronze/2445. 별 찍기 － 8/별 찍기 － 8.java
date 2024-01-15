import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());

        StringBuilder star = new StringBuilder();
        for (int i = 1; i < N; i++) {
            star.append(getStar(i))
                .append(getSpace(N, i))
                .append(getStar(i))
                .append("\n");
        }

        StringBuilder endStar = new StringBuilder(star);
        endStar.append("*".repeat(2 * N)).append("\n").reverse();
        System.out.print(star);
        System.out.print(endStar.toString().trim());
    }

    public static String getStar(int line) {
        return "*".repeat(line);
    }

    public static String getSpace(int num, int line) {
        return " ".repeat(2 * num - 2 * line);
    }
}

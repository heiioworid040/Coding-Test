import java.io.*;
import java.util.*;

public class Main {
    public static boolean[][] board;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());

        board = new boolean[N][M];

        for (int i = 0; i < N; i++) {
            String str = br.readLine();

            for (int j = 0; j < M; j++) {
                if (str.charAt(j) == 'W') {
                    board[i][j] = true;
                }
            }
        }

        int remainRow = N - 7;
        int remainCol = M - 7;

        int minCount = 64;

        for (int i = 0; i < remainRow; i++) {
            for (int j = 0; j < remainCol; j++) {
                minCount = Math.min(getPaintCount(i, j), minCount);
            }
        }

        System.out.println(minCount);
    }

    public static int getPaintCount(int x, int y) {
        int col = x + 8;
        int row = y + 8;

        int count = 0;
        boolean color = board[x][y];

        for (int i = x; i < col; i++) {
            for (int j = y; j < row; j++) {
                if (board[i][j] != color) {
                    count++;
                }
                color = !color;
            }
            color = !color;
        }
        return Math.min(count, 64 - count);
    }
}

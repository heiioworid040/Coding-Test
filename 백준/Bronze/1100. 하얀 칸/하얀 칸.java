import java.io.*;

public class Main {

    static int columnType = 0;  // 0: 짝수, 1: 홀수
    static int count = 0;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        for (int i = 0; i < 8; i++) {
            String board = br.readLine();
            countPiece(board);
            columnType = (columnType + 1) % 2;
        }
        System.out.println(count);
    }

    public static void countPiece(String board) {
        for (int i = columnType; i < board.length(); i += 2) {
            if (board.charAt(i) == 'F') {
                count++;
            }
        }
    }
}

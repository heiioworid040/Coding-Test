import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int T = Integer.parseInt(br.readLine());

        while (T-- > 0) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int positionToRemove = Integer.parseInt(st.nextToken());
            String inputStr = st.nextToken();
            printRemoveCharAtPosition(positionToRemove, inputStr);
        }
    }

    public static void printRemoveCharAtPosition(int positionToRemove, String inputStr) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < inputStr.length(); i++) {
            if (i != positionToRemove - 1) {
                sb.append(inputStr.charAt(i));
            }
        }
        System.out.println(sb.toString());
    }
}

import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int X = Integer.parseInt(new StringBuilder(st.nextToken()).reverse().toString());
        int Y = Integer.parseInt(new StringBuilder(st.nextToken()).reverse().toString());

        int result = Integer.parseInt(new StringBuilder(String.valueOf(X + Y)).reverse().toString());

        System.out.println(result);
    }
}

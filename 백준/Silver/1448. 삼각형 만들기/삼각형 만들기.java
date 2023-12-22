import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        Integer[] straws = new Integer[n];

        for (int i = 0; i < n; i++) {
            straws[i] = Integer.parseInt(br.readLine());
        }

        Arrays.sort(straws, (a, b) -> b - a);
        int max = 0;

        for (int i = 0; i < n - 2; i++) {
            if (straws[i] < straws[i + 1] + straws[i + 2]) {
                max = Math.max(max, straws[i] + straws[i + 1] + straws[i + 2]);
            }
        }
        
        if(max == 0) max = -1;
        System.out.println(max);
    }
}

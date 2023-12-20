import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken());
        int L = Integer.parseInt(st.nextToken());
        int[] leakPositions = new int[N];

        st = new StringTokenizer(br.readLine());
        for(int i = 0; i < N; i++) {
            leakPositions[i] = Integer.parseInt(st.nextToken());
        }
        Arrays.sort(leakPositions);

        int tapeMinCount = 0;
        int sealPosition = 0;

        for(int i = 0; i < N; i++) {
            int leakPosition = leakPositions[i];
            if(leakPosition > sealPosition) {
                sealPosition = leakPosition + L - 1;
                tapeMinCount++;
            }
        }
        System.out.println(tapeMinCount);
    }
}

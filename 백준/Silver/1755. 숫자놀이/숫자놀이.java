import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        String[] alphabet = {"zero", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine"};
        int M = Integer.parseInt(st.nextToken());
        int N = Integer.parseInt(st.nextToken());
        int count = 0;

        String[] numbersStr = new String[N - M + 1];
        int[] numbersInt = new int[N - M + 1];
        HashMap<String, Integer> map = new HashMap<>();

        for(int i = 0; i < 10; i++) {
            map.put(alphabet[i], i);
        }

        for(int i = M; i <= N; i++) {
            if(i < 10) {
                numbersStr[count++] = alphabet[i];
            }else {
                numbersStr[count++] = alphabet[i / 10] + " " + alphabet[i % 10];
            }
        }
        Arrays.sort(numbersStr);

        for(int i = 0; i < count; i++) {
            st = new StringTokenizer(numbersStr[i]);
            numbersInt[i] = map.get(st.nextToken());
            if(st.hasMoreTokens()) {
                numbersInt[i] = numbersInt[i] * 10 + map.get(st.nextToken());
            }
        }

        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        for(int i = 0; i < count; i++) {
            bw.write(numbersInt[i] + " ");
            if(i % 10 == 9)
                bw.write("\n");

        }
        bw.close();
        br.close();
    }
}

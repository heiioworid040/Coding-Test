import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());

        long result = findSum(N);
        
        System.out.println(result);
    }

    public static long findSum(int N) {
        long sum = 0;

        for (long i = 1; i < N; i++) {
            sum += (N + 1) * i;
        }

        return sum;
    }
}

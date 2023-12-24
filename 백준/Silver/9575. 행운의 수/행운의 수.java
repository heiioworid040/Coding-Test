import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int T = Integer.parseInt(br.readLine());

        while (T-- > 0) {
            int[] A = readArray(br);
            int[] B = readArray(br);
            int[] C = readArray(br);
            int countLuckeyNum = countLuckyNumbers(A, B, C);
            bw.write(countLuckeyNum + "\n");
        }
        bw.close();
    }

    public static int[] readArray(BufferedReader br) throws IOException {
        int length = Integer.parseInt(br.readLine());
        int[] nums = new int[length];

        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int i = 0; i < length; i++) {
            nums[i] = Integer.parseInt(st.nextToken());
        }
        return nums;
    }

    public static int countLuckyNumbers(int[] A, int[] B, int[] C) {
        Set<Integer> luckyNumbers = new HashSet<>();

        for (int a : A) {
            for (int b : B) {
                for (int c : C) {
                    int sum = a + b + c;
                    if (isLucky(sum)) {
                        luckyNumbers.add(sum);
                    }
                }
            }
        }
        return luckyNumbers.size();
    }

    public static boolean isLucky(int num) {
        while (num > 0) {
            int digit = num % 10;
            if (digit != 5 && digit != 8) {
                return false;
            }
            num /= 10;
        }
        return true;
    }
}

import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int X = Integer.parseInt(br.readLine());
        int count = countOnes(Integer.toBinaryString(X));

        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        bw.write(String.valueOf(count));
        bw.close();
        br.close();
    }

    public static int countOnes(String binary) {
        int count = 0;
        for(char c : binary.toCharArray()) {
            if(c == '1') count++;
        }
        return count;
    }
}

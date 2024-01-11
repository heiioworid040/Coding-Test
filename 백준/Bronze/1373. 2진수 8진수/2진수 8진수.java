import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String binary = br.readLine();
        System.out.println(getBinaryChangeOctal(binary));
    }

    public static String getBinaryChangeOctal(String binary) {
        StringBuilder octalResult = new StringBuilder();
        int binaryLength = binary.length();

        for (int i = binaryLength - 1; i >= 0; i -= 3) {
            int decimal = 0;
            int powerOfTwo = 1;
            for (int j = 0; j < 3 && i - j >= 0; j++) {
                decimal += (binary.charAt(i - j) - '0') * powerOfTwo;
                powerOfTwo *= 2;
            }
            octalResult.insert(0, decimal);
        }

        while (octalResult.length() > 1 && octalResult.charAt(0) == '0') {
            octalResult.deleteCharAt(0);
        }

        return octalResult.toString();
    }
}

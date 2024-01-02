import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String S = br.readLine();
        int zeroGroups = countGroups(S, '0');
        int oneGroups = countGroups(S, '1');

        System.out.println(Math.min(zeroGroups, oneGroups));
    }

    public static int countGroups(String S, char target) {
        String[] splits = S.split(target+"");
        int count = 0;

        for (String split : splits) {
            if (!split.isEmpty()) {
                count++;
            }
        }
        return count;
    }
}

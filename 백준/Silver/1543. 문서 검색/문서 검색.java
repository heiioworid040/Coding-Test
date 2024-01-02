import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String content = br.readLine();
        String target = br.readLine();

        int count = countExist(content, target);
        System.out.println(count);
    }

    public static int countExist(String content, String target) {
        int index = content.indexOf(target);
        int count = 0;

        while (index != -1) {
            count++;
            content = content.substring(index + target.length());
            index = content.indexOf(target);
        }
        return count;
    }
}

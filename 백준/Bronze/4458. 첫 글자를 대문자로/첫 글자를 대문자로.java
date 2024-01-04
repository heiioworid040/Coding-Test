import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        int N = Integer.parseInt(br.readLine());

        StringBuilder sb = new StringBuilder();
        while (N-- > 0) {
            String sentence = br.readLine();

            sb.append(Character.toUpperCase(sentence.charAt(0)))
              .append(sentence.substring(1))
              .append("\n");
        }
        System.out.println(sb.toString().trim());
    }
}

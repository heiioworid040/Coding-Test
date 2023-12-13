import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int N = Integer.parseInt(br.readLine());
        PriorityQueue<Integer> queue = new PriorityQueue<>();

        StringBuilder sb = new StringBuilder();
        while(N-- > 0) {
            int x = Integer.parseInt(br.readLine());

            if(x == 0) {
                if(queue.isEmpty()) {
                    sb.append("0\n");
                }else {
                    sb.append(queue.poll()).append("\n");
                }
            }else {
                queue.offer(x);
            }
        }
        
        bw.write(sb.toString().trim());
        bw.flush();
        bw.close();
        br.close();
    }
}

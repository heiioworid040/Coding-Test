import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());

        String[] studentIDs = new String[N];
        for (int i = 0; i < N; i++) {
            studentIDs[i] = br.readLine();
        }

        int k = getMinLength(studentIDs);
        System.out.println(k);
    }

    public static int getMinLength(String[] studentNums) {
        for(int i = studentNums[0].length() - 1; i >= 0; i--) {
            HashMap<String, Integer> map = new HashMap<>();

            for (String s : studentNums) {
                String id = s.substring(i);
                if(map.getOrDefault(id, 0) > 0) break;
                map.put(id, 1);
                if(map.size() == studentNums.length) return id.length();
            }
        }
        return 0;
    }
}

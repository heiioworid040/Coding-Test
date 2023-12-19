import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int T = Integer.parseInt(br.readLine());

        while(T-- > 0) {
            String chromosome = br.readLine();
            if(chromosome.matches("^[A-F]?A+F+C+[A-F]?$")) {
                bw.write("Infected!\n");
            }else {
                bw.write("Good\n");
            }
        }
        
        bw.close();
    }
}

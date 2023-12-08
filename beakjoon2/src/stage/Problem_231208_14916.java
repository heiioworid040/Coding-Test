package stage;

import java.io.*;

public class Problem_231208_14916 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		// 거슬러 줄 동전 2원
		final int COIN_2 = 2;
		// 거슬러 줄 동전 5원
		final int COIN_5 = 5;
		
		// 거스름돈
		int change = Integer.parseInt(br.readLine());
		// 최소 동전 개수
		int countMin = 0;
		
		while(change > 0) {
			// 5원으로 나누어 떨어진다면
            if (change % COIN_5 == 0) {
                countMin += change / COIN_5;
                break;
              
            // 2원으로 나누어 떨어진다면
            } else {
                change -= COIN_2;
                countMin++;
                // 거슬러 줄 수 없으면
                if (change < 0) {
                    System.out.println(-1);
                    return;
                }
            }
		}
		System.out.println(countMin);
	}
}

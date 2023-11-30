package stage;

import java.io.*;
import java.util.*;

public class Problem_231130_1712 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		// 고정 비용
		int fixedCost = Integer.parseInt(st.nextToken());
		// 가변 비용
		int variableCost = Integer.parseInt(st.nextToken());
		// 노트북 책정 가격
		int sellingPrice = Integer.parseInt(st.nextToken());
		
		// 순익분기점이 존재하지 않으면 -1 출력
		if(variableCost >= sellingPrice) {
			System.out.println(-1);
		}else {
			int breakEvenPoint = fixedCost / (sellingPrice - variableCost) + 1;
			System.out.println(breakEvenPoint);
		}
	}
}

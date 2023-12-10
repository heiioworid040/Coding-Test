package stage;

import java.io.*;
import java.util.*;

public class Problem_231210_11728 {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		// 배열 a의 크기
		int aLength = Integer.parseInt(st.nextToken());
		// 배열 b의 크기
		int bLength = Integer.parseInt(st.nextToken());
		
		// 배열 a 생성
		int[] a = new int[aLength];
		// 배열 b 생성
		int[] b = new int[bLength];

		// a 데이터 입력
		st = new StringTokenizer(br.readLine());
		for(int i = 0; i < aLength; i++) {
			a[i] = Integer.parseInt(st.nextToken());
		}

		// b 데이터 입력
		st = new StringTokenizer(br.readLine());
		for(int i = 0; i < bLength; i++) {
			b[i] = Integer.parseInt(st.nextToken());
		}
		
		// 결과 배열
        int[] result = mergeAndSort(a, b);
        
        // 출력
        StringBuilder sb = new StringBuilder();
        for(int n : result) {
        	sb.append(n).append(" ");
        }
        System.out.println(sb);
		
	}
	
	// 두 배열을 합치고 오름차순 정렬하는 메서드
    public static int[] mergeAndSort(int[] a, int[] b) {
        int lenA = a.length;
        int lenB = b.length;
        int lenResult = lenA + lenB;

        int[] result = new int[lenResult];

        System.arraycopy(a, 0, result, 0, lenA);
        System.arraycopy(b, 0, result, lenA, lenB);
        Arrays.sort(result);

        return result;
    }
}

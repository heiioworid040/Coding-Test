package stage;

import java.io.*;

public class Problem_231123_7567 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		final int SAME_PLATE_HEIGHT = 5;
		final int DIFFERENT_PLATE_HEIGHT = 10;
		
		char[] plate = br.readLine().toCharArray();
		int height = DIFFERENT_PLATE_HEIGHT;
		
		for(int i = 1; i < plate.length; i++) {
			char current = plate[i];
			char previous = plate[i - 1];
			
			height += (current == previous) ? SAME_PLATE_HEIGHT : DIFFERENT_PLATE_HEIGHT;
		}
		
		System.out.println(height);
	}
}

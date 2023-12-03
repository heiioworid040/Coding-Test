package stage;

import java.io.*;
import java.util.*;

public class Problem_231203_10825 {
	public static class Student {
		String name;
		int korean;
		int english;
		int math;
		
		public Student(String name, int korean, int english, int math) {
			this.name = name;
			this.korean = korean;
			this.english = english;
			this.math = math;
		}
	}
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int studentCount = Integer.parseInt(br.readLine());
		Student[] students = new Student[studentCount];
		
		for(int i = 0; i < studentCount; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			String name = st.nextToken();
			int korean = Integer.parseInt(st.nextToken());
			int english = Integer.parseInt(st.nextToken());
			int math = Integer.parseInt(st.nextToken());
			
			students[i] = new Student(name, korean, english, math);
		}
		
        Arrays.sort(students, (o1, o2) -> {
    		if(o1.korean == o2.korean) {
    			if(o1.english == o2.english) {
    				if(o1.math == o2.math) {
    					// 이름 사전 순
    					return o1.name.compareTo(o2.name);
    				}
    				// 수학 점수 내림차순
    				return o2.math - o1.math;
    			}
    			// 영어 점수 오름차순
    			return o1.english - o2.english;
    		}
    		// 국어 점수 내림차순
    		return o2.korean - o1.korean;
        });
        
		StringBuilder sb = new StringBuilder();
		for(Student student : students) {
			sb.append(student.name).append("\n");
		}
		System.out.print(sb);
	}
}

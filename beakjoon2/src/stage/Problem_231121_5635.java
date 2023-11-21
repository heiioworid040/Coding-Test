package stage;

import java.io.*;
import java.util.*;

class Student {
	String name;
	int year, month, day;
	
	public Student(String name, int year, int month, int day) {
		this.name = name;
		this.year = year;
		this.month = month;
		this.day = day;
	}
	
	public int getBirthDate() {
		return year * 10000 + month * 100 + day;
	}
}
	
public class Problem_231121_5635 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int studentNum = Integer.parseInt(br.readLine());
		Student[] students = new Student[studentNum];
		
		for(int i = 0; i < studentNum; i++) {
			String[] info = br.readLine().split(" ");
			String name = info[0];
			int year = Integer.parseInt(info[3]);
			int month = Integer.parseInt(info[2]);
			int day = Integer.parseInt(info[1]);
			
			students[i] = new Student(name, year, month, day);
		}
		
		Arrays.sort(students, Comparator.comparingInt(Student::getBirthDate));
		
		Student youngest = students[studentNum - 1];
		Student oldest = students[0];
		
		System.out.println(youngest.name);
		System.out.println(oldest.name);
	}
}

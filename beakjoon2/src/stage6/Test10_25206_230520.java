package stage6;

import java.io.*;
import java.util.*;

public class Test10_25206_230520 {
	public static void main(String[] args) throws IOException {
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));

		int n=20;                                                    //20과목
		
		String name[]=new String[n];                                 //과목명
		float score[]=new float[n];                                  //학점
		String grade[]=new String[n];                                //등급
		float avg[]=new float[n];                                    //과목평점
		
		for(int i=0;i<n;i++) {                                       //for문 돌려 배열에 값 넣기
			StringTokenizer st=new StringTokenizer(br.readLine());   //입력 받기
			name[i]=st.nextToken();                                  //배열에 과목명 넣기
			score[i]=Float.parseFloat(st.nextToken());               //배열에 학점 넣기
			grade[i]=st.nextToken();                                 //배열에 등급 넣기
		}
		
		for(int i=0;i<n;i++) {                                       //for문 돌려 과목평점 값 넣기
			char zero=grade[i].charAt(0);                            //등급 첫번째 자리
			if(zero=='A') {
				avg[i]=4;
			}else if(zero=='B') {
				avg[i]=3;
			}else if(zero=='C') {
				avg[i]=2;
			}else if(zero=='D') {
				avg[i]=1;
			}
			
			if(grade[i].length()>1) {                                //등급이 한글자 이상일 경우
				char one=grade[i].charAt(1);                         //등급 두번째 자리
				if(one=='+') {
					avg[i]+=0.5;
				}
			}
		}

		double result=0;                                             //전공과목별의 합
		double sum=0;                                                //학점의 총합
		
		for(int i=0;i<n;i++) {
			if(!grade[i].equals("P")) {                              //등급이 P인 과목은 제외
				result+=(score[i]*avg[i]);                           //전공과목별의 합
				sum+=score[i];                                       //학점의 총합
			}
		}
		System.out.println(result/sum);                             //전공평점 출력
		br.close();
	}
}

//BufferedReader를 이용해 입력값을 받는다.
//
//과목명/학점/등급/과목평점 값을 넣을 배열을 정의한다.
//
//for문을 돌려 과목명/학점/등급 배열에 값을 넣는다.
//
//for문 돌려 과목 평점 배열에 값을 넣는다.
//
//전공과목별의 합/학점의 총합, 각 변수를 정의한다.
//
//등급이 P인 과목을 제외한 전공과목별의 합/학점의 총합을 구한다.
//
//전공평점을 출력한다.
//
//BufferedReader를 닫는다.
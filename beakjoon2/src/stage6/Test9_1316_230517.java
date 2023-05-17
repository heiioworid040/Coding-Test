package stage6;

import java.io.*;

public class Test9_1316_230517 {
	public static void main(String[] args) throws IOException {
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		int n=Integer.parseInt(br.readLine());                       //단어의 개수 n
		String[] word=new String[n];                                 //각 단어를 넣을 배열
		int num=n;                                                   //그룹 단어의 개수 num

		for(int i=0;i<n;i++) {                                       //단어의 개수만큼 for문 돌리기
			word[i]=br.readLine();                                   //배열에 단어 넣기
			boolean[] alp=new boolean[26];                           //알파벳을 저장할 배열

			for(int j=1;j<word[i].length();j++) {                    //단어의 길이만큼 for문 돌리기
				if(word[i].charAt(j)!=word[i].charAt(j-1)) {         //이전 문자와 다른 문자일 경우
					if(alp[word[i].charAt(j)-'a']) {                 //이미 나온 문자일 경우 (true)
						num--;                                       //num=num-1;
						break;
					}
					alp[word[i].charAt(j-1)-'a']=true;               //나온 문자 true로
				}
			}
		}
		System.out.println(num);
		br.close();
	}
}

//BufferedReader를 이용해 입력값을 받는다.
//
//단어의 개수(n)를 입력받는다.
//
//각 단어를 넣을 배열을 정의한다.
//
//그룹 단어의 개수(num)를 단어의 개수(n)로 정의한다.
//
//for문을 이용해 단어의 개수(n)만큼 다음을 수행한다.
//
//배열(word[])에 BufferedReader를 이용하여 단어를 입력받는다.
//
//나온 문자를 저장할 boolean 배열(alp[])을 정의한다.
//
//for문을 이용해 단어의 길이만큼 다음을 수행한다.
//
//이전 문자와 다른 문자일 경우, 이미 나온 문자일 경우 그룹 단어의 개수(num)를 1 감소시킨다.
//
//나온 문자는 boolean 배열(alp[])의 값을 true로 초기화한다.
//
//그룹 단어의 개수(num)을 출력한다.
//
//BufferedReader를 닫는다.
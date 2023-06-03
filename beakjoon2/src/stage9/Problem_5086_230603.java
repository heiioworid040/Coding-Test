package stage9;

import java.io.*;
import java.util.*;

public class Problem_5086_230603 {
    public static void main(String[] args) throws IOException {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb=new StringBuilder();
        StringTokenizer st;
        int num1, num2;
       
        while(true) {
            st=new StringTokenizer(br.readLine());
            num1=Integer.parseInt(st.nextToken());
            num2=Integer.parseInt(st.nextToken());
            if(num1==num2) {                 //0이 2개 주어질 때만 두 수가 같음
            	break;                       //while문 종료
            }else if(num2%num1==0) {         //약수라면
                sb.append("factor"+"\n");
            }else if(num1%num2==0) {         //배수라면
                sb.append("multiple"+"\n");
            }else {                          //둘 다 아니라면
            	sb.append("neither"+"\n");
            }
        }
        System.out.print(sb);                //출력
        br.close();
    }
}
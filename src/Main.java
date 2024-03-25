import java.io.*;
import java.util.Scanner;
import java.util.StringTokenizer;


public class Main {
    public static void main(String args[]) throws Exception {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));// InputStream<< 콘솔에서입력이나 출력
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st;//String을 토큰화한다.

        int a = Integer.parseInt(br.readLine());
        //a에 처음 입력받은 값br을 int형으로 형변화한 값을 넣는다. readLine() 함수는 String으로 리턴하기에 숫자로 입력 받으려면 형변환 필수.

        for(int i=0; a>i ; i++){
            st = new StringTokenizer(br.readLine());//ex)2 3이면 띄어쓰기 기준으로 2 3을 토큰화한다
            bw.write((Integer.parseInt(st.nextToken())+Integer.parseInt(st.nextToken()))+"\n");//nextToken으로 토큰화된 문자를 확인할 수 있는데 형변환 돼서 숫자끼리 더한다. 그리고 다음행으로 \n
        }
        bw.flush();
        bw.close();


    }
}


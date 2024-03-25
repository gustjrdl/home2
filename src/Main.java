import java.io.*;
import java.util.Scanner;
import java.util.StringTokenizer;


public class Main {
    public static void main(String args[]) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st;

        int a = Integer.parseInt(br.readLine());

        for(int i =1; a >= i; i++){
            st = new StringTokenizer(br.readLine());

            bw.write("Case #"+i+": "+(Integer.parseInt(st.nextToken())+Integer.parseInt(st.nextToken()))+"\n");
        }
        bw.flush();
        bw.close();

    }
}


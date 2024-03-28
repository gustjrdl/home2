import java.io.*;
import java.util.Arrays;
import java.util.Scanner;
import java.util.StringTokenizer;


public class Main {
    public static void main(String args[]) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int a = Integer.parseInt(br.readLine());
        StringTokenizer st;

        for (int i = 1; i <= a; i++) {
            st = new StringTokenizer(br.readLine());
            int b = (Integer.parseInt(st.nextToken()));
            int c = (Integer.parseInt(st.nextToken()));

            bw.write("Case #"+i+": "+b+" + "+c+" = "+(b+c)+"\n");
        }

        bw.flush();
        bw.close();

    }
}


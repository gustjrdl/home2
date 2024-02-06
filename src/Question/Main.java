package Question;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Scanner;

public class Main {

    public void solution() throws Exception {
        Scanner sc = new Scanner(System.in);

        int a= sc.nextInt();
        int b= sc.nextInt();
        int c= sc.nextInt();

        int ac = (int) Math.pow(10, 12);

        if (1 <= a && a<= ac &&1 <= b && b<= ac&&1 <= c && c<= ac)
        {
            System.out.println(a+b+c);
        }
    }
    public static void main(String args[]) throws Exception {

        new Main().solution();
    }
}

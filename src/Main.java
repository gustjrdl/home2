import java.io.*;
import java.util.Scanner;


public class Main {
    public static void main(String args[]) throws Exception {
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();

        for(int i = 1; a >= i; i++) {
            int b = sc.nextInt();
            int c = sc.nextInt();
            System.out.println(b+c);
        }
    }
}
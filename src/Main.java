import java.io.*;
import java.util.Scanner;


public class Main {
    public static void main(String args[]) throws Exception {

        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();

        int sum =0;

        for (int i = 1; b >= i; i++) {
            int c = sc.nextInt();
            int d = sc.nextInt();

            sum += c*d;
        }
        if(sum != a){
            System.out.println("No");
        }else {
            System.out.println("Yes");
        }



    }
}
import java.io.*;
import java.util.Scanner;


public class Main {
    public static void main(String args[]) throws Exception {
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int sum =0;
        for(int i = 1; a >= i; i++) {
            sum = i+sum;
        }
        System.out.println(sum);
    }
}
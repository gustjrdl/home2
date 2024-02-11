import java.io.*;
import java.util.Scanner;


public class Main {
    public static void main(String args[]) throws Exception{
        Scanner sc = new Scanner(System.in);

        int a= sc.nextInt();

        if(a >=1 && a<=4000 && a%4 == 0 && a%100 != 0) {
            System.out.println("1");
        } else if (a >=1 && a<=4000 && a%400 == 0) {
            System.out.println("1");
        }
        else {
            System.out.println("0");
        }
    }
}


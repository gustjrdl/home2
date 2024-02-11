import java.io.*;
import java.util.Scanner;


public class Main {
    public static void main(String args[]) throws Exception{
        Scanner sc = new Scanner(System.in);

        long a= sc.nextLong();
        long b= sc.nextLong();
        long c= sc.nextLong();

        long ac = (long) Math.pow(10, 12);

        if (1 <= a && a<= ac && 1 <= b && b<= ac && 1 <= c && c<= ac)
        {
            System.out.println(a+b+c);
        }
    }
}

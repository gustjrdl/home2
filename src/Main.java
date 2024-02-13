import java.io.*;
import java.util.Scanner;


public class Main {
    public static void main(String args[]) throws Exception{
        Scanner sc = new Scanner(System.in);

        int h = sc.nextInt();
        int m = sc.nextInt();

        if(h >= 0 && h <= 23 && m >= 0 && m <= 59 ){
            if(m < 45){
                m+=15;
                h-=1;
            } else if (m >= 45) {
                m-=45;
            }
            if(h < 0) {
                h+=24;
            }
        }
        System.out.println(h + " " + m);

    }
}


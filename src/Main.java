import java.io.*;
import java.util.Scanner;


public class Main {
    public static void main(String args[]) throws Exception {

        Scanner sc = new Scanner(System.in);
        String str = "";
        int a = sc.nextInt();

        if(a%4==0){
            for(int i = 4;  i <= a ; i+=4){

                str += "long ";
            }
            System.out.println(str + "int");

        }
    }
}
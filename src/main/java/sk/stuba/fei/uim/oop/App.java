package sk.stuba.fei.uim.oop;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int a, b;

        //1.1
        System.out.println("Hello wolrd");

        //1.2
        System.out.println("Zadaj cislo a: ");
        a = scan.nextInt();
        System.out.println("Zadaj cislo b: ");
        b = scan.nextInt();

        if (a > b) {
            System.out.println("1");
        } else if (a == b) {
            System.out.println("0");
        } else if (a < b) {
            System.out.println("-1");
        }
    }
}

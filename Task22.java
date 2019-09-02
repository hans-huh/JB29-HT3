package by.ld.hw.loop;

import java.util.Scanner;

public class Task22 {
    public static void main(String[] args) {

        Scanner scanner;
        double f = 0;
        double x = 0;
        double a = 0;
        double b = 0;
        double h = 0;

        // Getting user's input
        scanner = new Scanner(System.in);
        System.out.println("Enter the value of a: ");
        a = scanner.nextDouble();
        System.out.println("Enter the value of b: ");
        b = scanner.nextDouble();
        System.out.println("Enter the value of h: ");
        h = scanner.nextDouble();


        // calculation
        x = a;
        do{
            f = Math.pow(Math.sin(x), 2);
            System.out.println("x=" + x + ", f=" + f);
            x += h;
        } while (x <= b);
    }
}

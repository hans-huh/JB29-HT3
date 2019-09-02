package by.ld.hw.loop;

import java.util.Scanner;

public class Task8 {
    public static void main(String[] args) {
        Scanner scanner;

        double y = 0;
        double a = 0;
        double b = 0;
        double h = 0;
        double x = 0;
        double c = 0;

        // Getting user's input
        scanner = new Scanner(System.in);
        System.out.println("Enter the value of a: ");
        a = scanner.nextInt();
        System.out.println("Enter the value of b: ");
        b = scanner.nextInt();
        System.out.println("Enter the value of c: ");
        c = scanner.nextInt();
        System.out.println("Enter the value of h: ");
        h = scanner.nextInt();

        // calculation
        x = a;
        while(x <= b){
            if(x == 15){
                y = (x + c) * 2;
                System.out.println(y);
                x += h;
            } else {
                y = (x - c) * 2;
                System.out.println(y);
                x += h;
            }
        }
    }
}

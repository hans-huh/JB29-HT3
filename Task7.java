package by.ld.hw.loop;

import java.util.Scanner;

public class Task7 {
    public static void main(String[] args) {
        Scanner scanner;
        int x = 0;
        int a = 0;
        int b = 0;
        int h = 0;
        double y = 0;

        // Getting user's input
        scanner = new Scanner(System.in);
        System.out.println("Enter the value of a: ");
        a = scanner.nextInt();
        System.out.println("Enter the value of b: ");
        b = scanner.nextInt();
        System.out.println("Enter the value of h: ");
        h = scanner.nextInt();

        x = a;

        while(x <= b){
            if(x > 2){
                y = x;
                System.out.println(y);
            } else {
                y = (-1) * x;
                System.out.println(y);
            }
            x += h;
        }
    }
}

package by.ld.hw.loop;

import java.util.Scanner;

/**
 * Требуется определить факториал числа, которое ввел пользователь.
 */

public class Task25 {
    public static void main(String[] args) {

        Scanner scanner;
        int n = 0;
        int factorial = 1;
        int initial = 0;

        // Getting user's input
        scanner = new Scanner(System.in);
        System.out.println("Enter the value of n: ");
        n = scanner.nextInt();
        initial = n;

        while(n >= 1){
            factorial = factorial * n;
            n--;
        }
        System.out.println(initial + "! = " + factorial);
    }
}

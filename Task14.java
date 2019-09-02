package by.ld.hw.loop;

import java.util.Scanner;

/**
 * Дано натуральное n. вычислить: 1 + 1/2 + 1/3 + 1/4 + ... + 1/n.
 */

public class Task14 {
    public static void main(String[] args) {

        Scanner scanner;
        int n = 0;
        double result = 0;

        // getting user's input
        scanner = new Scanner(System.in);
        System.out.println("Enter the value of n: ");
        n = scanner.nextInt();

        // calculation
        for(int i = 1; i <= n; i++){
            result += (double) 1 / i;
        }

        System.out.println(result);



    }
}

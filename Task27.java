package by.ld.hw.loop;

import java.util.Scanner;

/**
 * Для каждого натурального числа в промежутке от m до n вывести все делители, кроме единицы
 * и самого числа. m и n вводятся с клавиатуры.
 */

public class Task27 {
    public static void main(String[] args) {

        Scanner scanner;
        int m = 0;
        int n = 0;

        // Getting user's input
        scanner = new Scanner(System.in);
        System.out.println("Enter the value of m: ");
        m = scanner.nextInt();
        System.out.println("Enter the value of n: ");
        n = scanner.nextInt();

        // starting calculation
        for(int i = m; i <= n; i++){
            System.out.print("Dividers of " + i + ": ");
            for(int k = 2; k < (i / 2) + 1; k++){
                if(i % k == 0){
                    System.out.print(k + " ");
                }
            }
            System.out.println();
        }
    }
}

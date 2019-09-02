package by.ld.hw.loop;

import java.util.Scanner;

/**
 * Напишите программу, где пользователь вводит любое целое положительное число. А программа
 * суммирует все числа от 1 до введенного пользователем числа.
 */

public class Task6 {
    public static void main(String[] args) {
        Scanner scanner;
        int x = 0;
        int i = 1;
        int sum = 0;

        // Getting user's input
        scanner = new Scanner(System.in);
        System.out.println("Enter the value of x: ");
        x = scanner.nextInt();

        while(i <= x){
            sum += i;
            i++;
        }

        System.out.println(sum);
    }
}

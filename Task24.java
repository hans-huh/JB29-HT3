package by.ld.hw.loop;

import java.util.Scanner;

/**
 * Вводится натуральное число. Найти сумму четных цифр, входящих в его состав. Преобразовать его в
 * другое число, цифры которого будут следовать в обратном порядке по сравнению с введенным числом.
 */

public class Task24 {
    public static void main(String[] args) {

        Scanner scanner;
        long n = 0;
        long temp = 0;
        long reverted = 0;
        long sum = 0;
        int digit = 0;
        String str;

        // Getting user's input
        scanner = new Scanner(System.in);
        System.out.println("Enter the value of n: ");
        n = scanner.nextLong();

        // calculating sum of positive digits
        temp = n;
        while(temp > 0){
            digit = (int) temp % 10;
            if(digit % 2 == 0){
                sum += digit;
            }
            temp /= 10;
        }

        // reverting the number
        str = Long.toString(n);
        str = new StringBuilder(str).reverse().toString();
        reverted = Long.parseLong(str);

        System.out.println("initial number: " + n);
        System.out.println("sum of positive digits: " + sum);
        System.out.println("reverted number: " + reverted);


    }
}

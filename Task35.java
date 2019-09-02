package by.ld.hw.loop;


import java.util.Scanner;

/**
 *  Найдите количество четных цифр данного натурального числа.
 */

public class Task35 {
    public static void main(String[] args) {

        Scanner scanner;
        long n = 0;
        int temp = 0;
        long initialInput = 0;
        int numberOfEvens = 0;

        // Getting user's input
        scanner = new Scanner(System.in);
        System.out.println("Enter the value of n: ");
        n = scanner.nextLong();
        initialInput = n;

        // checking the number of even digits in the number
        while(n > 0) {
            temp = (int) n % 10;
            if(temp % 2 == 0){
                numberOfEvens++;
            }
            n /= 10;
        }
        System.out.println("In number " + initialInput + ", the number of even digits is " + numberOfEvens);
    }
}

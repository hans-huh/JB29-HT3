package by.ld.hw.loop;

import java.util.Arrays;
import java.util.Scanner;

/**
 * Даны два числа. Определить цифры, входящие в запись как первого так и второго числа.
 */

public class Task29 {
    public static void main(String[] args) {

        Scanner scanner;
        long a = 0;
        long b = 0;
        int temp = 0;

        // Getting user's input
        scanner = new Scanner(System.in);
        System.out.println("Enter the value of a: ");
        a = scanner.nextLong();
        System.out.println("Enter the value of b: ");
        b = scanner.nextLong();
        boolean[] digits = new boolean[10];


        // set the content of digits[] to false
        Arrays.fill(digits, false);
        


        // getting common numbers in a and b
        while(a > 0){
            temp = (int) (a % 10);
            if(digits[temp] == false){
                digits[temp] = true;
            }
            a /= 10;
        }

        System.out.println("Common digits in a and b are: ");
        while(b > 0){
            temp = (int) (b % 10);
            if(digits[temp] == true){
                System.out.print(temp + " ");
                digits[temp] = false;
            }
            b /= 10;
        }


    }
}

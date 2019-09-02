package by.ld.hw.loop;

import java.util.Scanner;

/**
 * Найдите наибольшую цифру данного натурального числа.
 */

public class Task33 {
    public static void main(String[] args) {

        Scanner scanner;
        String n;
        int[] arrayDigit;
        int size = 0;
        char temp;
        int maxDigit = Integer.MIN_VALUE;

        // Getting user's input
        scanner = new Scanner(System.in);
        System.out.println("Enter the value of n: ");
        n = scanner.nextLine();

        // converting String to array
        size = n.length();
        arrayDigit = new int[size];
        for(int i = 0; i < size; i++){
            temp = n.charAt(i);
            arrayDigit[i] = Character.getNumericValue(temp);
        }

        // finding the max digit in the number
        for(int i = 0; i < size; i++){
            if(arrayDigit[i] > maxDigit){
                maxDigit = arrayDigit[i];
            }
        }

        System.out.println("The biggest digit in the number "  + n + " is " + maxDigit);
    }
}

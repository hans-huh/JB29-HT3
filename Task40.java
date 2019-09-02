package by.ld.hw.loop;
import java.util.Arrays;
import java.util.Scanner;

/**
 * Получить все числа, не превышающие заданного числа N, которые делятся без остатка на все свои цифры.
 */

public class Task40 {
    public static void main(String[] args) {

        Scanner scanner;
        int n = 0;
        int index = 0;
        int temp = 0;
        boolean withoutRemainder = false;
        boolean[] digits;
        int counter = 0;

        // Getting user's input
        scanner = new Scanner(System.in);
        System.out.println("Enter the value of n: ");
        n = scanner.nextInt();

        digits = new boolean[10];
        for(int i = 1; i <= n; i++){
            withoutRemainder = true;
            Arrays.fill(digits, false);
            temp = i;
            while(temp > 0){
                index = temp % 10;
                if(digits[index] == false){
                    digits[index] = true;
                }
                temp = temp / 10;
            }

            for(int k = 1; k < digits.length; k++){
                if(digits[k] == true) {
                    if (i % k != 0) {
                        withoutRemainder = false;
                    }
                }
            }
            if(withoutRemainder){
                System.out.print(i + " ");
                counter++;
                if(counter == 9){
                    System.out.println();
                    counter = 0;
                }
            }
        }


    }
}

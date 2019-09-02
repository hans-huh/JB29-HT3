package by.ld.hw.loop;

import java.math.BigDecimal;
import java.util.Scanner;

/**
 * Даны действительное (а) и натуральное (n). вычислить: a(a+1)...(a+n-1)
 */

public class Task17 {
    public static void main(String[] args) {

        Scanner scanner;
        double a = 0;
        int n  = 0;
        BigDecimal result = new BigDecimal("1");

        // Getting user's input
        scanner = new Scanner(System.in);
        System.out.println("Enter the value of a: ");
        a = scanner.nextDouble();
        System.out.println("Enter the value of n: ");
        n = scanner.nextInt();

        // calculation
        result = result.multiply(BigDecimal.valueOf(a));
        for(int i = 1; i < n; i++){
            result = result.multiply(BigDecimal.valueOf((a + i)));
        }

        System.out.println("result=" + result);
    }
}

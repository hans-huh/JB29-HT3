package by.ld.hw.loop;

import java.util.Scanner;

public class Task18 {
    public static void main(String[] args) {

        Scanner scanner;
        double sum = 0;
        int n = 1;
        double e = 0;


        scanner = new Scanner(System.in);
        System.out.println("Enter the value of e: ");
        e = scanner.nextDouble();
        while(Math.abs(Math.pow(-1, n - 1) / n) >= e){
            sum = sum + (Math.pow(-1, n - 1) / n);
            n++;
        }
        System.out.println(sum);
    }
}

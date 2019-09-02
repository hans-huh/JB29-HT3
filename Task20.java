package by.ld.hw.loop;
import java.util.Scanner;


public class Task20 {
    public static void main(String[] args) {

        Scanner scanner;
        double sum = 0;
        int n = 1;
        double e = 0;

        // Getting user's input
        scanner = new Scanner(System.in);
        System.out.println("Enter the value of e: ");
        e = scanner.nextDouble();

        while (Math.abs(calculate(n)) >= e){
            sum = sum + calculate(n);
            n++;
        }

        System.out.println(sum);
    }

    private static double calculate(int n){
        return ( (double) 1 / ( (3 * n - 2) * (3 * n + 1)) );
    }
}

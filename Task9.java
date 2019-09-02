package by.ld.hw.loop;

/**
 * Найти сумму квадратов первых ста чисел.
 */

public class Task9 {
    public static void main(String[] args) {
        int sum = 0;
        for(int i = 1; i <= 100; i++){
            sum = sum + (i * i);
        }
        System.out.println("sum = " + sum);
    }
}

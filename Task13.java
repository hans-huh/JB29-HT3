package by.ld.hw.loop;

/**
 * Составить таблицу значений функции y = 5 - x 2 /2 на отрезке [-5; 5] с шагом 0.5.
 */

public class Task13 {
    public static void main(String[] args) {
        double y = 0;
        double x = 0;
        double a = -5;
        double b = 5;
        double h = 0.5;

        // calculation
        x = a;
        do{
            y = 5 - ((x * x) / 2);
            System.out.println("x=" + x + ", y=" + y);
            x += h;
        } while (x <= b);
    }
}

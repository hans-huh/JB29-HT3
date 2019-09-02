package by.ld.hw.loop;

/**
 * Последовательность а n строится так: а1 = 1, an = 6+ аn-1 , для каждого n >1 Составьте программу нахождения
 * произведения первых 10 членов этой последовательности
 */

public class Task12 {
    public static void main(String[] args) {
        int prevA = 1;
        int actualA = 0;
        int product = 0;

        for(int i = 2; i <= 10; i++){
            actualA = 6 + prevA;
            product = prevA * actualA;
            prevA = actualA;
        }
        System.out.println("product=" + product);
    }
}

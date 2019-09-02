package by.ld.hw.loop;

/**
 * Составить программу нахождения разности кубов первых двухсот чисел
 */

public class Task11 {
    public static void main(String[] args) {
        int remainder = (int) Math.pow(1, 3);
        for(int i = 2; i < 200; i++){
            remainder -= (int)Math.pow(i, 3);
        }
        System.out.println("remainder=" + remainder);

    }
}

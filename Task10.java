package by.ld.hw.loop;

import java.math.BigInteger;

/**
 * Составить программу нахождения произведения квадратов первых двухсот чисел
 */

public class Task10 {
    public static void main(String[] args) {
        BigInteger product = new BigInteger("1");
        for(int i = 1; i <= 200; i++){
            product = product.multiply(BigInteger.valueOf(i*i));
            System.out.println(product);
        }

        System.out.println("product = " + product);
    }
}

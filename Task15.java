package by.ld.hw.loop;

import java.math.BigInteger;

/**
 * Вычислить : 1+2+4+8+...+ 2 в 10 степени.
 */

public class Task15 {
    public static void main(String[] args) {
        BigInteger result = new BigInteger("0");
        for(int i = 0; i <= 10; i++){
            result = result.add(BigInteger.valueOf((long)Math.pow(2, i)));
        }
        System.out.println("result=" + result);
    }
}

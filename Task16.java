package by.ld.hw.loop;

import java.math.BigInteger;

/**
 * Вычислить: (1+2)*(1+2+3)*...*(1+2+...+10).
 */

public class Task16 {
    public static void main(String[] args) {

        BigInteger result = new BigInteger("1");
        int sum;
        int k = 0;


        for(int i = 2; i <= 10; i++){
            k = i;
            sum = 0;
            while(k > 0){
                sum += k;
                k--;
            }
            result = result.multiply(BigInteger.valueOf(sum));
            System.out.println(result);
        }

        System.out.println("\nresult=" + result);

        System.out.println("result=" + result);
    }
}

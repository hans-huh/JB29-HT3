package by.ld.hw.loop;

import java.util.ArrayList;
import java.util.Arrays;

/**
 *  Найдите все четырехзначные числа, сумма цифр каждого из которых равна 15.
 */

public class Task34 {
    public static void main(String[] args) {
        int start = 1000;
        int end = 9999;
        final int EXPECTED_SUM = 15;
        int temp;
        int k;
        int sum;
        int counter = 0;
        int printCounter = 0;
        ArrayList<Integer> values = new ArrayList<>();
        int[] arrayValues;

        for(int i = start; i <= end; i++){
            sum = 0;
            k = i;
            while (k > 0){
                temp = k % 10;
                sum += temp;
                k = k / 10;
            }
            if(sum == EXPECTED_SUM){
                values.add(i);
                counter++;
            }
        }

        for(int i = 0; i < counter; i++){
            System.out.print(values.get(i) + " ");
            printCounter++;
            if(printCounter == 9){
                printCounter = 0;
                System.out.println();
            }
        }
    }
}

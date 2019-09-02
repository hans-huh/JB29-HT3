package by.ld.hw.loop;

/**
 * С помощью оператора while напишите программу вывода всех четных чисел в диапазоне от 2 до 100
 * включительно.
 */

public class Task4 {
    public static void main(String[] args) {
        int x = 2;
        while(x <= 100){
            System.out.print(x + " ");
            x += 2;
        }
    }
}

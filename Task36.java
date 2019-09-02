package by.ld.hw.loop;

/**
 *  Два двузначных числа, записанных одно за другим , образуют четырёхзначное число, которое делится на их произведение.
 *  Найти эти числа
 */

public class Task36 {
    public static void main(String[] args) {

        String a;
        String b;
        String numberStr;
        int numberDgt;
        int product = 0;

        for(int i = 10; i <= 99; i++){
            for(int k = 10; k <= 99; k++){
                product = i * k;
                a = Integer.toString(i);
                b = Integer.toString(k);
                numberStr = a + b;
                numberDgt = Integer.parseInt(numberStr);
                if(numberDgt % product == 0){
                    System.out.println("The numbers are " + a + " and " + b);
                }
            }
        }
    }
}

package by.ld.hw.loop;

/**
 * Даны два двузначных числа А и В. Из этих чисел составили 2 четырехзначных числа:
 * первое число получили путем написания сначала числа А, затем В.
 * Для получения второго числа сначала записали число В, затем А.
 * Найти числа А и В если известно , что первое четырехзначное число нацело делится на 99, а второе на 49.
 */

public class Task37 {
    public static void main(String[] args) {

        String a;
        String b;
        String firstNumberStr;
        String secondNumberStr;
        int firstNumberDgt;
        int secondNumberDgt;

        for(int i = 10; i <= 99; i++){
            for(int k = 10; k <= 99; k++){
                a = Integer.toString(i);
                b = Integer.toString(k);
                firstNumberStr = a + b;
                secondNumberStr = b + a;
                firstNumberDgt = Integer.parseInt(firstNumberStr);
                secondNumberDgt = Integer.parseInt(secondNumberStr);
                if(firstNumberDgt % 99 == 0 && secondNumberDgt % 49 == 0){
                    System.out.println("The numbers are " + a + " and " + b + "\n");
                }
            }
        }
    }
}

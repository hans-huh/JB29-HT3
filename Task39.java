package by.ld.hw.loop;

/**
 * В трехзначном числе зачеркнули старшую цифру.
 * Когда полученное число умножили на 7, то получили исходное число. Найти это число.
 */

public class Task39 {
    public static void main(String[] args) {

        int originalNumber = 0;
        int alteredNumber = 0;
        String alteredNumberStr = "";

        for(int i = 100; i <= 999; i++){
            originalNumber = i;
            alteredNumberStr = Integer.toString(i).substring(1, 3);
            alteredNumber = Integer.parseInt(alteredNumberStr);

            if((alteredNumber * 7) == originalNumber ){
                System.out.println("The number is " + originalNumber);
            }
        }


    }
}
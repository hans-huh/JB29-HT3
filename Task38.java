package by.ld.hw.loop;
import java.util.Scanner;

/**
 * Для заданного натурального числа определить, образуют ли его цифры арифметическую прогрессию.
 * Предполагается, что в числе не менее трёх цифр. Например: 1357, 963.
 */

public class Task38 {
    public static void main(String[] args) {

        Scanner scanner;
        String number = "";
        int d = 0;
        int[] arrayDigit;
        char temp;
        boolean isProgression = true;

        // Getting user's input
        scanner = new Scanner(System.in);

        do{
            System.out.println("Enter a number (at least 3 digits): ");
            number = scanner.nextLine();
        } while(number.length() < 3);

        // filling in array of ints
        arrayDigit = new int[number.length()];
        for(int i = 0; i < number.length(); i++){
            temp = number.charAt(i);
            arrayDigit[i] = Character.getNumericValue(temp);
        }

        // checking if the digits make an arithmetic progression
        d = (int) Math.abs((double)arrayDigit[0] - arrayDigit[1]);
        for(int i = 1; i < number.length(); i++){
            if( ((arrayDigit[i - 1] + d) == arrayDigit[i]) || (arrayDigit[i - 1] - d) == arrayDigit[i]){
                continue;
            } else {
                isProgression = false;
                break;
            }
        }

        if(isProgression){
            System.out.println("The digits of the number " + number + " make an arithmetic progression.");
        } else {
            System.out.println("The digits of the number " + number + " do NOT make an arithmetic progression.");
        }
    }
}

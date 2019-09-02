package by.ld.hw.loop;

import java.util.Scanner;

/**
 * Написать программу, переводящую римские цифры в арабские.
 */

public class Task30 {
    public static void main(String[] args) {

        Scanner scanner;
        String numberInRoman;
        int result = 0;
        int first = 0;
        int next = 0;
        char[] romanChars;

        // Getting user's input
        scanner = new Scanner(System.in);
        System.out.println("Enter a Roman number: ");
        numberInRoman = scanner.nextLine();
        numberInRoman = numberInRoman.toUpperCase();

        romanChars = numberInRoman.toCharArray();

        for(int i = 0; i < romanChars.length; i++){
            first = Roman.valueOf(Character.toString(romanChars[i])).getValue();

            // using this to avoid OutOfBoundary exception
            if( (i + 1) < romanChars.length){
                next = Roman.valueOf(Character.toString(romanChars[i + 1])).getValue();
            }

            if(first < next){
                result = result + (next - first);
                i++;
            } else {
                result += first;
            }
        }
        System.out.println("Number in roman: " + numberInRoman);
        System.out.println("Number in arabic: " + result);


    }

    public enum Roman{
        I(1), V(5), X(10), L(50), C(100), D(500), M(1000);
        private int value;
        Roman(int value){
            this.value = value;
        }

        public int getValue(){
            return value;
        }
    }
}

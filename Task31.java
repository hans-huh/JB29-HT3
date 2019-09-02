package by.ld.hw.loop;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;
import java.util.Collections;

/**
 * Компьютер генерирует пять чисел в диапазоне от 1 до 15 включительно. Человек пытается их угадать.
 * Программа должна выводить угаданные и неугаданные числа из тех, что сгенерировала программа, а также
 * ошибочные числа пользователя.
 */

public class Task31 {
    public static void main(String[] args) {

        Scanner scanner;
        final int RANGE = 15;
        boolean[] randomNums = new boolean[RANGE];
        int[] guess = new int[5];
        ArrayList<Integer> randomList;
        ArrayList<Integer> guessed;
        ArrayList<Integer> wrongs;
        int index = 0;
        int successCounter = 0;


        // Generating 5 random numbers from 1 to 15
        Arrays.fill(randomNums, false);
        randomList = new ArrayList<>();
        for(int i = 1; i <= RANGE; i++){
            randomList.add(i);
        }
        Collections.shuffle(randomList);
        for(int i = 0; i < 5; i++){
            randomNums[randomList.get(i)] = true;
        }

        // Taking user's input
        scanner = new Scanner(System.in);
        System.out.println("Enter 5 numbers from 1 to 15");
        for(int i = 0; i < guess.length; i++){
            System.out.println("Enter " + (i + 1) + " number");
            guess[i] = scanner.nextInt();
        }

        guessed = new ArrayList<>();
        wrongs = new ArrayList<>();
        // comparing guessed numbers with random numbers
        for(int i = 0; i < guess.length; i++){
            index = guess[i];
            if(randomNums[index] == true){
                guessed.add(guess[i]);
                successCounter++;
                randomNums[index] = false;
            }
        }
        if(successCounter < 5){
            for(int i = 0; i < randomNums.length; i++){
                if(randomNums[i] == true){
                    wrongs.add(i);
                }
            }
        }
        System.out.println("You guessed " + successCounter + " out of 5 numbers");
        System.out.print("Numbers that you guessed: ");
        for(Integer i : guessed){
            System.out.print(i + " ");
        }
        System.out.print("\nNumbers that you did not guess: ");
        for(Integer i : wrongs){
            System.out.print(i + " ");
        }
    }
}

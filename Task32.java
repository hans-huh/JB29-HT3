package by.ld.hw.loop;
import java.util.Scanner;

/**
 *  Проверить введенную пользователем строку на наличие недопустимых символов.
 *  В качестве первого символа допустимы только буквы и знак подчеркивания.
 *  Остальные символы могут быть буквами, цифрами и знаком подчеркивания.
 *
 */

public class Task32 {
    public static void main(String[] args) {

        Scanner scanner;
        String input;
        String checkedInput;
        char[] inputChars;
        boolean isPassed = true;

        // Getting user's input
        scanner = new Scanner(System.in);
        System.out.println("Enter a string: ");
        input = scanner.nextLine();
        inputChars = input.toCharArray();

        for(int i = 0; i < inputChars.length; i++){
            if(Character.isLetter(inputChars[i]) || Character.isDigit(inputChars[i]) || inputChars[i] == '_'){
                if(i == 0 && Character.isDigit(inputChars[i])){
                    System.out.println("Invalid character in the beginning of the string. Only letters and underscores are allowed!");
                    isPassed = false;
                    break;
                }
            } else {
                System.out.println("Invalid character! Only letters, digits and underscores are allowed!");
                isPassed = false;
                break;
            }
        }
        if(isPassed){
            System.out.println("The string passed the check!");
        } else {
            System.out.println("The string did not pass the check!");
        }
    }
}

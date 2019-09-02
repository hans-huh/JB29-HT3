package by.ld.hw.loop;
import java.util.Scanner;

/**
 * Написать программу, в которой вводятся два операнда Х и Y и знак операции (+, –, /, *). Вычислить
 * результат Z в зависимости от знака. Предусмотреть реакции на возможный неверный знак операции, а также
 * на ввод Y=0 при делении. Организовать возможность многократных вычислений без перезагрузки программа
 * (т.е. построить цикл). В качестве символа прекращения вычислений принять ‘0’.
 */

public class Task28 {
    public static void main(String[] args) {

        Scanner scanner;
        double x;
        double y;
        char sign;
        double z;

        scanner = new Scanner(System.in);
        do{
            System.out.println("\nEnter the value of x. Press 0 to exit");
            x = scanner.nextDouble();
            int result = Double.compare(x, 0);
            if(result == 0){
                System.out.println("Bye");
                break;
            }

            System.out.println("Enter sign of operation: +, -, /, *");
            sign = scanner.next().charAt(0);

            System.out.println("Enter the value of y: ");
            y = scanner.nextDouble();

            switch (sign){
                case('+'):
                    z = x + y;
                    System.out.println("======");
                    System.out.println(z);
                    break;
                case('-'):
                    z = x - y;
                    System.out.println("======");
                    System.out.println(z);
                    break;
                case('/'):
                    if(y == 0) {
                        System.out.println("Division by zero!");
                        break;
                    }
                    z = x / y;
                    System.out.println("======");
                    System.out.println(z);
                    break;
                case('*'):
                    z = x * y;
                    System.out.println("======");
                    System.out.println(z);
                    break;
                default:
                    System.out.println("Incorrect arithmetic operation sign! Try again!");
                    break;
            }
        } while(true);

    }
}

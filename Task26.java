package by.ld.hw.loop;

/**
 * Вывести на экран соответствий между символами и их численными обозначениями в памяти компьютера
 * (Таблицу ASCII).
 */

public class Task26 {
    public static void main(String[] args) {
        char character;

        for(int i = 0; i < 256; i++){
            character = (char) i;
            System.out.println(i + " = " + character);
        }
    }
}

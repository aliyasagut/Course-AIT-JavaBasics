package homework07;

import java.util.Scanner;

public class Task0 {
    /*
Перепишите решение задачи с использованием switch вместо if-else:
Необходимо написать программу,
где бы пользователю предлагалось ввести число на выбор: 1, 2 или 3,
а программа должна сказать, какое число ввёл пользователь: 1, 2, или 3
 */
    public static void main(String[] args) {
        System.out.println("Введитк число на выбор: 1, 2 или 3");
        Scanner scanner = new Scanner(System.in);
        int userInput = scanner.nextInt();

        switch (userInput) {
            case 1: {
                System.out.println("пользователь ввёл: 1");
                break;
            }
            case 2: {
                System.out.println("пользователь ввёл: 2");
                break;
            }
            case 3: {
                System.out.println("пользователь ввёл: 3");
                break;
            }
            default: {
                System.out.println("пользователь ввёл что-то другое");
            }
        }
    }
}

package homework06;

import java.util.Scanner;

public class Task0 {
    /*
    Необходимо написать программу,
    где бы пользователю предлагалось ввести число на выбор: 1, 2 или 3,
    а программа должна сказать, какое число ввёл пользователь: 1, 2, или 3
     */

    public static void main(String[] args) {
        System.out.println("Введитк число на выбор: 1, 2 или 3");
        Scanner scanner = new Scanner(System.in);
        int userInput = scanner.nextInt();
        System.out.println(userInput);

        if (userInput == 1) {
            System.out.println("пользователь ввёл: 1");
        } else if (userInput == 2) {
            System.out.println("пользователь ввёл: 2");
        } else if (userInput == 3) {
            System.out.println("пользователь ввёл: 3");
        } else {
            System.out.println("пользователь ввёл что-то другое");
        }
    }
}

package homework06;

import java.util.Scanner;

public class Task2 {
    /*
    программа предлагает пользователю ввести четырехзначное число
    Причем: мы можем получать от пользователя ТОЛЬКО строки. Данные в формате String
    Если число не четырехзначное, должно вывестись на экран сообщение об ошибке и работа программы завершается
    Проверить, является ли число "счастливым билетом". Т.е. совпадает ли сумма цифр первых двух цифр числа с суммой третьей и четвертой цифры

    Пример:
    число 1450 -> (1+4) = 5; (5+0) = 5; 5 равно 5 - число счастливое
    число 1654 -> (1+6) = 7; (5+4) = 9; 7 не равно 9 - число НЕ является счастливым
     */

    public static void main(String[] args) {
        System.out.println("Введите четырехзначное число");
        Scanner scanner = new Scanner(System.in);
        String userInput = scanner.nextLine();

        if (userInput.length() == 4) {
            System.out.println("Это число четырехзначное");
            if (userInput.charAt(0) + userInput.charAt(1) == userInput.charAt(2) + userInput.charAt(3))
                System.out.println("Число " + userInput + " счастливое");
            else {
                System.out.println("Число " + userInput + " не счастливое");
            }
        } else {
            System.out.println("Это число не четырехзначное");
        }
    }
}

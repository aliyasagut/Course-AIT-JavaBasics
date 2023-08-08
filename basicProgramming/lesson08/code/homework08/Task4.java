package homework08;

import java.util.Scanner;

public class Task4 {
    /*
    Программа просит пользователя ввести произвольное число
    Вывести сумму цифр этого числа
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите произвольное число");
        String userInput = scanner.nextLine();

        int i = 0;
        int sum = 0;

        while (i < userInput.length()) {
            int x = Integer.parseInt(String.valueOf(userInput.charAt(i)));
            sum += x;
            i++;
        }
        System.out.println("Сумма чисел: " + sum);
    }
}

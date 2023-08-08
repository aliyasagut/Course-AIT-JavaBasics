package homework07;

import java.util.Scanner;

public class Task1 {
    /*
    Программа просит пользователя ввести число от 1 до 7
    Если число равно 1, выводим на консоль “Понедельник”,
    2 –”Вторник” и так далее. Если 6 или 7 – “Выходной”.
     */
    public static void main(String[] args) {
        System.out.println("ввести число от 1 до 7");
        Scanner scanner = new Scanner(System.in);
        int userInput = scanner.nextInt();
        //System.out.println(userInput);
        String result = "";

        switch (userInput) {
            case 1: {
                result = "Today is Monday";
                break;
            }
            case 2: {
                result = "Today is Tuesday";
                break;
            }
            case 3: {
                result = "Today is Wednesday";
                break;
            }
            case 4: {
                result = "Today is Thursday";
                break;
            }
            case 5: {
                result = "Today is Friday";
                break;
            }
            case 6:
            case 7: {
                result = "Today is Weekend";
                break;
            }
            default: {
                result = "You've entered something else";
            }
        }
        System.out.println(result);
    }
}

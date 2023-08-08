package homework08;

import java.util.Scanner;

public class Task3 {
    /*
    Программа просит пользователя слово "hello"
    Если пользователь вводит правильное слово -
    программа распечатывает на экран благодарность и завершает работу
    Если вводится не верное слово -
    программа просит ввести слово снова.
    До тех пор, пока не будет введено запрашиваемое слово

    *опционально - считать кол-во попыток, которые потребовались пользователю для введения правильного слова
    По окончанию - вывести число попыток на экран
     */
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String userInput = "";
        int counter = 0;

        do {
            System.out.println("Введите слово \"hello\"");
            userInput = scanner.nextLine();
            counter++;
        } while (!userInput.equalsIgnoreCase("hello"));

        System.out.println("Спасибо!");
        System.out.println("Количество попыток " + counter);
    }
}

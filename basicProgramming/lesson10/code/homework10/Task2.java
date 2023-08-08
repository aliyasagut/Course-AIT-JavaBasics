package homework10;

import java.util.Arrays;
import java.util.Random;

public class Task2 {
    /*
    Заполните массив 50 случайными числами от 1 до 100.
    Программа должна найти, и вывести на экран все простые числа.
    Посчитайте сколько получилось таких чисел в массиве.
    Простое число - число, которое делится на цело только на 1 и само себя.

    Пример простых чисел: 3, 5, 7, 11, 13 и т.д.
     */
    public static void main(String[] args) {
        Random random = new Random();
        int[] myArray = new int[10];
        int counter = 0;

        for (int i = 0; i < myArray.length; i++) {
            myArray[i] = random.nextInt(10) + 1;
        }
        System.out.println("Массив: \n" + Arrays.toString(myArray));

        for (int i = 0; i < myArray.length; i++) {
            boolean isPrime = true;
            for (int j = 2; j < myArray[i]; j++) {
                if (myArray[i] % j == 0) {
                    isPrime = false;
                    break;
                }
            }
            if (isPrime == true) counter++;
        }

        System.out.println("Количество простых чисел: " + counter);
    }
}


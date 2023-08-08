package homework10;

import java.util.Arrays;
import java.util.Random;

public class Task0 {
    /*
    Заполните массив 20 случайными целыми числами.
    Программа должна вывести на экран массив, количество четных чисел в массиве и сумму всех четных чисел.
     */
    public static void main(String[] args) {
        Random random = new Random();

        int count = 0; // количество четных чисел
        int sum = 0;

        int[] myArray = new int[20];
        for (int i = 0; i < myArray.length; i++) {
            myArray[i] = random.nextInt(10);
        }
        for (int i = 0; i < myArray.length; i++) {
            if (myArray[i] % 2 == 0 & myArray[i] != 0) {
                count++;
                sum += myArray[i];
            }
        }

        System.out.println(Arrays.toString(myArray));
        System.out.println("Количество четных чисел в массиве: " + count);
        System.out.println("Сумма четных чисел: " + sum);
    }
}


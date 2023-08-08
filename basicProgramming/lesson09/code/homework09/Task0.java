package homework09;

import java.util.Arrays;
import java.util.Random;

public class Task0 {
    /*
    Дан массив целых чисел.
    * Выберите произвольную длину. Заполните случайными значениями.
    Вывести на экран:
    - минимальное значение, хранящееся в массиве
    - максимальное
    - среднее арифметическое всех значений в массиве
     */
    public static void main(String[] args) {
        Random random = new Random();
        int a = random.nextInt(20);
        int[] myArray = new int[a];
        System.out.println(Arrays.toString(myArray));

        int counter = 0;
        while (counter < myArray.length) {
            myArray[counter] = random.nextInt(20);
            counter++;
        }
        System.out.println(Arrays.toString(myArray));

//        System.out.println("минимальное значение: " + Arrays.stream(myArray).min());
//        System.out.println("максимальное значение: " + Arrays.stream(myArray).max());
//        System.out.println("среднее арифметическое значение: " + Arrays.stream(myArray).average());

        int minValue;
        int maxValue = 0;
        int i = 0;

        minValue = myArray[0];

        int sum = 0;

        while (i < myArray.length) {
            if (myArray[i] > maxValue) {
                maxValue = myArray[i];
            }
            if (myArray[i] < minValue) {
                minValue = myArray[i];
            }
            sum += myArray[i++];
        }
        System.out.println("Min: " + minValue + " Max: " + maxValue + " Sum: " + sum);


    }
}

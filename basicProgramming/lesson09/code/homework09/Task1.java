package homework09;

import java.util.Arrays;
import java.util.OptionalInt;

public class Task1 {
    /*
    Дан массив целых чисел. Поменять местами элемент с максимальным и минимальным значением
     */
    public static void main(String[] args) {
        int[] myArray = {5, 6, -25, 0, 31, -15};
        System.out.println(Arrays.toString(myArray));

        int counter = 0;
        int maxValue = myArray[0];
        int maxIndex = 0;
        int minValue = myArray[0];
        int minIndex = 0;

        while (counter < myArray.length) {
            if (myArray[counter] >= maxValue) {
                maxValue = myArray[counter];
                maxIndex = counter;
            }
            if (myArray[counter] <= minValue) {
                minValue = myArray[counter];
                minIndex = counter;
            }
            counter++;
        }
        System.out.println("maxIndex " + maxIndex + " maxValue " + maxValue);
        System.out.println("minIndex " + minIndex + " minValue " + minValue);

        int x = myArray[maxIndex];
        myArray[maxIndex] = myArray[minIndex];
        myArray[minIndex] = x;

        System.out.println(Arrays.toString(myArray));
    }
}

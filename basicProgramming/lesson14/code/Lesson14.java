import java.util.Arrays;
import java.util.Random;

public class Lesson14 {
    public static void main(String[] args) {
        System.out.println("----- task 0 -----");
        /* написать метод возвращающий массив целых чисел заданной длиныю,
        массив должен быть заполнен случайными числами.
        Перегрузка: диапазон случайных чисел может быть задан вторым параметром вызова метода */
        int[] arr = createRandomArray(10);
        System.out.println(Arrays.toString(arr));
    }

    // Methods

    public static int[] createRandomArray(int length) {
        int boundDefault = 100;
        return createRandomArray(length, boundDefault);
    }

    public static int[] createRandomArray(int length, int x) {
        int boundDefault = 100;
        Random random = new Random();
        if (length < 0) return new int[0];
        if (x <= 0) x = boundDefault;
        int[] arr = new int[length];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt(x);
        }
        return arr;
    }

    // End Methods
}

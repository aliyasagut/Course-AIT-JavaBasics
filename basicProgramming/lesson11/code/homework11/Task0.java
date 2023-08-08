package homework11;

import java.util.Arrays;

public class Task0 {
    public static void main(String[] args) {

        int[] array = {1, 4, 77, 89, 90, 5};
        System.out.println("Array: " + Arrays.toString(array));
        System.out.print("ReverseArray: ");
        printReverseArray(array);
        System.out.print("ReverseArray wit Index: ");
        printReverseArray(array, 2);
        System.out.print("ReverseArray wit Boolean: ");
        printReverseArray(array, false);
    }

    // Method area

    public static void printReverseArray(int[] array) {
        /*
        Написать метод, принимающий массив целых чисел и распечатывающий массив в обратной последовательности.
        {1, 4, 3, 6, 7} -> распечатывает [7, 6, 3, 4, 1]
         */
        if (array != null) {
            System.out.print("[");
            for (int i = array.length - 1; i >= 0; i--) {
                System.out.print(array[i]);
                if (i != 0) {
                    System.out.print(", ");
                }
            }
            System.out.print("]");
            System.out.println();
        } else {
            System.out.println("Неверные аргументы");
        }
    }

    public static void printReverseArray(int[] array, int index) {
        /*
        Перегрузить метод, если в него приходит индекс,
        то часть массива слева до этого индекса распечатывается в обычном порядке, а начиная с этого индекса в обратном:
        {1, 4, 3, 6, 7} + индекс 2 - > распечатывает [1, 4, 7, 6, 3]
         */
        if (array != null) {
            for (int i = 0; i < index & i < array.length; i++) {
                System.out.print(array[i] + ", ");
            }
            for (int i = array.length - 1; i >= 0 & i >= index; i--) {
                System.out.print(array[i]);
                if (i != index) {
                    System.out.print(", ");
                }
            }
            System.out.println();
        } else {
            System.out.println("Неверные аргументы");
        }
    }

    public static void printReverseArray(int[] array, boolean isReverse) {
        /*
        Еще одна перегрузка: метод принимает массив и булевый флаг.
        Если флаг == true -> печатает массив в обратном порядке
        Если флаг == false -> печатает массив в прямом порядке
         */
        if (isReverse) {
            printReverseArray(array);
        } else {
            printReverseArray(array, array.length-1);
        }
    }


}

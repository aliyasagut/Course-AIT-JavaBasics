package homework13;

import java.util.Arrays;

public class Tasks13 {
    public static void main(String[] args) {
        System.out.println("-----Task 0-----");
        String[] arr = {"one", "two", "three", "test", "four"};
        String str = "test123";
        int indexOfSring = searchStringInArray(arr, str);
        if (indexOfSring == -1) {
            System.out.println("Этой строки нет в массиве.");
        } else {
            System.out.println("Строка " + str + " находится под индексом " + indexOfSring);
        }

        System.out.println("-----Task 1-----");
        System.out.println(printNewString(str));
        String str2 = printNewString(str);
        if (str2 == null) System.out.println("Строка слишком короткая!");

        System.out.println("-----Task 2-----");
        int[] array = {2, 4, 5, 3, 12, -1, 0};
//        int[] array2 = null;
        System.out.println("Сумма ровна " + sumOfArray(array));

        System.out.println("-----Task 3-----");
        int[] array3 = {1, 6, 45, 13, -6};
        System.out.println(Arrays.toString(copyOfArray(array3)));

        System.out.println("-----Task 3.1-----");
        String[] a = copyOfArray(arr);
        System.out.println(Arrays.toString(a));

        System.out.println("-----Task 3.2-----");
        System.out.println(Arrays.toString(copyOfArray(array3, 2)));


    } //End of main

    // Method area
    public static int searchStringInArray(String[] arr, String string) {
        /* Написать метод по поиску строки в массиве строк. На вход метод принимает массив строк, и строку для поиска. */
        int indexOfString = -1;

        if (arr == null) return indexOfString;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i].equals(string)) {
                indexOfString = i;
                return indexOfString;
            }
        }
        return indexOfString;
    }

    public static String printNewString(String str) {
    /* Написать метод, принимающий строку и возвращающий новую строку, состоящую из 2го и 3го символа входящей строки, переведенных в верхний регистр.
    Распечатать полученный результат в методе main. */
        String str2 = "";
        if (str.length() >= 3) {
            str2 = str.substring(1, 3).toUpperCase();
        } else if (str.length() == 2) {
            str2 = str.substring(1).toUpperCase();
        } else {
            str2 = null;
        }
        return str2;
    }

    public static int sumOfArray(int[] arr) {
        /* Реализуйте метод sumOfArray (сумма элементов массива), который получает на вход массив и определяет сумму его элементов. */
        int sum = 0;
        if (arr == null) return 0; // -1 неверно, тк сумма может быть -1, но я не знаю, как сделать по-другому
        for (int i = 0; i < arr.length; i++) {
            sum = sum + arr[i];
        }
        return sum;
    }

    public static int[] copyOfArray(int[] arr) {
    /* Написать метод copyOfArray, возвращающий массив:
    Метод принимает массив целых чисел и возвращает копию этого массива. */
        int[] arrCopy = new int[arr.length];

        if (arr == null) return new int[0];
        for (int i = 0; i < arr.length; i++) {
            arrCopy[i] = arr[i];
        }
        return arrCopy;
    }

    public static String[] copyOfArray(String[] arr) {
        /* Перегрузка: метод принимает массив строк и возвращает копию массива */
        String[] arrCopy = new String[arr.length];

        if (arr == null) return null;
        for (int i = 0; i < arr.length; i++) {
            arrCopy[i] = arr[i];
        }
        return arrCopy;
    }

    public static int[] copyOfArray(int[] arr, int newSize) {
    /* Перегрузка: Метод принимает массив целых чисел и число (newSize) - длину нового массива.
    Новый массив заполняется значениями из входящего массива. Сколько поместится.
    Если чисел не хватило -> остаток массива заполняется 0.
    {1, 2, 3, 4, 5} -> copyOfArray(array, 3) -> {1, 2, 3}
    {1, 2, 3, 4, 5} -> copyOfArray(array, 7) -> {1, 2, 3, 4, 5, 0, 0}*/
        int[] arrCopy = new int[newSize];

        if (arr == null) return new int[0];

        for (int i = 0; i < arrCopy.length && i < arr.length; i++) {
            arrCopy[i] = arr[i];
        }
//        if (newSize == arr.length) return copyOfArray(arr);
//        if (newSize > arr.length) {
//            for (int i = 0; i < newSize; i++) {
//                if (i < arr.length) {
//                    arrCopy[i] = arr[i];
//                } else {
//                    arrCopy[i] = 0;
//                }
//            }
//        }
//        if (newSize < arr.length) {
//            for (int i = 0; i < arrCopy.length; i++) {
//                arrCopy[i] = arr[i];
//            }
//        }
        return arrCopy;
    }
    // End of Methods
}

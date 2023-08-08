package homework14;

import java.util.Arrays;

public class HW14 {
    public static void main(String[] args) {
        System.out.println("----- Task 0 -----");
        // Написать метод переводящие все маленькие буквы латинского алфавита в строке в верхний регистр.
        String test = "hello";
//        String test = "heLLO";
//        String test = "HELLO";
//        String test = "";

        System.out.println(toUpperCaseMy(test));

        System.out.println("----- Task 1 -----");
        /* Написать метод swap, принимающий на вход массив целых чисел, и два индекса.
        Метод должен поменять местами значения, хранящихся в этих индексах
        {0, 1, 2, 3, 4, 5, 6} -> swap(arr, 1, 5} -> {0, 5, 2, 3, 4, 1, 6}
        Если индексы за пределами массива?
        Перегрузка метода для работы с массивами строк. */
        int[] testArray = {0, 1, 2, 3, 4, 5, 6};
        int index1 = 1, index2 = 5;
//        int index1 = 1, index2 = 7;
//        int index1 = -1, index2 = 6;
//        int index1 = 1, index2 = -6;
        System.out.println(Arrays.toString(testArray));
        swapInArrayByIndex(testArray, index1, index2);
        System.out.println(Arrays.toString(testArray));

        String[] testStringArray = {"null", "one", "two", "three", "four", "five", "six"};
        System.out.println(Arrays.toString(testStringArray));
        swapInArrayByIndex(testStringArray, index1, index2);
        System.out.println(Arrays.toString(testStringArray));

        System.out.println("----- Task 2 -----");
        /* Написать метод, принимающий строку и один или два индекса (перегрузка).
        Метод должен возвращать подстроку начиная с первого индекса (включительно) и заканчивая вторым индексом (не включительно)
        Если индекс один - начиная с индекса и до конца строки.
        Функционал повторяет метод String.substring(), так что этот метод использовать не нужно.
        Оригинальный метод ломает программу, если введены не корректные индексы. Наш метод аварийно завершать программу не должен. */
        String testString = "Wednesday";
        int index11 = 2, index12 = 5;
//        int index11 = -2, index12 = -5;
//        int index11 = 2, index12 = -5;
//        int index11 = 2, index12 = 15;
//        int index11 = 10, index12 = 12;
        System.out.println(createSubstring(testString, index11, index12));
//        String testString2 = testString.substring(2, 6);
//        System.out.println(testString2);

    } // End of main

    // Methods

    // Task 2
    public static String createSubstring(String str, int index1, int index2) {
        if (str == null) return null;
        if (index1 < 0 || index1 >= index2 || index1 > str.length()) return "";
        if (index2 > str.length()) index2 = str.length();

        char[] charArray = str.toCharArray();
        char[] resultArray = new char[index2 - index1];

        for (int i = index1; i < index2; i++) {
            resultArray[i - index1] = charArray[i];
        }
        String result = new String(resultArray);

        return result;
    }

    // Task2
    public static String createSubstring(String str, int index1) {
        if (str == null) return null;
        int index2 = str.length();
        return createSubstring(str, index1, index2);
    }

    //Task0
    public static String toUpperCaseMy(String str) {
        if (str == null) return null;
        String result = "";

        char[] charArray = str.toCharArray();

        for (int i = 0; i < charArray.length; i++) {
            if (charArray[i] >= 97 & charArray[i] <= 122) {
                charArray[i] = (char) (charArray[i] - 32);
            }
        }
        result = new String(charArray);
        return result;
    }

    // Task 1
    public static void swapInArrayByIndex(int[] arr, int index1, int index2) {
        if (index1 < 0 || index2 < 0) return;
        if (index1 < arr.length && index2 < arr.length) {
            int temp = arr[index1];
            arr[index1] = arr[index2];
            arr[index2] = temp;
        }
    }

    // Task 1
    public static void swapInArrayByIndex(String[] arr, int index1, int index2) {
        if (index1 < 0 || index2 < 0 || index1 >= arr.length || index2 >= arr.length) return;
        String temp = arr[index1];
        arr[index1] = arr[index2];
        arr[index2] = temp;
    }
    // End of methods
}

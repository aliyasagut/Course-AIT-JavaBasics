package homework12;

import java.util.Arrays;

public class Tasks12 {
    public static void main(String[] args) {

        System.out.println(isNumberPrime(47));
        int[] arrayTest = {-10, 0, 7, 12, 11, 1};
        int countPrimeArray = countPrimeNumberArray(arrayTest);
        System.out.println("Простых чисел в массиве " + countPrimeArray);
        System.out.println("----------------");
        String[] strings = {"one", "two1", "three", "fourfive"};
        String[] twoStringArray = createArrayOfSmallAndLongestStringArray(strings);
        System.out.println(Arrays.toString(twoStringArray));

        int[] ints = {2, 3, 4, 5, 6, 7, 8, 9, 10, 11};
        int[] primeInts = createArrayOfPrimeNumbers(ints);
        System.out.println(Arrays.toString(primeInts));


    } // End of main


    // Methods area
    /*
    Написать метод, принимающий на вход массив целых чисел.
    Метод должен вернуть массив, состоящий только из простых чисел, присутствующих в изначальном массиве
    вход -> {0, 13, -25, 11, 31, 55, 98, 11, 5} -> выход {13, 11, 31, 11, 5}
     */
    public static int[] createArrayOfPrimeNumbers(int[] numbers) {
        if (numbers == null) return new int[0];
        int[] resultLong = new int[numbers.length];

        int count = 0;
        for (int value : numbers) {
            if (isNumberPrime(value)) {
                resultLong[count] = value;
                count++;
            }
        }
        int[] resultShort = new int[count];
        for (int i = 0; i < resultShort.length; i++) {
            resultShort[i] = resultLong[i];
        }

//        int[] ints = Arrays.copyOf(resultLong, 3);
        return resultShort;
    }

    /*
    Написать метод, принимающий на вход массив строк.
    Метод должен вернуть массив, состоящий из самой короткой и самой длинной строки изначального массива.
     */
    public static String[] createArrayOfSmallAndLongestStringArray(String[] strings) {
        if (strings == null) return new String[]{};
        String smallestStr = strings[0];
        String longestStr = strings[0];

        for (String str : strings) {
            if (str != null) {
                smallestStr = str;
                longestStr = str;
                break;
            }
        }
        if (smallestStr == null) return new String[]{};

        for (String str : strings) {
            if ((str != null) && (str.length() < smallestStr.length())) {
                smallestStr = str;
            }
            if (str != null && str.length() > longestStr.length()) {
                longestStr = str;
            }
        }
        String[] result = new String[]{smallestStr, longestStr};
        return result;
    }


    /*
    Написать метод принимающий целое число и проверяющий является ли число простым.
    Если является, метод должен вернуть true, не является - false
    */
    public static boolean isNumberPrime(int number) {
        if (number <= 1) return false;
        if (number == 2 || number == 3) return true;
        for (int i = 2; i < number; i++) {
            if (number % i == 0) {
                return false;
            }
        }
        return true;
    }

    /*
    Написать метод, принимающий массив целых чисел. Метод должен вернуть количество простых чисел в массиве.
    Для проверки на "простоту" числа рекомендуется использовать метод из Task 0
    */
    public static int countPrimeNumberArray(int[] array) {
        int countPrime = 0;
        if (array == null || array.length == 0)
            return countPrime; // проверка на существование массив а и элементов в нем
        for (int currentValue : array) {
            if (isNumberPrime(currentValue)) {
                countPrime++;
            }
        }
        return countPrime;
    }

// End of Metod area
}
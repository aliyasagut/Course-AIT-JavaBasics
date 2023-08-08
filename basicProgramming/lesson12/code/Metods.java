import java.util.Arrays;

public class Metods {
    public static void main(String[] args) {
//        powMethod(3);

        int resultFromMethod = powIntMethod(3) + 10;
        System.out.println(resultFromMethod);

        int num = 5;
        System.out.println("Число " + num + " в квадрате = " + squareMethod(num));

        System.out.println("-------------------");
        System.out.println(squareMethod(2.5));
        double squareDouble = squareMethod(4.0);
        System.out.println(squareDouble);
        System.out.println(squareMethod(1.5));

        System.out.println("______________________");
        System.out.println(powIntMethod(-1));

        System.out.println("----------");
        int[] array = {1, 4, 5, -1, 8};
        System.out.println(Arrays.toString(array));

        array = null;
        int minArrayIndex = findMinValue(array);
        System.out.println("Index of min Value in Arrray = " + minArrayIndex);
        System.out.println("min in array: " + (minArrayIndex != -1 ? array[minArrayIndex]: " "));

        System.out.println("--------------------");
        array = new int[]{1, 4, 5, -1, 8};
        System.out.println(Arrays.toString(array));
        if (array!=null && searchNumberInArray(array,100) != -1) {
            array[searchNumberInArray(array, 100)] = 256;
        }
        System.out.println(Arrays.toString(array));


    }

    // Metods area
    // найти элемент в массиве и вернуть его индекс
    public static int searchNumberInArray (int[] arr, int numberForSearch) {
        if (arr == null) return -1;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == numberForSearch) {
                return i;
            }
        }
        return -1;
    }

    // метод определяет есть ли в массиве число х
    public static boolean isNumberInArray (int[] array, int x){
        if (array != null) return false; //проверка на пустоту, в случае null возвращаем false
        for (int value : array){ // ищем совпадения, если нашли, то возврат true, работа метода останавливается
            if (value == x) {
                return true;
            }
        }
        return false;
    }

    public static int findMinValue(int[] array) {
        if (array != null) {
            int minIndex = 0;
            int min = array[0]; // метод, принимающий массив целых чисел и находящий мин значение в массиве
            for (int i = 0; i < array.length; i++) {
                if (array[i] < min) {
                    min = array[i];
                    minIndex = i;
                }
            }
            return minIndex;
        } else {
            return -1;
        }
    }

    public static double squareMethod(double x) {
        return x * x;
    }

    public static int squareMethod(int x) {
        int result = x * x;
        return result;
    }

    public static void powMethod(int x) { // тип метода void ничего не возвращает, только распечатывает
        if (x >= 0) {
            int result = 1;
            for (int i = 0; i < x; i++) {
                result = 2 * result;
            }
            System.out.println("2 в степени " + x + " = " + result);
        } else {
            System.out.println("incorrect datum");
//            System.out.println(Math.pow(2, x));
        }
    }

    public static int powIntMethod(int x) {
        int result = 1; //объявление переменной, в которой будет храниться результат вычисления в главном методе
        // тип этой переменной совпадает с указанным типом возвращаемого значение
        if (x >= 0) {
            for (int i = 0; i < x; i++) {
                result *= 2;
            }
        } else {
            System.out.println(Math.pow(2, x));
            result = (int) Math.pow(2, x);
            // x < 0
        }
        return result; // возвращаем результат вычислений, тип должен соответствовать типу возвращаемого значения метода
    }


    // End of Method area
}

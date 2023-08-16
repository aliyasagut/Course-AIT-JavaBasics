public class ArraysUtil {
    // Метод линейного поиска элемента массива
    // осуществляется перебором всем элементов и сравниванием перебором
    public static int linearSearch(int[] array, int searchValue) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] == searchValue) {
                return i;
            }
        }
        return -1;
    }

    // Метод выводит массив в консоль
    public static void printArray(int[] array) {
        System.out.print("[");
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i]);
            if (i < array.length - 1) {
                System.out.print(", ");
            }
        }
        System.out.println("]\n");
    }

    // Распечатка, формирует результирующую строку
    public static String toString(int[] array) {
        String result = "[";
        for (int i = 0; i < array.length; i++) {
            result += array[i] + (i < array.length - 1 ? ", " : "]");
        }
        return result;
    }

    // Метод возвращает индекс мин значение от всего массиве
    private static int minIndex(int[] arr) {
        int min = arr[0];
        int minIndex = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < min) {
                min = arr[i];
                minIndex = i;
            }
        }
        return minIndex;
    }

    // Метод возвращает индекс макс значение от всего массиве
    private static int maxIndex(int[] arr) {
        int max = arr[0];
        int manIndex = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
                manIndex = i;
            }
        }
        return manIndex;
    }

    // Метод возвращает индекс мин значения
    // от стартового индекса и до конца массива
    private static int minIndex(int[] arr, int startIndex) {
        int min = arr[startIndex];
        int minIndex = startIndex;
        for (int i = startIndex; i < arr.length; i++) {
            if (arr[i] < min) {
                min = arr[i];
                minIndex = i;
            }
        }
        return minIndex;
    }

//    // Добавление еще большоей гибкости в метод
//    private static int minIndex(int[] arr, int startIndex, int endIndex) {
//        int min = arr[startIndex];
//        int minIndex = startIndex;
//        for (int i = startIndex; i < endIndex; i++) {
//            if (arr[i] < min) {
//                min = arr[i];
//                minIndex = i;
//            }
//        }
//        return minIndex;
//    }

    // Сортировка по возрастанию
    public static void sortSelection(int[] array) {

        for (int i = 0; i < array.length - 1; i++) {

            int localMin = minIndex(array, i);

            int temp = array[i];
            array[i] = array[localMin];
            array[localMin] = temp;

        }
    }

    // Бинарный поиск значений в массиве
    public static int binarySearch(int[] array, int searchValue) {
        int startIndex = 0;
        int endIndex = array.length - 1;
        int middleIndex;

        int counter = 0;

        // поверка, что часть массива можно разделить пополам
        while (startIndex <= endIndex) {
            counter++;

            // вычисление индекса середины части массива, в которой производим поиск
            middleIndex = startIndex + (endIndex - startIndex) / 2;

            // сравниваем значения в середине с искомым
            if (array[middleIndex] == searchValue) {
                System.out.println("Найдено за " + counter + " шагов");
                return middleIndex;
            }
            // Если значения не равны -
            // определяем, какую половину массива мы отбросим
            if (array[middleIndex] > searchValue) {
                endIndex = middleIndex - 1;
            } else {
                startIndex = middleIndex + 1;
            }

        }
        // Если цикл while закончен(нет частей массива, кот можно поделить пополам)
        // значит искомое значение отсутствует
        System.out.println("Ничего не найден! Шагов сделано " + counter);
        System.out.println("StartIndex = " + startIndex + "; EndIndex = " + endIndex);
        return -1;
    }


}

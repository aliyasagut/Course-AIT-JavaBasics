import java.util.Arrays;

public class RubberArray2 {

    private int[] array;

    public RubberArray2() { //конструктор
        this.array = new int[0];
    }

//    public RubberArray2(int[] arr) { // Ошибка, так как передаем ссылку
//        this.array = arr;
//    }

//    public RubberArray2(int[] arr) {  // Var 1.   конструктор, принимающий массив и делающий из него RubberArray
//        this.array = new int[arr.length];
//        for (int i = 0; i < arr.length; i++) {
//            array[i] = arr[i];
//        }
//    }

//    public RubberArray2(int[] arr) {  // Var 2.   конструктор, принимающий массив и делающий из него RubberArray
//        this.array = Arrays.copyOf(arr, arr.length);
//    }

    public RubberArray2(int[] arr) {  // Var 3.   конструктор, принимающий массив и делающий из него RubberArray
        this();
        add(arr);
    }

    public void add(int value) { // добавление элемента в массив
        extractArray();
        array[array.length - 1] = value;
    }

    public void add(int... ints) { // добавление нескольких элементов int в массив
        for (int value : ints) {
            add(value);
        }
    }

    private void extractArray() { // расширение массива на 1 ячейку
        array = Arrays.copyOf(array, array.length + 1);
    }

    public void printArray() { // вывести в консоль все значения массива
        System.out.print("[");
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i]);
            if (i < array.length - 1) {
                System.out.print("; ");
            }
        }
        System.out.println("]");
        System.out.println();
    }

    public int size() { // возвращает количество элементов массива
        return array.length;
    }

    public int sumOfValues() { //возвращает сумму значений в массиве
        int sum = 0;
        for (int value : array) {
            sum += value;
        }
        return sum;
    }

    public int min() { // возвращает мин значение массива
        if (array.length == 0) return Integer.MIN_VALUE;
        int min = array[0];
        for (int value : array) {
            if (value < min) {
                min = value;
            }
        }
        return min;
    }

    public int max() { // возвращает макс значение массива
        if (array.length == 0) return Integer.MAX_VALUE;
        int max = array[0];
        for (int value : array) {
            if (value > max) {
                max = value;
            }
        }
        return max;
    }

    public int[] toArray() { // возвращает копию массива
//        return Arrays.copyOf(array, array.length);
        int[] result = new int[array.length];
        for (int i = 0; i < result.length; i++) {
            result[i] = array[i];
        }
        return result;
    }

    public void deleteByIndex(int index) { // удаляет элемент массива по индексу
        if (array.length >= 1 && index >= 0 && index < array.length) {
            int[] result = new int[array.length - 1];
            for (int i = 0; i < result.length; i++) {
                if (i < index) {
                    result[i] = array[i];
                } else { //if (i >= index) {
                    result[i] = array[i + 1];
                }
            }
//            System.out.println("Result " + Arrays.toString(result));
            array = result;
        }
    }

    public boolean deleteByValue(int value) { // удаление по индексу
        int index = searchByValue(value);
        if (index != -1) {
            deleteByIndex(index);
            return true;
        }
        return false;
    }

    public int deleteAllByValue(int value) { // удаление всех элементов по значению
        int count = 0;
        while (deleteByValue(value)) {
            count++;
        }
        return count;
    }

    public int searchByValue(int val) { // возвращает индекс, поиск по значению
        for (int i = 0; i < array.length; i++) {
            if (array[i] == val) {
                return i;
            }
        }
        return -1;
    }

    public int searchByIndex(int index) { //  возвращает значение по индексу
        if (index < 0 || index > array.length) return Integer.MIN_VALUE;
        return array[index];
    }

    public void changeValueByIndex(int index, int value) { // заменяет по индексу значение в массиве на другое
        if (index >= 0 & index < array.length) {
            array[index] = value;
        }
    }

    public void changeValueByValue(int oldValue, int newValue) { // замена значения по значению
        int index = searchByValue(oldValue);
        changeValueByIndex(index, newValue);
    }
}

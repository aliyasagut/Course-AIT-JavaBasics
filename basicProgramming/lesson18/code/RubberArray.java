import java.util.Arrays;

public class RubberArray {

    private int[] array;

    public RubberArray() { //конструктор
        this.array = new int[0];
    }

    public RubberArray(int[] arr) {  // конструктор, принимающий массив и делающий из него RubberArray
        this.array = arr;
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

    public void extractArray() { // расширение массива на 1 ячейку
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

    public void deleteByValue(int value) { // поиск элемента по значению. потом удаление по индексу
        int index = searchByValue(value);
        if (index != -1) {
            deleteByIndex(index);
        }
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

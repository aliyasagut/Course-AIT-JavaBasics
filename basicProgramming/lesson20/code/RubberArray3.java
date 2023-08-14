import java.util.Arrays;

public class RubberArray3 {

    private int[] array;
    int cursor;

    static final int MULTIPLIER = 2;

    public RubberArray3() { //конструктор
        this.array = new int[10];
        cursor = 0;
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

    public RubberArray3(int[] arr) {  // Var 3.   конструктор, принимающий массив и делающий из него RubberArray
        this();
        add(arr);
    }

    public void add(int value) { // добавление элемента в массив
        if (isArrayFull()) {
            extractArray();
        }
        array[cursor] = value;
        cursor++;
        System.out.println("Добавлен элемент " + value);
    }

    public void add(int... ints) { // добавление нескольких элементов int в массив
        for (int value : ints) {
            add(value);
        }
    }

    private boolean isArrayFull() {
        return cursor == array.length - 1;
    }

    private void extractArray() { // расширение массива на 1 ячейку
        System.out.println("Расширяем внутренний массив!");
        array = Arrays.copyOf(array, array.length * MULTIPLIER);
    }

    public void printArray() { // вывести в консоль все значения массива
        System.out.print("[");
        for (int i = 0; i < cursor; i++) {
            System.out.print(array[i]);
            if (i < cursor - 1) {
                System.out.print("; ");
            }
        }
        System.out.println("]");
        System.out.println();
    }

    public void printFullArray() { // вывести в консоль все значения массива
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

    public int size() { // возвращает положение курсора
        return cursor;
    }

    public int length() {
        return array.length;
    }

    public int sumOfValues() { //возвращает сумму значений в массиве
        int sum = 0;
        for (int i = 0; i < cursor; i++) {
            sum += array[i];
        }
        return sum;
    }

    public int min() { // возвращает мин значение массива
        if (cursor == 0) return Integer.MIN_VALUE;
        int min = array[0];
        for (int i = 0; i < cursor; i++) {
            if (array[i] < min) {
                min = array[i];
            }
        }
        return min;
    }

    public int max() { // возвращает макс значение массива
        if (cursor == 0) return Integer.MAX_VALUE;
        int max = array[0];
        for (int i = 0; i < cursor; i++) {
            if (array[i] > max) {
                max = array[i];
            }
        }
        return max;
    }

    public int[] toArray() { // возвращает копию массива
//        return Arrays.copyOf(array, array.length);
        int[] result = new int[cursor];
        for (int i = 0; i < cursor; i++) {
            result[i] = array[i];
        }
        return result;
    }

    public void deleteByIndex(int index) { // удаляет элемент массива по индексу
        if (cursor >= 1 && index >= 0 && index < cursor) {

            for (int i = index; i < cursor; i++) {
                array[i] = array[i + 1];
            }
            cursor--;
        }
    }

    public boolean deleteByValue(int value) { // удаление по индексу
        int index = searchByValue(value);
        if (index < 0) return false;
        deleteByIndex(index);
        return true;
    }

    public int deleteAllByValue(int value) { // удаление всех элементов по значению
        int count = 0;
        while (deleteByValue(value)) {
            count++;
        }
        return count;
    }

    public int searchByValue(int val) { // возвращает индекс, поиск по значению
        for (int i = 0; i < cursor; i++) {
            if (array[i] == val) {
                return i;
            }
        }
        return -1;
    }

    public int getValueByIndex(int index) { //  возвращает значение по индексу
        if (isIndexIncorrect(index)) return Integer.MIN_VALUE;
        return array[index];
    }

    public boolean changeValueByIndex(int index, int value) { // заменяет по индексу значение в массиве на другое
        if (isIndexIncorrect(index)) return false;
        array[index] = value;
        return true;
    }

    private boolean isIndexIncorrect(int index) {
        return !(index >= 0 && index < cursor);
    }

    public void changeValueByValue(int oldValue, int newValue) { // замена значения по значению
        int index = searchByValue(oldValue);
        changeValueByIndex(index, newValue);
    }
}

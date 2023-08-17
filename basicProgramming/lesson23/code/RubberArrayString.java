import java.util.Arrays;

public class RubberArrayString {
    private String[] array;
    private int cursor;

    static final int MULTIPLIER = 2;

    public RubberArrayString() { //конструктор
        this.array = new String[10];
        cursor = 0;
    }
    public RubberArrayString(String[] arr) {  // Var 3.   конструктор, принимающий массив и делающий из него RubberArray
        this();
        add(arr);
    }

    public void add(String value) { // добавление элемента в массив
        if (isArrayFull()) {
            extendArray();
        }
        array[cursor] = value;
        cursor++;
        System.out.println("Добавлен элемент " + value);
    }
    public void add(String... Strings) { // добавление нескольких элементов int в массив
        for (String value : Strings) {
            add(value);
        }
    }
    private boolean isArrayFull() {
        return cursor == array.length - 1;
    }
    private void extendArray() { // расширение массива на 1 ячейку
        System.out.println("Расширяем внутренний массив!");
        array = Arrays.copyOf(array, array.length * RubberArray3.MULTIPLIER);
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
    public String[] toArray() { // возвращает копию массива
        String[] result = new String[cursor];
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
    public boolean deleteByValue(String value) { // удаление по индексу
        int index = searchByValue(value);
        if (index < 0) return false;
        deleteByIndex(index);
        return true;
    }
    public int deleteAllByValue(String value) { // удаление всех элементов по значению
        int count = 0;
        while (deleteByValue(value)) {
            count++;
        }
        return count;
    }
    public int searchByValue(String val) { // возвращает индекс, поиск по значению
        for (int i = 0; i < cursor; i++) {
            if (array[i] == val) {
                return i;
            }
        }
        return -1;
    }
    public String getValueByIndex(int index) { //  возвращает значение по индексу
        if (isIndexIncorrect(index)) return "";
        return array[index];
    }
    public boolean changeValueByIndex(int index, String value) { // заменяет по индексу значение в массиве на другое
        if (isIndexIncorrect(index)) return false;
        array[index] = value;
        return true;
    }
    private boolean isIndexIncorrect(int index) {
        return !(index >= 0 && index < cursor);
    }
    public void changeValueByValue(String oldValue, String newValue) { // замена значения по значению
        int index = searchByValue(oldValue);
        changeValueByIndex(index, newValue);
    }

}

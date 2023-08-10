import java.util.Arrays;

public class Lesson18 {
    public static void main(String[] args) {

        RubberArray ra = new RubberArray();

        ra.printArray(); // массив пустой
        System.out.println("Min in Array " + ra.min()); // Min в пустом Array -2147483648

        ra.add(10);
        ra.add(25);
        ra.add(-20); // добавили в массив значения
        ra.printArray(); // [10; 25; -20]

        int arSize = ra.size();
        System.out.println("Сейчас в массиве элементов: " + arSize); //Сейчас в массиве 3 элемента
        System.out.println("Sum of all values in array: " + ra.sumOfValues()); // сумма 15

        ra.add(7, 14, -21); // добавили еще элементы
        ra.printArray(); // [10; 25; -20; 7; 14; -21]

        System.out.println("Min in Array " + ra.min()); // -21
        System.out.println("Max in Array " + ra.max()); // 25

        int[] newArray = ra.toArray(); // сделали копию
        newArray[0] = 10_000; // обозначили в копии первый элемент = 10_000
        System.out.println(Arrays.toString(newArray)); // [10000, 25, -20, 7, 14, -21]

        ra.printArray(); // [10; 25; -20; 7; 14; -21]

        System.out.println("===== Удаление по индексу =====");
        ra.deleteByIndex(3); // удалили третий элемент
        ra.printArray(); // [10; 25; -20; 14; -21]

        System.out.println("===== Удаление по значению =====");
        ra.deleteByValue(21); // [10; 25; -20; 14; -21]
        ra.printArray();
        ra.deleteByValue(25); // [10; -20; 14; -21]
        ra.printArray();

        System.out.println("===== Поиск по значению =====");
        System.out.println(ra.searchByValue(-20)); // 1

        System.out.println("===== Возвращение значения по индексу =====");
        System.out.println(ra.searchByIndex(2)); // 14

        System.out.println();
        ra.add(15, 67, -98);
        ra.printArray(); // [10; -20; 14; -21; 15; 67; -98]

        System.out.println("===== Замена значения по индексу =====");
        ra.changeValueByIndex(1, 100);
        ra.printArray(); // [10; 100; 14; -21; 15; 67; -98]

        System.out.println("===== Замена значения по значению =====");
        ra.changeValueByValue(14, 41);
        ra.printArray(); // [10; 100; 41; -21; 15; 67; -98]

        System.out.println("===== Новый конструктор =====");
        int[] ints = {1, 2, 3, 4, 5};
        RubberArray rubberArray = new RubberArray(ints);

        rubberArray.printArray(); // [1; 2; 3; 4; 5]
        rubberArray.add(6, 7, 8);
        rubberArray.printArray(); // [1; 2; 3; 4; 5; 6; 7; 8]

    }
}

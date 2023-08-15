import java.util.Arrays;

public class Lesson21 {

    public static void main(String[] args) {

        int[] ints = {34, 21, 67, 41, 10, 5, 0, 87, 99, 38, 57, 3, 77};

        System.out.println(ints.length);
        System.out.println(ArraysUtil.linearSearch(ints, 41));
        System.out.println(ArraysUtil.linearSearch(ints, 100));

        System.out.println("До сортировки");
        System.out.println(Arrays.toString(ints));

        ArraysUtil.sortSelection(ints);

        System.out.println("После сортировки");
        System.out.println(Arrays.toString(ints));

        int numberForSearch = 38;
        int idx= ArraysUtil.binarySearch(ints, numberForSearch);
        System.out.println("Индекс числа "+numberForSearch+ " равно "+idx);



    }
}

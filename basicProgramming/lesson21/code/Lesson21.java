import java.util.Arrays;
import java.util.Random;

public class Lesson21 {

    public static void main(String[] args) {

        int[] ints = {3, 6, 2, 99, 34, 21, 67, 41, 10, 5, 0, 87, 99, 38, 57, 3, 77, 100, 7, 11};

        System.out.println("Длина массива: " + ints.length);
        System.out.println("Индекс числа 41: " + ArraysUtil.linearSearch(ints, 41));
        System.out.println("Индекс числа 100: " + ArraysUtil.linearSearch(ints, 100));

        System.out.println("До сортировки");
        ArraysUtil.printArray(ints);
        System.out.println(ArraysUtil.toString(ints) + "\n");

        ArraysUtil.sortSelection(ints);

        System.out.println("После сортировки");
        ArraysUtil.printArray(ints);
        System.out.println(ArraysUtil.toString(ints) + "\n");

        int numberForSearch = 6;
        int idx = ArraysUtil.binarySearch(ints, numberForSearch);
        System.out.println("Индекс числа " + numberForSearch + " равно " + idx);


        int[] testArray = new int[100000];
        Random random = new Random();
        for (int i = 0; i < testArray.length; i++) {
            testArray[i] = random.nextInt(1000);
        }

        ArraysUtil.sortSelection(testArray);

        numberForSearch = 250;
        idx = ArraysUtil.binarySearch(testArray, numberForSearch);
        System.out.println("Индекс числа " + numberForSearch + " равно " + idx);

    }
}

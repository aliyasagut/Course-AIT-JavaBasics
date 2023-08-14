import java.util.Arrays;

public class MainArrayDemo {

    public static void main(String[] args) {

        RubberArray3 rubberArray = new RubberArray3();

        rubberArray.add(10, 11, 15);

        rubberArray.printArray();
        System.out.println(rubberArray.length());
        System.out.println(rubberArray.size());

        System.out.println("--------------------");
        System.out.println();

        rubberArray.add(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        rubberArray.printArray();
        System.out.println(rubberArray.length());
        System.out.println(rubberArray.size());

        System.out.println(Arrays.toString(rubberArray.toArray()));

        System.out.println(RubberArray3.MULTIPLIER);


        System.out.println("--------------------------------");
        rubberArray.printFullArray();
        rubberArray.deleteByIndex(2);
        rubberArray.printArray();
        rubberArray.printFullArray();

        System.out.println(rubberArray.getValueByIndex(15));
        rubberArray.changeValueByIndex(15,100);
        rubberArray.printArray();

        System.out.println("============ MIN & MAX & SUM ============");

        System.out.println("Min in Array: " + rubberArray.min());
        System.out.println("Max in Array: " + rubberArray.max());
        System.out.println("Sum of values: " + rubberArray.sumOfValues());

    }
}

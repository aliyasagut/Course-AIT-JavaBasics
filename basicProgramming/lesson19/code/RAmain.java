import java.util.Arrays;

public class RAmain {
    public static void main(String[] args) {

        int[] ints = {0, 1, 2, 3, 4, 5, 6};

        RubberArray2 rubberArray = new RubberArray2(ints);
        ints[0] = 1000;
        System.out.println(Arrays.toString(ints));
        rubberArray.printArray();
    }
}

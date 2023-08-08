import java.util.Arrays;

public class ArraysCase {
    public static void main(String[] args) {

        int[] array; //1 option
        // int array2[]; //2 option, not recommended
        array = new int[5];

        int a = 10;

        int[] array2 = new int[10];// 0
        int[] array3 = new int[a];

        char[] chars = new char[5]; //0 - default

        String[] strings = new String[7];//null;
        String str = null;
        boolean[] booleans = new boolean[100]; //false

        String[] string1 = {"one", "two", "three"};

        int[] numbers123 = new int[5]; // это неявное объявление массива
        int[] numbers = new int[]{1, 5, -16, 25, 9}; // это явное объявление массива, более предпочтительно писать так
        int[] numbers2;
        numbers2 = new int[]{1, 5, -16, 25, 9};

        int[] myArray = {1, 5, -16, 25, 15845};
        int digitIndex1 = myArray[1];
        System.out.println("digitIndex1 " + digitIndex1);
        myArray[1] = 10;
        int digitIndex1New = myArray[1];
        System.out.println("new digitIndex1 " + digitIndex1New);
        System.out.println("new digitIndex1 " + myArray[1]);

        int lengthArray = myArray.length;
        System.out.println("Array length: " + lengthArray);

        System.out.println("-----------чтобы пройтись по элементам массива---------");
        int counter = 0;
        while (counter < myArray.length) {
            if (myArray[counter] % 2 == 0) {
                System.out.println("четное число из массива: " + counter + ": " + myArray[counter]); // myarray[0]
            }
            counter++;
        }
        System.out.println(myArray); // [I@6108b2d7
        System.out.println(Arrays.toString(myArray)); //[1, 10, -16, 25, 15845]
        System.out.println(Arrays.toString(string1)); //[one, two, three]


//        System.out.println("---------------------");
//        String string = "Abcdef";
//        int stringCounter = 0;
//        while (stringCounter < string.length()-1) {
//            System.out.println(string.charAt(stringCounter));
//            stringCounter++;
//        }

        System.out.println("------------------------------");
        int[] myArraySecond = {55, -15, 543, 10, 17, 56, 101, 0, 145};
        int[] arraySubArray = Arrays.copyOf(myArraySecond, 4);
        int[] copyOfMyArray = Arrays.copyOf(myArraySecond, myArraySecond.length);
        System.out.println(Arrays.toString(arraySubArray));

        int[] arraySubArray2 = Arrays.copyOfRange(myArraySecond, 4, 7);
        int[] arraySubArray3 = Arrays.copyOfRange(myArraySecond, 4, 7);
        int[] arraySubArray4 = Arrays.copyOfRange(myArraySecond, 4, 100);
        System.out.println("arraySubArray2 " + Arrays.toString(arraySubArray2));
        System.out.println("arraySubArray3 " + Arrays.toString(arraySubArray3));
        System.out.println("arraySubArray4 " + Arrays.toString(arraySubArray4)); // [17, 56, 101, 0, 145, 0, 0, 0....] -> new int [100-4]
        System.out.println(arraySubArray4.length);
        System.out.println(arraySubArray2 == arraySubArray3);
        System.out.println(Arrays.equals(arraySubArray2, arraySubArray3));

        System.out.println("--------------");
        System.out.println("myArraySecond " + Arrays.toString(myArraySecond));
        Arrays.sort(myArraySecond, 2, 6);
        System.out.println("myArraySecond " + Arrays.toString(myArraySecond));
        Arrays.sort(myArraySecond);
        System.out.println("myArraySecond " + Arrays.toString(myArraySecond));

        System.out.println("copy of array " + Arrays.toString(copyOfMyArray));


    }
}


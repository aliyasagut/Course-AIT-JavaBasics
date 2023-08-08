import java.util.Arrays;

public class MethodVoid {
    public static void main(String[] args) {
        sayHello();

        char chSymbol = 'A';
//        System.out.println((int) chSymbol);

        printDecimalCodeOfChar(chSymbol); // А это аргумент (конкретное значение), он передается в параметр метода

        int[] arrays = {44, 54, 13, 66, 35, 21};
        System.out.println("Arrays print: " + Arrays.toString(arrays));
        System.out.print("My method: ");
        printArray(arrays);

        printIfDigitPrime(6);

        System.out.println("-----------------------------");
        int[] array = {13, 43, 55, 19, 22, 65, -2, -13, 0, 4, 5};
//        for (int i = 0; i < array.length; i++) {
//            int element = array[i];
//            printIfDigitPrime(element);
//        }

        for (int element : array) {
            printIfDigitPrime(element);
        }

        System.out.println("________For each loop___________");
        String[] strings = {"one", "two", "three"};

        for (String str : strings) {
            System.out.println(str);
        }
        System.out.println("---------------");
        printNumbers(10);
        printNumbers(2, 7);

        printNumbers(3, "yahoo ");

        printArray(array);


    }

    //Methods area
    public static void printAllArray (int[] array){
        for (int el : array) {
            printIfDigitPrime(el);
        }
    }
    public static void printNumbers(int n) {
        // метод выводящий на экран числа от 1 до n
        sayHello();
        printNumbers(1, n);
//        for (int i = 1; i <= n; i++) {
//            System.out.print(i + " ");
//        }
//        System.out.println();
    }

    public static void printNumbers(int x, int y) {
        // метод выводящий на экран числа от x до y
        for (int i = x; i <= y; i++) {
            System.out.print(i + " ");
        }
        System.out.println();
    }

    public static void printNumbers(int count, String str) {
        for (int i = 0; i < count; i++) {
            System.out.println(str);
        }
    }

    public static void printIfDigitPrime(int x) {
        // написать метод, принимающий число. Вывести на экран надись: число является/ не является постым
        boolean isPrime = true;
        if (x == 1 || x <= 0) {
            isPrime = false;
        }
        for (int j = 2; j < x; j++) {
            if (x % j == 0) {
                isPrime = false;
                break;
            }
        }
        if (isPrime) {
            System.out.println("Число " + x + " является простым");
        } else {
            System.out.println("Число " + x + " не является простым");
        }
    }


    public static void printArray(int[] array) {
        if (array != null) { // проверка на null. В противном случае - программа завершится ошибкой
            System.out.print("[");
            for (int i = 0; i < array.length; i++) {
                System.out.print(array[i] + ((i == array.length - 1) ? "" : ", "));
            }
            System.out.print("]");
            System.out.println();
        }
    }

    public static void sayHello() {
        System.out.println("Hello!");
    }

    public static void printDecimalCodeOfChar(char charName) { // charName это пааметр метода, то, что в него передается
        System.out.println((int) charName);
    }
}

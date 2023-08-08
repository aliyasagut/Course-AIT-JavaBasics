package homework11;

public class Task1 {
    /*
    Написать метод, принимающий на вход целое число. Метод должен вывести на экран 2 в степени этоЧисло
     */
    public static void main(String[] args) {
        printDegree(-1);
    }

    // Method area
    public static void printDegree(int n) {
        if (n >= 0) {
            int result = 1;
            for (int i = 0; i < n; i++) {
                result = 2 * result;
            }
            System.out.println("2 в степени " + n + " = " + result);
        } else {
            System.out.println("incorrect datum");
            System.out.println(Math.pow(2, n));
        }
    }
}

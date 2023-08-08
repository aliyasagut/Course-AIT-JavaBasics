package homework08;

public class Task2 {
    /*
    Распечатать только 7 чисел от 1 до 100, которые делятся на 5 без остатка. Используем цикл while
     */
    public static void main(String[] args) {
        int counter = 0;
        int num = 1;

        while (num <= 100 & counter < 7) {
            if (num % 5 == 0) {
                System.out.println(num);
                counter++;
            }
            num++;
        }
        System.out.println("Cycle is finished");
    }
}

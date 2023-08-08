package homework06;

import java.util.Random;

public class Task1 {
    /*
    Запишите в 4 переменные случайные числа от 0 до 100
    Выведите все 4 на экран
    Программа должна определить максимальное из этих четырех чисел
    Результат вывести на экран
     */

    public static void main(String[] args) {
        Random random = new Random();
        int int1 = random.nextInt(100);
        int int2 = random.nextInt(100);
        int int3 = random.nextInt(100);
        int int4 = random.nextInt(100);

        System.out.println("1: " + int1 + " 2: " + int2 + " 3: " + int3 + " 4: " + int4);

        if (int1 > int2 && int1 > int3 && int1 > int4) {
            System.out.println("Максимальное число: " + int1);
        } else if (int2 > int1 && int2 > int3 && int2 > int4) {
            System.out.println("Максимальное число: " + int2);
        } else if (int3 > int1 && int3 > int2 && int3 > int4) {
            System.out.println("Максимальное число: " + int3);
        } else if (int4 > int1 && int4 > int2 && int4 > int3) {
            System.out.println("Максимальное число: " + int4);
        }
    }
}


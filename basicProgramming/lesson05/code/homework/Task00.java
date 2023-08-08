package homework;

import java.util.Random;

public class Task00 {
    public static void main(String[] args) {

        /*
        Task 00
Создайте 10 переменных типа int.
Присвойте каждой случайное значение от 0 до 20
Для каждой переменной выведите строку в формате:
Число: 6 четное: true, кратно 3: true, четное и кратное 3: true
Число: 3 четное: false, кратно 3: true, четное и кратное 3: false
(опционально) - учесть, что случайное число может оказаться 0
         */

        Random random = new Random();

        int var1 = random.nextInt(20);
        int var2 = random.nextInt(20);
        int var3 = random.nextInt(20);
        int var4 = random.nextInt(20);
        int var5 = random.nextInt(20);
        int var6 = random.nextInt(20);
        int var7 = random.nextInt(20);
        int var8 = random.nextInt(20);
        int var9 = random.nextInt(20);
        int var10 = random.nextInt(20);

        /*int a = var1 % 2;
        int b = var1 % 3;
        boolean var1Bool2 = a == 0;
        boolean var1Bool3 = b == 0;
        boolean var1Bool23 = var1Bool2 && var1Bool3;
        System.out.println("Число: " + var1 + " четное: " + var1Bool2 + ", кратно 3: " + var1Bool3 + ", четное и кратное 3: " + var1Bool23);

        int a2 = var2 % 2;
        int b2 = var2 % 3;
        boolean var2Bool2 = a2 == 0;
        boolean var2Bool3 = b2 == 0;
        boolean var2Bool23 = var2Bool2 && var2Bool3;
        System.out.println("Число: " + var2 + " четное: " + var2Bool2 + ", кратно 3: " + var2Bool3 + ", четное и кратное 3: " + var2Bool23);
*/
        System.out.println(checkNumber(var1));
        System.out.println(checkNumber(var2));
        System.out.println(checkNumber(var3));
        System.out.println(checkNumber(var4));
        System.out.println(checkNumber(var5));

        System.out.println(checkNumber(0));

    }

    public static String checkNumber(int x) {
        boolean b1 = (x != 0) && (x % 2 == 0);
        boolean b2 = (x != 0) && (x % 3 == 0);
        boolean b3 = b1 && b2;
        String resultString = "Число: " + x + " четное: " + b1 + ", кратно 3: " + b2 + ", четное и кратное 3: " + b3;

        return resultString;

    }

}





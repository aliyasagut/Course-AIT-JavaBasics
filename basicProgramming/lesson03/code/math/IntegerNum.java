package math;

public class IntegerNum {
    public static void main(String[] args) {
        System.out.println("Mathematics");

        int x = 20;
        int y = 10;

        int z = x - y; // это присвокние, а не "равенство" как было в школе
        System.out.println("z = x - y " + z); // в ковычках этл текстовое оформление и сопровождение

        z = x * y;
        System.out.println("z = x * y " + z);

        int a = 57;
        int b = 10;

        // деление целых чисел

        int c = a / b;
        System.out.println("Division " + a + " / " + b + " = " + c); //целочисленное деление

        int d = a % b;
        System.out.println("Division " + a + " % " + b + " = " + d); //целочисленное деление с остатком

        int n = 60 % 12; //хотим увидеть остаток от деления
        System.out.println("60 % 12 = " + n);


        System.out.println("======= Вещественные числа =========");

        double f = 10.0d;
        double g = 9.8;
        double e = f / g;
        System.out.println("Result " + f + " / " + g + " = " + e);

        // форматированные вывод
        System.out.printf("Result: %.2f ", e);

        // преобразование типов
        int num1 = 10;
        int num2 = 3;

        double d1 = (double) num1 / (double) num2; // явное преобразование int в double
        System.out.println();
        System.out.println(d1);

        int num3 = (int) d1; // преобразование типа
        System.out.println(num3);

        System.out.println("====== Метода класса Math ========");

        double r = 10;
        double length = 2 * Math.PI * r; //длина окружности
        System.out.println("Length of circle is : " + length);

        double area =  Math.PI * Math.pow(r, 2); // pi * r v kvadrate = area of circle
        System.out.println("Area of circle is : " + area);

        System.out.println("======= инкрементт  и декремент ========");
        int i = 0;

        ++i; // префиксная форма увеличения на 1
        System.out.println("i = " + i);

        i++; // постфиксная форма увеличение на 1
        System.out.println("i = " + i);

        //+=, -=, *=, /=
        //провести эксперименты и прочитать в статьях




    }
}

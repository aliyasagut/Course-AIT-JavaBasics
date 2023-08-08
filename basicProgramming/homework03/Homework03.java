public class Homework03 {
    public static void main(String[] args) {

        System.out.println("===== Задача 1 =====");
        int num1 = 0, num2 = 1, num3 = 2, num4 = 3, num5 = 4, num6 = 5, num7 = 6, num8 = 7, num9 = 8, num10 = 9;
        int summa = num1 + num2 + num3 + num4 + num5 + num6 + num7 + num8 + num9 + num10;
        int arithmeticMean = summa / 10;
        System.out.println("Сумма чисел равна " + summa);
        System.out.println("Среднее арифметическое значение чисел от 0 до 9 это " + arithmeticMean);
        int remainder = summa % 10;
        System.out.println("Остаток от деления равен " + remainder);
        double dropRest = ((double) summa / 10) - arithmeticMean;
        System.out.println(dropRest);
        //double dropRest2 = (double) arithmeticMean / 10;
        //System.out.println(dropRest2);

        System.out.println("===== Задача 2 =====");
        double productA = 1000.0, productB = 500.0;

        int discount = 10;

        double sumWithoutDisc = productA + productB;
        double priceWithoutDisc = sumWithoutDisc * (double) (100 - discount) / 10;
        System.out.println(priceWithoutDisc);
        double discountMoney = sumWithoutDisc * discount /100;
        double sumWithDisc = sumWithoutDisc - discountMoney;
        System.out.println("Prici without disc " + sumWithoutDisc);
        System.out.println("Discount " + discountMoney);
        System.out.println("Price with disc " + sumWithDisc);


        System.out.println("===== Задача 3 =====");
        int tMon = 24, tTue = 23, tWed = 24, tThu = 28, tFri = 25, tSat = 22, tSun = 21;
        double averageTemp = (tMon + tTue + tWed + tThu + tFri + tSat + tSun) / 7;
        System.out.printf("Средняя температура за неделю %.2f and %.3f", averageTemp, averageTemp);


        System.out.println();
        System.out.println("===== Задача 4 =====");
        int a = 7 % 2;
        int b = 11 % 3;
        System.out.println("7 % 2 = " + a);
        System.out.println("11 % 3 = " + b);

        System.out.println("===== Задача 5 =====");
        int x = 3;
        x++; // увеличение на 1
        System.out.println(x);
        int y = 2;
        y += x; // присваивание x к y
        System.out.println(y);


    }
}
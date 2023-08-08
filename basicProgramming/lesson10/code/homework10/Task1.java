package homework10;

import java.util.Scanner;

public class Task1 {
    /*
    За каждый месяц банк начисляет к сумме вклада 7% от суммы.
    Напишите консольную программу, в которую пользователь вводит сумму вклада и количество месяцев.
    А банк вычисляет конечную сумму вклада с учетом начисления процентов за каждый месяц.
    Для вычисления суммы с учетом процентов используйте цикл for.

    Пусть сумма вклада будет представлять тип float.

    Введите сумму вклада: 100
    Введите срок вклада в месяцах: 1
    После 1 месяцев сумма вклада составит 107,00
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите сумму вклада: ");
        float deposit = scanner.nextFloat();
        System.out.println("Введите срок вклада в месяцах: ");
        int months = scanner.nextInt();
        float finalDeposit = deposit;

        for (int i = 0; i < months; i++) {
            finalDeposit = (float) (finalDeposit * 1.07);
        }

        System.out.println("Ваша сумма вклада: " + deposit);
        System.out.println("Cрок вклада в месяцах: " + months);
        System.out.println("После " + months + " месяцев сумма вклада составит " + finalDeposit);
    }
}

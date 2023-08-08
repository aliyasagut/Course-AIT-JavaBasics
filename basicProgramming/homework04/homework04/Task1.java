package homework04;

public class Task1 {
    /* Task 01
    -Создайте переменную с типом String, в которой будет хранится ВАше имя.
    -Сколько букв в вашем имени? Выведите значение на экран
    -Создайте две переменные типа char. Одной присвойте первый символ имени, второй - последний символ
    -Выведите на экран десятичный код первого и последнего символа вашего имени */

    public static void main(String[] args) {
        String myName = "Aliia";
        int length = myName.length();
        System.out.println("In the name Aliia " + length + " simbols");
        char firstLetter = myName.charAt(0);
        char lastLetter = myName.charAt(myName.length()-1);
        System.out.println("First letter is " + firstLetter);
        System.out.println("Last letter is " + lastLetter);
        int x = firstLetter;
        System.out.println("десятичный код первого символа имени: " + x);
        int y = lastLetter;
        System.out.println("десятичный код последнего символа имени: " + y);
    }
}

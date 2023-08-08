package homework04;

public class Task2 {
    /*
    Создайте строки:
"Java", "is", "a", "powerful", "language"
Из созданных строк склейте двумя разными способами строку: "Java is a powerful language"
Распечатать эту строку и ее длину

Task 02.2
Заменить в результирующей строке слово "powerful" на "super".
Содержит ли строка подстроку "age"? Создайте переменную boolean типа c ответом
     */

    public static void main(String[] args) {
        String a1 = "Java";
        String a2 = "is";
        String a3 = "a";
        String a4 = "powerful";
        String a5 = "language";

        String a6 = a1 + " " + a2 + " " + a3 + " " + a4 + " " + a5;
        System.out.println("1: " + a6);

        String a7 = String.join(" ", a1, a2, a3, a4, a5);
        System.out.println("2: " + a7);

        String substring = a7.substring(10, 18);
        System.out.println(substring);

        String a8 = a7.replace(substring, "super");
        System.out.println(a8);

        System.out.println("длина строки: " + a8.length());

        String a9 = "age";
        System.out.println(a7.contains(a9));




    }
}

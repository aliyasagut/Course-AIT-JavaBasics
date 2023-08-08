package homework04;

public class Task3 {
    /*
    Даны строки разной длины (длина - четное число)
"string"
"code"
"Practice"
Необходимо распечатать два средних символа строки. Например, если дана строка "string" - результат будет "ri",
для строки "code" результат "od",
для "Practice" результат "ct".
     */

    public static void main(String[] args) {
        String str1 = "string12", str2 = "code", str3 = "Practice";

//        int l1 = str1.length();
//        String sub1 = str1.substring(l1 / 2 - 1, l1 / 2 + 1);
//        System.out.println(sub1);
//
//        int l2 = str2.length();
//        String sub2 = str2.substring(l2 / 2 - 1, l2 / 2 + 1);
//        System.out.println(sub2);

//        int l3 = str3.length();
//        String sub3 = str3.substring(l3 / 2 - 1, l3 / 2 + 1);
//        System.out.println(sub3);

        middleChars(str1);
        middleChars(str2);
        middleChars(str3);
    }

    public static String middleChars(String str) {
        String result = "";
        int length = str.length();
        int startIndex = length / 2 - 1;
        result = str.substring(startIndex, startIndex + 2);
        System.out.println("Middle symbols of the word " + str + " = " + result);

        return result;
    }
}

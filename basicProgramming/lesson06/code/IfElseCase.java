import java.util.Random;
import java.util.Scanner;

public class IfElseCase {
    public static void main(String[] args) {

//        int x = 10;
//
////        if (x <= 10) System.out.println("hallo zusammen!");
//
//        System.out.println("x before if: " + x);
//
//        if (x == 10) {
//            x = x - 1;
//            System.out.println("x in if: " + x);
//        }
//
//        System.out.println("x after if: " + x);
//
//        System.out.println("--------------------");

        /*
        необходимо написать программк,
        где бы пользователю предлагалось
        ввести число 1.
        Если ввел число 1, то программа должна вывести сообщение: "Вы ввели число 1"
         */

//        Scanner scanner = new Scanner(System.in);
//
//        int temp = 3;
//
//        System.out.println("Введите что-нибудь");
//        String stringInput = scanner.nextLine();
//        System.out.println("String : " + stringInput + 1000);
//
//        int parseInt = Integer.parseInt(stringInput);
//        System.out.println("int : " + (parseInt + 1000));
//
//        System.out.println("Enter number 1: ");
//        int userInputInt = scanner.nextInt();
//        if (userInputInt == 1) {
//            System.out.println("You entered number 1");
//        } else if (userInputInt == 3 && temp != 3) {
//            System.out.println("you entered 3, and temp = 3");
//        } else if (userInputInt == 3 && temp == 3) {
//            System.out.println("you entered 3, and temp = 3");
//        } else if (userInputInt == 5) {
//            System.out.println("you entered 5, not 1");
//        } else {
//            System.out.println("you entered something else");
//        }
//
//        System.out.println("exit from if");
//
//
//
        System.out.println("-------------------");


        Random random = new Random();
        int money = 100;
        int note = random.nextInt(5);

        //int note = 3;
        System.out.println("ozenka: " + note);

        if (note == 5) {
            money += 20;
        } else if (note == 4) {
            money += 10;
        } else if (note == 3) {

        } else if (note == 2) {
            money -= 20;
        } else if (note == 1) {
            money = 0;
        } else {
            System.out.println("poluchena nekorrektnaya ozenka!");
        }

        System.out.println("u rebenka ostalos' : " + money + " monet");

        System.out.println("_______________");

        int var1 = 10;
        int var2 = var1 == 10 ? 20 : var1 - 4;
        System.out.println((var1 == 0) ? " equals null " : "not equals null");
       // System.out.println("var2: " + var2);

        if (var1 > 10) {
            var2 = 20;
        } else {
            var2 = 0;
        }


    }
}

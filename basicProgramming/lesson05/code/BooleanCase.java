import java.sql.SQLOutput;

public class BooleanCase {
    public static void main(String[] args) {

        int a = 5;
        int b = 10;
        boolean boll = true;
        boolean boll1 = false;
        boolean b1 = (a == b);
        System.out.println(b1);

        boolean b2 = (a != b);
        System.out.println(b2);

        System.out.println(b != 10);

        boolean b3 = a > b;
        boolean b4 = a < b;
        boolean b5 = b > 10;
        System.out.println("b3: " + b3 + " b4: " + b4 + " b5: " + b5);

        boolean b6 = a >= b;
        boolean b7 = a <= b;
        boolean b8 = b >= 10;
        System.out.println("b6: " + b6 + " b7: " + b7 + " b8: " + b8);


        System.out.println();
        System.out.println("==================");
        System.out.println("=== != ======");

        boolean bol = !(2 > 5);
        System.out.println(bol);
        System.out.println(!true);
        boolean var = 3 != 4; //true
        var = !(3 != 4); // false
        System.out.println("var " + var);
        System.out.println(!(3 != 4));


        System.out.println("==== & ====="); // логическое и
        // boolean var1 = "Rome is the capital of Italy" & "Berlin is the capital of Germany";
        boolean var1 = true & true;
        System.out.println(var1);
        var1 = (2 < 5) & (10 != 11);
        System.out.println(var1);
        var1 = (2 < 5) & (10 == 11);
        System.out.println(var1);

        System.out.println("===== | ====="); //логическое или
        boolean var2 = true | false;
        System.out.println("var2 " + var2);
        var2 = (2 < 5) | (10 == 11);
        System.out.println(var2);
        System.out.println(false | false);

        System.out.println("===== ^ ====="); //лонмчское исключающее или

        boolean var3 = true ^ false;
        System.out.println("var3 " + var3);
        System.out.println(true ^ true);
        System.out.println(false ^ false);
        System.out.println(true ^ false);

        System.out.println("==== && ===="); // логическое сокращеное и
        boolean var11 = true && true;
        System.out.println(var11);
        var11 = (2 < 5) && (10 != 11);
        System.out.println(var11);
        var11 = (2 < 5) && (10 == 11);
        System.out.println(var11);
        //var11 = true && false;
        var11 = (5 > 6) && (5 * 24 / 7 >= 56 * 5655 - 6997);
        System.out.println(var11);

        System.out.println("-----");
        int x = 0;
        int y = 5;
        boolean b9 = (x != 0) && (y / x > 24);
        System.out.println("b9: " + b9);


        System.out.println("==== || ===="); // логическое сокращеное или
        boolean b10 = true || false;
        System.out.println("b10" + b10);


        System.out.println("============");
        System.out.println(true ^ true & false);
        System.out.println(true ^ false);
        System.out.println(true);

        System.out.println("+++");

        System.out.println(true ^ true && false);
        System.out.println(false && false);
        System.out.println(false);

        System.out.println("-------");
        boolean aa = true;
        boolean bb = false;
        int c = 25;
        int qq = 2;
        System.out.println((aa | bb) | (c < 100) & !(true) ^ (qq == 5));
        System.out.println((aa | bb) | (c < 100) & false ^ (qq == 5));
        System.out.println((aa | bb) | false ^ (qq == 5));
        System.out.println((aa | bb) | false);
        System.out.println(true);
        /*
        !
        &
        ^
        |
        &&
        ||
         */

        System.out.println("--------");
        System.out.println(true || false ^ true & !true);
        System.out.println(true || false ^ true & false);
        System.out.println(true || false ^ false);
        System.out.println(true || false);
        System.out.println(true);


    }
}

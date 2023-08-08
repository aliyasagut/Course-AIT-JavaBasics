public class CharSamples {
    public static void main(String[] args) {
        char a = 'A'; // переменная содержит лат букву А
        char с = 65; // переменная содержит лат букву А, тк 65 это А
        char b = 0x41; // переменная содержит лат букву А, тк 41 в 16 системе это А
        b = 0x0041;
        char d = '\u0041';
        char e = '\u2019';

        //System.out.println(a + " b: " + b + " c: " + с + " " + d + e);

        char ch = 'A';
        ch++; // ch = ch + 1
        //System.out.println(ch);

        ch = 97;
        System.out.println(ch);

        ch += 2;
        System.out.println(ch);

        int x=1;
        int y=5;
        x += y; // the same with *=, /=, -=, %= etc
        System.out.println(x);

        x %= y;
        System.out.println(x);

        x++; // x+1
        System.out.println(x);
    }
}

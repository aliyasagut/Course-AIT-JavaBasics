public class StringSamples {
    public static void main(String[] args) {
        String str = "Java";
        System.out.println(str);

        String str1 = new String("Java2");
        System.out.println(str1);

        String str2 = new String();
        System.out.println(str2);

        String str3 = "";
        System.out.println(str3);

        String str4 = new String(new char [] {'h', 'e', '1', '1', 'o'});
        System.out.println(str4);

        String str5 = "Hello, World!";
        int length = str5.length();
        System.out.println(str5 + " length: "+ length);

        str5 = str5.toUpperCase();
        System.out.println(str5);

        str5 = str5.toLowerCase();
        System.out.println(str5);

        System.out.println("+++++");
        String str6 = str5.concat(str);
        System.out.println(str6);

        str6 = str5 + " " + str;
        System.out.println(str6);

        str6 = String.join("\n", str5, str, str4);
        System.out.println("Join: " + str6);

        int d = 1234;
        String str7 = "Hello " + d;
        System.out.println(str7);

        String name = "John";
        System.out.println("My name is " + name);

        int age = 32;
        System.out.println("My age is " + age);

        String str8 = String.valueOf(d);
        System.out.println("str8 " + str8);

        String strNumbers = "01234567";
        System.out.println(strNumbers);
        System.out.println("length " + strNumbers.length());
        char firstChar = strNumbers.charAt(0);
        System.out.println("first char " + firstChar);

        char lastChar = strNumbers.charAt(strNumbers.length() - 1);
        System.out.println("last char " + lastChar);

        System.out.println("///////");

        String subString = strNumbers.substring(2);
        String subString2 = strNumbers.substring(2, 6); // [2, 6) 6 is not included
        System.out.println("strNumbers " + strNumbers);
        System.out.println("substring " + subString);
        System.out.println("subString2 " + subString2);

        System.out.println(str2.isEmpty());

        System.out.println(strNumbers.replace("123", "hello"));

        System.out.println("strNumbers " + strNumbers);

        String strTrim = " Java is great! ";
        System.out.println(strTrim.trim());
        System.out.println(strTrim);

    }
}

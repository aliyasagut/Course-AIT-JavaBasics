public class SwitchCase {

    public static void main(String[] args) {
        /*
    Необходимо написать программу,
    где бы пользователю предлагалось ввести число на выбор: 1, 2 или 3,
    а программа должна сказать, какое число ввёл пользователь: 1, 2, или 3
     */
//        System.out.println("===============================");
//        int x = 1;
//        switch (x) {
//            case 1: {
//                System.out.println("x = 1");
//                break;
//            }
//            case 2: {
//                System.out.println("x = 2");
//                break;
//            }
//            case 3: {
//                System.out.println("x = 3");
//                break;
//            }
//            default: {
//                System.out.println("x = something else");
//            }
//        }
//
//        // if (x == 1) System.out.println("if: x = 1");
//
//        System.out.println("===============================");
//        int myMoney = 100;
//        int incoming = 20;
//
//        System.out.println("before: My money : " + myMoney);
//
//        switch (incoming) {
//            case 0: {
//                myMoney += 5;
//                break;
//            }
//            case 10: {
//                myMoney += 25;
//                break;
//            }
//            case 20: {
//                myMoney += 75;
//                break;
//            }
//            default: {
//                myMoney += incoming;
//            }
//        }
//        System.out.println("after: My money : " + myMoney);
//
//        System.out.println("______ Zadachka________________");
//        System.out.println("Zeltiy, bolshoy, s rogami i polniy saizev");
//        System.out.println("Kakoi otvet?");
//
//        Scanner scanner = new Scanner(System.in);
//        String answer = scanner.nextLine();
//
//        char firstCharSubstring = answer.trim().toLowerCase().substring(1, 3).charAt(0);
//        System.out.println("my char " + firstCharSubstring);
//        answer = answer.trim().toLowerCase();
//
//        switch (answer) {
//            case "trolleybus":
//            case "trolleybus!": {
//                System.out.println("Pravil'no");
//                break;
//            }
//            case "ne znayu":
//            case "ne znayu!": {
//                System.out.println("Pravil'niy otvet: trolleybus!");
//                break;
//            }
//            default: {
//                System.out.println("ne pravil'no, poprobuy esho");
//            }
//        }

        /*
        Необходимо написать программу,
        где бы пользователю предлагалось ввести число на выбор: 1, 2 или 3,
        а программа должна сказать, какое число ввёл пользователь: 1, 2, или 3
        ксли 4 или 5, эир написвть
        результвт выводы чохранить
        */
        System.out.println("------------------------------");
        String result = "";

        int myChoice = 6;

        switch (myChoice) {
            case 1: {
                result = "vi vveli odin";
                break;
            }
            case 2: {
                result = "vi vveli dva";
                break;
            }
            case 3: {
                result = "vi vveli tri";
                break;
            }
            case 4:
            case 5: {
                result = "vi vveli 4 ili 5";
                break;
            }
            default: {
                result = "po umolchaniyu";
            }
        }
        System.out.println(result);

    }
}

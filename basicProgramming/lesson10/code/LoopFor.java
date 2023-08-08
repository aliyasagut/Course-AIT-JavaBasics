public class LoopFor {
    public static void main(String[] args) {
    /*
        for ([начальные значения] ; [условия] ; [изменение счетчика]) {
        тело цикла
        }
    */
        System.out.println("________while loop________");
        int j = 0;
        while (j < 10) {
            System.out.print(j + " ");
            j++;
        }
        System.out.println();
        System.out.println("________for loop__________");
        for (int i = 0; i < 10; i++) {
            System.out.print(i + " ");
        }
        System.out.println();

        for (int i = 0; i <= 100; i += 5) {
            System.out.print(i + " ");
        }

        System.out.println();
        System.out.println("____________________________");
        int i;
        i = 14;
        for (int a = 0; i >= 0; i--, a++) {         // вывести все числа от 10 до 0
            System.out.println(i + ": " + a);
        }

        System.out.println("_____распечатка массива________");
        int[] array = {5, 10, 43, 545, -10, -23, 0, 15};

//        for (int k = 0; k < array.length; k++) {
//            System.out.print(array[k] + " ");
//        }
//        System.out.println();
//        System.out.println("__________________");
//        for (int k = 5; k <= 20; k++) {
//            System.out.print(k + " ");
//        }

        int intForSearch = 545; // вывести на экран индекс элемента по заданному значению
        int index = -1;

        for (int k = 0; k < array.length; k++) {
            if (array[k] == intForSearch) {
                index = k;
                System.out.println("совпадение найдено");
                break;
                // continue;
            } else {
                System.out.println("число " + array[k] + " не равно " + intForSearch);
            }
        }
        System.out.println(index);

        // распечатать 10 раз цифры от 0 до 4
        System.out.println("___________________________");
        loop1: for (int k = 0; k < 10; k++) {
            System.out.print(k + ": ");
            for (int l = 0; l < 5; l++) {
                if (k == 3) break loop1;
                System.out.print(l + " ");
            }
            System.out.println();
        }

    }
}
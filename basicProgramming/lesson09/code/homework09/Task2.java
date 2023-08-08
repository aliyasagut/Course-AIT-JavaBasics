package homework09;

public class Task2 {
    /*
    Дан массив строк. Вывести на экран все символы из самой длинной строки массива
     */
    public static void main(String[] args) {
        String[] strings = {"monday", "tuesday", "wednesday", "thursday", "friday", "saturday", "sunday"};

        int counter = 0;
        int maxLength = 0;
        int indexOfMax = 0;

        while (counter < strings.length) {
            if (strings[counter].length() >= maxLength) {
                maxLength = strings[counter].length();
                indexOfMax = counter;
            }
            counter++;
        }
        System.out.println("maxLength " + maxLength + " indexOfMax " + indexOfMax);

        int strCounter = 0;
        while (strCounter < strings[indexOfMax].length() - 1) {
            System.out.println(strings[indexOfMax].charAt(strCounter));
            strCounter++;
        }
    }
}

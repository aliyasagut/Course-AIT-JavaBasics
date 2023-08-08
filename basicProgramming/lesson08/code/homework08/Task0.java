package homework08;

public class Task0 {
    /*
    Распечатать 10 строк: “Task1”. “Task2”. … “Task10”. Используем цикл while
     */
    public static void main(String[] args) {
        int i = 0;
        while (i < 10) {
            System.out.println("Task" + (i + 1));
            i++;
        }
        System.out.println("Cycle is finished");
    }
}

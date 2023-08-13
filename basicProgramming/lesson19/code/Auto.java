public class Auto {
    public void gas() {
        System.out.println("Авто едет вперед");
    }

    public void breakMe() {
        System.out.println("Автомобиль замедляется");
    }

    public static void main(String[] args) {
        Auto auto = new Auto();

        auto.gas();
        auto.breakMe();
    }
}

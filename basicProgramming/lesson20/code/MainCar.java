public class MainCar {

    private int noStatic = 10;
    static int staticInt = 20;


    public static void main(String[] args) {
        Car car = new Car("BMW", 200);
        Car car1 = new Car("Skada", 110);
        Car car2 = new Car("Seat", 120);

        System.out.println("Всего создано машин " + Car.numberOfCars);
        Car.showInfo();

        staticInt++;
//        noStatic++; / нет доступа к не статической переменной
        test();
//        testNotStatic(); / нет доступа к не статическому методу


    }

    static void test() {
        staticInt++;
//        noStatic++; / нет доступа к не статической переменной
    }

    public void testNotStatic() {
        staticInt++;
        noStatic++;
        test();
    }
}

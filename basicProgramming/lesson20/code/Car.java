public class Car {
    private String name;
    private int power;
    static int numberOfCars;

    public Car(String name, int power) {
        this.name = name;
        this.power = power;
        numberOfCars++;
    }

    public String getName() {
        return name;
    }

    public int getPower() {
        return power;
    }

    public int getNumberOfCars() {
        return numberOfCars;
    }

    static void showInfo() {
        System.out.println("Всего машин " + numberOfCars);
    }

}

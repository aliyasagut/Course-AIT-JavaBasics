public class StaticInitDemo {
    private static Car[] cars;
    public String[] strings;

    static {
        cars = new Car[3];
        Car car = new Car("BMW", 200);
        Car car1 = new Car("Tesla", 250);
        Car car2 = new Car("Sear", 300);
        cars[0] = car1;
        cars[1] = car;
        cars[2] = car2;
    }

    {
       strings = new String[4];
       strings[0] = "Hello";
       strings[1] = "World";
       strings[2] = strings[0] + ", " + strings[1];
    }

    public StaticInitDemo(){
//        initString(); тоже вариант инициализации полей начальным значениями
    }

    private void initString(){
        strings = new String[4];
        strings[0] = "Hello";
        strings[1] = "World";
        strings[2] = strings[0] + ", " + strings[1];
    }

    public void showAllCars(){
        System.out.println("Всего машин "+ cars.length);
        System.out.print("[");
        for (Car carCurrent : cars){
            System.out.print(carCurrent.getName() + ", ");
        }
        System.out.println("]\n");
    }

    public static void main (String[] args){
        StaticInitDemo staticDemo = new StaticInitDemo();
        staticDemo.showAllCars();
    }
}

public class Main23 {

    public static void main(String[] args) {

        Bus1 bus = new Bus1("Sprinter", 20);
        System.out.println(bus.toString());

        BusDriver driver = new BusDriver("Bob", 35);
        System.out.println(driver.toString());

        BusDriver driver1 = new BusDriver("John", 28);
        bus.setDriver(driver1);
        System.out.println(bus.toString());

        Bus1 bus1 = new Bus1("Vito", 12, driver1);

        System.out.println(bus1.toString());
        bus1.setDriver(driver);
        System.out.println(bus1.toString());

        bus.moveByDriver();
        bus1.moveByDriver();

        System.out.println("\n-------------------\n");
        System.out.println(bus.getAutoPilotInfo().toString());

        System.out.println("\n-------------------\n");
        bus.moveByAutopilot();
        bus.moveByDriver();



    }
}

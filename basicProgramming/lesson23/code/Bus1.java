public class Bus1 {

    private String model;
    private int id;
    private int capacity;
    static private int counterForId;
    private BusDriver driver; // Связь HAS-A с классом BusDriver, агрегация
    private final AutoPilot autoPilot; // Связь HAS-A с классом BusDriver, жесткая связь (композиция)

    public Bus1(String model, int capacity) {
        this.model = model;
        this.capacity = capacity;
        this.autoPilot = new AutoPilot("AP-001", this);
        this.id = counterForId++;
    }

    public Bus1(String model, int capacity, BusDriver driver) {
        this(model, capacity);
        this.driver = driver;
    }

    public BusDriver getDriver() {
        return driver;
    }

    public void setDriver(BusDriver driver) {
        this.driver = driver;
    }

    public String toString() {
        return "{ Bus Model: id " + id + "; model: " + model +
                "; capacity: " + capacity + "; Driver: " +
                (driver == null ? "no driver" : driver.toString()) +
                "; Autopilot " + autoPilot.toString() + " }";
    }

    public void moveByDriver() {
        // Проверяем по статусу включен ли автопилот
        if(autoPilot.isActive()){
            autoPilot.turnOff();
        }
        // водителю передается команда управлять автобусом
        driver.driveBus(this);
    }

    public void moveByAutopilot(){
        autoPilot.dribeBus();
    }

    public String getAutoPilotInfo() {
        return autoPilot.toString();
    }

    public String getModel() {
        return model;
    }

    public int getId() {
        return id;
    }

    public int getCapacity() {
        return capacity;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

}

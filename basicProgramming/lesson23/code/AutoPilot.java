import java.util.Arrays;

public class AutoPilot {
    private final int id;
    private String model;
    private boolean isActive; //false
    private final Bus1 bus;

    static int counter;

    public AutoPilot(String model, Bus1 bus) {
        this.model = model;
        this.bus = bus;
        this.id = counter++;
    }

    public void dribeBus() {
        turnOn();
        System.out.println("{ Autopilot: id " + id + "; Model: " + model +
                " управляет автобусом " + bus.getId() + " " + bus.getModel()+ "  }");
    }

    public void turnOff() {
        isActive = false;
        System.out.println("Автопилот " + id + " выключен");
    }

    public void turnOn() {
        isActive = true;
        System.out.println("Автопилот " + id + " включен");
    }

    public int getId() {
        return id;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public boolean isActive() {
        return isActive;
    }

    public void setActive(boolean active) {
        isActive = active;
    }

    public Bus1 getBus() {
        return bus;
    }

    public String toString() {
        return "{ AutoPilot id " + id + "; Model: " + model +
                "; встроен в автобус id " + bus.getId() + " }";
    }
}

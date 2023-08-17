import java.util.Arrays;

public class BusDriver {
    private int id;
    private String name;
    private String[] categories;
    private int age;

    static private int counter;

    public BusDriver(String name, int age) {
        this.name = name;
        this.age = age;
        this.categories = new String[1];
        categories[0] = "B";
        this.id = counter++;
    }

    public String toString() {
        return "{ Driver: id " + id + "; Name: " + name +
                "; category: " + Arrays.toString(categories) + " }";
    }

    public void driveBus(Bus1 bus) {
        System.out.println("Водитель " + name +
                "; id " + id +
                " управляет автобусом id " + bus.getId() +
                " " + bus.getModel());
    }

    public void adCategories(String categories) {
        //TODO
    }

    public void removeCategories(String category) {
        //TODO
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String[] getCategories() {
        return categories;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }


}

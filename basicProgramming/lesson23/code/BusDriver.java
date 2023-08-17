import java.util.Arrays;

public class BusDriver {
    private int id;
    private String name;
    private RubberArrayString categories;
    private int age;

    static private int counter;

    public BusDriver(String name, int age) {
        this.name = name;
        this.age = age;
        this.categories = new RubberArrayString();
        this.categories.add("B");
//        categories[0] = "B";
        this.id = BusDriver.counter++;
    }

    public String toString() {
        return "{ Driver: id " + id + "; Name: " + name +
                "; category: " + Arrays.toString(categories.toArray()) + " }";
    }

    public void driveBus(Bus1 bus) {
        System.out.println("Водитель " + name +
                "; id " + id +
                " управляет автобусом id " + bus.getId() +
                " " + bus.getModel());
    }

    public void addCategory(String category) {
        if (categories.searchByValue(category) == -1) {
            categories.add(category);
        }
    }

    public void removeCategories(String category) {
        categories.deleteAllByValue(category);
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
        return categories.toArray();
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }


}

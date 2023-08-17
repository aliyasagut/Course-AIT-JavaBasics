public class Vehicle {

    private String model;
    private int yearOfManufacture;
    private final int id;
    static private int globalCounter;

    public Vehicle(String model, int yearOfManufacture) {
        this.model = model;
        this.yearOfManufacture = yearOfManufacture;
        this.id = globalCounter++;
//        globalCounter++;
    }

    public int getId(){
        return id;
    }
    public String getModel() {
        return model;
    }

    public int getYearOfManufacture() {
        return yearOfManufacture;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public void setYearOfManufacture(int yearOfManufacture) {
        this.yearOfManufacture = yearOfManufacture;
    }

    public String toString() {
        return "{Id: "+ id + "; Model: " + model + "; Year of Manufacture: " + yearOfManufacture + "}";
    }

    public void gas() {
        System.out.println("Я ускоряюсь!");
    }

    public void breaking() {
        System.out.println("Я замедляюсь!");
    }
}

package homework16;

public class Doctor {
    String name;
    String specialisation;
    int experienceInYears;
    String recommendation;
    int averageRating;
    int price;

    public Doctor(String fullName, String specialisation) {
        this.name = fullName;
        this.specialisation = specialisation;
    }

    public Doctor(String fullName, int rate, int price) {
        this.name = fullName;
        this.averageRating = rate;
        this.price = price;

    }

    void consult() {
        System.out.println("I am consulting");
    }

    void operate() {
        System.out.println("I can do operation");
    }

    void doVaccine() {
        System.out.println("I am doing vaccine");
    }

    void improveQualification() {
        System.out.println("I am learning all the time");
    }
}

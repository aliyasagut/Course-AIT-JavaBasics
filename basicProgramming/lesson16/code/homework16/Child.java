package homework16;

public class Child {
    int age;
    String name;
    String gender;
    String status;
    int height;
    int weight;

    public Child(String name, String gender, int age) {
        this.name = name;
        this.gender = gender;
        this.age = age;
    }

    public Child(String name, int height, int weight, int age) {
        this.name = name;
        this.height = height;
        this.weight = weight;
        this.age = age;

    }

    void play() {
        System.out.println("I am playing");
    }

    void sleep() {
        System.out.println("I am sleeping...");
    }

    void eat() {
        System.out.println("I am eating");
    }

    void scream() {
        System.out.println("Oooo-aaaaa-uuu-eeeeee");
    }
}

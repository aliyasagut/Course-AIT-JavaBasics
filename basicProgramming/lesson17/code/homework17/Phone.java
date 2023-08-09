package homework17;

public class Phone {
    String number;
    String model = "";
    int weight;

    public Phone(String number, String model, int weight) {
        this(number, model);
        this.weight = weight;
    }

    public Phone(String number, String model) {
        this.number = number;
        this.model = model;
    }

    public Phone() {
    }
    String whoIAm(){
        return "Number - " + number + "; Model - " + model + "; weight - " + weight;
    }

    void receiveCall(String name) {
        System.out.println(name + " is calling!");
    }

    void receiveCall(String name, int number){
        System.out.println(name + " is calling from the number " + number);
    }

    String getNumber() {
        return number;
    }

}

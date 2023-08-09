public class Katze {
    String name;
    int weight;

    public Katze(String name, int weight) {
        this.name = name;
        this.weight = weight;
    }

    void startTraining(int laps) {
        System.out.println("Start training with " + laps + " laps!");

        for (int i = 0; i < laps; i++) {
            System.out.println("Round # " + (i + 1));
            run();
        }
        System.out.println("///end of training///");
    }

    void run() {
        while (weight <= 2) {
            System.out.println("I am too tired, can't run. My weight is " + weight);
            eat();
            System.out.println("My weight after eating " + weight);
        }
        System.out.println("I am running");
        weight -=2;
    }

    void eat() {
        System.out.println("I am eating");
        weight++;
    }

    void whoAmI() {
        System.out.println("I am " + name + ". I am " + weight);
    }


}

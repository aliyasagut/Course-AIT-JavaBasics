public class MainKatze {
    public static void main(String[] args) {

        System.out.println("----- Katze case -----");

        Katze cat = new Katze("Max", 5);
//        cat.whoAmI();
//        cat.eat();
//        cat.whoAmI();
//        cat.run();
//        cat.whoAmI();

        cat.startTraining(10);
        cat.whoAmI();

        System.out.println("----- Dog case -----");
        Dog dog = new Dog("Jack", 150);
        dog.whoAmI();

//        dog.startTraining(10);

    }
}
package homework20;

public class MainDog3 {
    public static void main(String[] args) {
        System.out.println("==== Dog 1 Barbos ====");

        Dog3 dog1 = new Dog3("Barbos", 50);

        dog1.setName("Ted");
        dog1.setJumpHeight(100);
        dog1.setIncreaseByTraining(15);

        dog1.whoAmI();

        System.out.println("My max jump height: " + dog1.getMaxJumpHeight());

        for (int i = 0; i < 7; i++) {
            dog1.training();
        }

        dog1.getBarrier(90);

//        System.out.println("Jump height: " + dog1.jumpHeight);
//        System.out.println("Max jump height: " + dog1.maxJumpHeight);


        System.out.println("==== Dog Rex ====");

        Dog3 dog = new Dog3("Rex", 150);

//        System.out.println(dog.jumpHeight);
//        System.out.println(dog.maxJumpHeight);

        int[] barriers = {120, 150, 180, 280, 350, 50, 400, 300, 320, 10};
        int counter = 0;
        for (int barrier : barriers) {
            if (dog.getBarrier(barrier)) counter++;
        }
        System.out.println("I have jumped " + counter + " times!");

        System.out.println("_________________________");
        Dog3.getCounterOfJumps();
    }
}

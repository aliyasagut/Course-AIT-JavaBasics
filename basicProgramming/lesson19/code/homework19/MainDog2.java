package homework19;

public class MainDog2 {
    public static void main(String[] args) {
        System.out.println("==== Dog 1 Barbos ====");

        Dog2 dog1 = new Dog2("Barbos", 50);

        dog1.setName("Ted");
        dog1.setJumpHeight(100);
        dog1.setIncreaseByTraining(15);

        dog1.whoAmI();

        System.out.println("My max jump height: " + dog1.getMaxJumpHeight());

        for (int i = 0; i < 7; i++) {
            dog1.training();
        }

//        System.out.println("Jump height: " + dog1.jumpHeight);
//        System.out.println("Max jump height: " + dog1.maxJumpHeight);


        System.out.println("==== Dog Rex ====");

        Dog2 dog = new Dog2("Rex", 150);

//        System.out.println(dog.jumpHeight);
//        System.out.println(dog.maxJumpHeight);

        int[] barriers = {120, 150, 180, 280, 350, 50, 400, 300, 320, 10};
        int counter = 0;
        for (int barrier : barriers) {
            if (dog.getBarrier(barrier)) counter++;
        }
        System.out.println("I have jumped " + counter + " times!");
    }
}
